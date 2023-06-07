package com.knot.Basket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="BASKETTABLE1")
public class BasketTable {
	
	@Id
	@GeneratedValue
	@Column(name="SHBSKTID")
	private Long shbsktId;
	
	@Column(name="SHKEY")
	private String shKey;
	
	@Column(name="SHBSKTKEY")
	private String shbsktKey;
	
	@Column(name="SHBSKTLEGACYID")
	private String shbsktLegacyId;
	
	@Column(name="SHBSKTSTATUS")
	private String shbsktStatus;
	
	@Column(name="SHDATECREATED")
	private String shdateCreated;
			
	@Column(name="SHCREATEDBY")
	private String shdateCreatedBy;
}
