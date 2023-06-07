package com.knot.Basket.service;

import com.knot.Basket.dto.BasketDTO;
import com.knot.Basket.model.BasketTable;

public interface BasketService {
	
	public BasketDTO getBasketDetailsById(Long shbsktId);

}
