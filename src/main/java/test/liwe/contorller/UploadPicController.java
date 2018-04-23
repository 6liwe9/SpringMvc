package test.liwe.contorller;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

@Controller
@RequestMapping("/")
public final class UploadPicController {
	Gson gosn=new Gson();
	@RequestMapping(value = "upload.action", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> upload(HttpServletRequest request, @RequestParam("description") String description,
			@RequestParam("file") List<MultipartFile> fileList)  {

		HashMap ret= new HashMap<String,String>();
		for (MultipartFile file : fileList) {
			// 如果文件不为空，写入上传路径
			if (!file.isEmpty()) {
				try {
				// 上传文件路径
				String path = request.getServletContext().getRealPath("/images/");
				// 上传文件名
				String filename = file.getOriginalFilename();
				File filepath = new File(path, filename);
				// 判断路径是否存在，如果不存在就创建一个
				if (!filepath.getParentFile().exists()) {
					filepath.getParentFile().mkdirs();
				}
				// 将上传文件保存到一个目标文件当中
				file.transferTo(new File(path + File.separator + filename));
				}catch(Exception e) {
					
					ret.put("done", "false");
					ret.put("errorMsg", e.getMessage());
					return ret;
				}
			}
		}
		return null;

	}
	@RequestMapping("wx_upload.do")
	@ResponseBody
	public  Map<String, String> wx_upload(HttpServletRequest request,@RequestParam("file") List<MultipartFile> fileList, HttpServletResponse response) throws Exception {
		HashMap ret= new HashMap<String,String>();
		for (MultipartFile file : fileList) {
			// 如果文件不为空，写入上传路径
			if (!file.isEmpty()) {
				try {
				// 上传文件路径
				String path = request.getServletContext().getRealPath("/wximages/");
				// 上传文件名
				String filename = file.getOriginalFilename();
				File filepath = new File(path, filename);
				// 判断路径是否存在，如果不存在就创建一个
				if (!filepath.getParentFile().exists()) {
					filepath.getParentFile().mkdirs();
				}
				
				// 将上传文件保存到一个目标文件当中
				file.transferTo(new File(path + File.separator + filename));
				ret.put("done", "true");
				return ret;
				}catch(Exception e) {
					ret.put("done", "false");
					ret.put("errorMsg", e.getMessage());
					return ret;
				}
			}
		}
		return null;

	 
	    
	}
	@RequestMapping(value = "wx_cover.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> getCover(HttpServletRequest request)
			throws Exception {
		Map<String,String> ret=new ConcurrentHashMap<String,String>();
		String url=request.getScheme()+"://"+request.getServerName()+request.getContextPath()+"/wximages/test1.jpg";
		ret.put("imageUrl", url);
		return ret;

	}
	@RequestMapping(value = "wx_image.do", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getImage(HttpServletRequest request)
			throws Exception {
		
		Map<String,Object> ret=new ConcurrentHashMap<String,Object>();
		List<String> urls=new ArrayList<String>();
		for(int i=1;i<8;i++) {
			String url=request.getScheme()+"://"+request.getServerName()+"/wximages/"+i+".jpg";
			urls.add(url);
		}
		ret.put("imageUrl", urls);
		return ret;

	}
}
