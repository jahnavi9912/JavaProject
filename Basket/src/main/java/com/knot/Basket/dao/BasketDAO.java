package com.knot.Basket.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knot.Basket.dto.BasketDTO;
import com.knot.Basket.model.BasketTable;

@Repository
@Transactional
public interface BasketDAO extends JpaRepository<BasketTable, Long> {
	
	public BasketTable findByShbsktId(Long shbsktId);

}
