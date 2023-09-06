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
@Table(name = "octapot")
public class OrderEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "POTRFNUM")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String orderId;

	@Column(name = "POTNUMBER")
	private String orderNumber;

	@Column(name = "POTBUYERFNAME")
	private String customer_first_name;

	@Column(name = "POTBUYERLNAME")
	private String customer_last_name;

	@Column(name = "POTBILLMOBILE")
	private String customer_contactno;

	@Column(name = "POTALTMOBILE")
	private String customer_alternateno;

	@Column(name = "POTBILLINGEMAIL")
	private String email;

	@Column(name = "POTBILLADDR1")
	private String customer_address1;

	@Column(name = "POTBILLADDR2")
	private String customer_address2;

	@Column(name = "LANDMARK")
	private String landmark;

	@Column(name = "POTBILLCITYNAME")
	private String district;

	@Column(name = "POTBILLSTATENAME")
	private String state;

	@Column(name = "POTBILLCOUNTRYNAME")
	private String country;

	@Column(name = "POTBILLZIP")
	private String pincode;

	@Column(name = "POTORDERCHANNEL")
	private String channel_name;

	@Column(name = "POTCALLCENTERNAME")
	private String cc_name;

	@Column(name = "POTCALLCENTERAGENTNAME")
	private String agentname;

	@Column(name = "POTPAYMODETYPENAME")
	private String paymode;

	@Column(name = "POTSMTNAME")
	private String orderstatus;

	@Column(name = "POTSTATUSUPDATEDATE")
	private Timestamp order_status_date;

	@Column(name = "POTREMARK")
	private String statusRemark;

	@Column(name = "POTSHIPDATE")
	private Timestamp shipped_date;

	@Column(name = "POTRETURNAWB")
	private String returnAWB;

	@Column(name = "CREATEDATE")
	private Timestamp createDate;

	@Column(name = "MODIDATE")
	private Timestamp modiDate;

	@Column(name = "DELETED")
	private String deleted;

	@Column(name = "POTNETPAYAMT")
	private BigDecimal orderPayablePrice;

	@Column(name = "POTGROSSCARTPRICE")
	private BigDecimal orderMrpSum;

	@Column(name = "POTSHIPCHARGE")
	private BigDecimal shipCharge;

	@Column(name = "POTPAYDATE")
	private Timestamp payDate;

}