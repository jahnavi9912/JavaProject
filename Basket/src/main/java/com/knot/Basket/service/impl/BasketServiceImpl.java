package com.knot.Basket.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Basket.dao.BasketDAO;
import com.knot.Basket.dto.BasketDTO;
import com.knot.Basket.model.BasketTable;
import com.knot.Basket.service.BasketService;

@Service
public class BasketServiceImpl implements BasketService{

	@Autowired
	private BasketDAO bsktdao;
	
	@Autowired
	ModelMapper modelmap;
	
	@Override
	public BasketDTO getBasketDetailsById(Long shbsktId) 
	{
    BasketTable bT=bsktdao.findByShbsktId(shbsktId);
    
    
    BasketDTO bsket=this.modelmap.map(bT, BasketDTO.class);
   
	return bsket;
	}
}