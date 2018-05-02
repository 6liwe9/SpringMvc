package com.miwo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miwo.dao.SaleMapper;
import com.miwo.dao.TakeawayMapper;
import com.miwo.model.Sale;
import com.miwo.model.SaleExample;
import com.miwo.model.Takeaway;
import com.miwo.model.TakeawayExample;
import com.miwo.model.TakeawayExample.Criteria;

@Service
public class SaleService {
	@Autowired
	SaleMapper saleMapper;
	public boolean insertTakeAway(Long articleId) {
		Sale sale=new Sale();
		sale.setArticleId(articleId);
		return saleMapper.insert(sale)==1;
	}
	public List<Long> getSaleItem(){
		SaleExample example=new SaleExample();
		List<Sale> retList=saleMapper.selectByExample(example);
		List<Long> ret=new ArrayList<Long>();
		for(Sale t:retList) {
			ret.add(t.getArticleId());
		}
		return ret;
	}
}
