package com.knot.Basket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.knot.Basket.dto.BasketDTO;
import com.knot.Basket.model.BasketTable;
import com.knot.Basket.service.BasketService;

@RequestMapping("/bskt")
@RestController
public class BasketController {

	@Autowired
	BasketService bsktservice;

	@GetMapping(value = "/getById")
	public BasketDTO getBasketDetailsById(@RequestParam("shbsktId") Long shbsktId) {
		BasketDTO basketdto = new BasketDTO();
		basketdto = bsktservice.getBasketDetailsById(shbsktId);
		return basketdto;
	}
	
	// This controller is BasketController. Using to test GITHUB.
	// Written from GIT Bash.
	//
	// This is to check this changes are reflecting in subbranch`
}
