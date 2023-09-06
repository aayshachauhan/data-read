package com.zee.data.dataread.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "octapst")
public class SubOrderEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PSTRFNUM")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subOrderId;

	@Column(name = "PSTPOTRFNUM")
	private String orderNumber;

	@Column(name = "PSTNUMBER")
	private String subOrderNumber;

	@Column(name = "PSTPILSKU")
	private String sku;

	@Column(name = "PSTPILNAME")
	private String productName;

	@Column(name = "PSTWEIGHT")
	private String weight;

	@Column(name = "PSTQTY")
	private Long quantity;

	@Column(name = "PSTITEMMRP")
	private BigDecimal itemMrp;

	@Column(name = "PSTITEMPRICE")
	private BigDecimal itemSalePrice;

	@Column(name = "PSTSHIPCHARGE")
	private BigDecimal shipCharge;

	@Column(name = "PSTPAYABLEPRICE")
	private BigDecimal payablePrice;

	@Column(name = "PSTCOURIERNAME")
	private String courierName;

	@Column(name = "PSTEXPECTEDDELIVERY")
	private Timestamp assuredDeliveryTime;

	@Column(name = "CREATEDATE")
	private Timestamp createDate;

	@Column(name = "MODIDATE")
	private Timestamp modiDate;

	@Column(name = "DELETED")
	private String deleted;

	@Column(name = "PSTSHIPDATE")
	private Timestamp shipDate;

	@Column(name = "netWeight")
	private String netWeight;

	@Column(name = "grossWeight")
	private String grossWeight;

	@Column(name = "packQty")
	private String packQty;

	@Column(name = "PSTDATAFLAG")
	private String pstDataFlag;
}