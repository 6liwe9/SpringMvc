package test.liwe.contorller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public final class UploadPicController {
	@RequestMapping(value = "upload.action", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> upload(HttpServletRequest request, @RequestParam("description") String description,
			@RequestParam("file") List<MultipartFile> fileList) throws Exception {

		System.out.println(description);
		for(MultipartFile file:fileList) {
		// 如果文件不为空，写入上传路径
		if (!file.isEmpty()) {
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
		}
		}return null;
			

	}

	@RequestMapping(value = "upload1.action", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> upload1(HttpServletRequest request, @RequestParam("description") String description)
			throws Exception {

		System.out.println(description);
		return null;

	}
}
