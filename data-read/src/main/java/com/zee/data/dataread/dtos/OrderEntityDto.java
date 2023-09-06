package com.zee.data.dataread.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderEntityDto {


	private String orderId;

	private String orderNumber;

	private String customer_first_name;

	private String customer_last_name;

	private String customer_contactno;

	private String customer_alternateno;

	private String email;

	private String customer_address1;

	private String customer_address2;

	private String landmark;

	private String district;

	private String state;

	private String country;

	private String pincode;

	private String channel_name;

	private String cc_name;

	private String agentname;

	private String paymode;

	private String orderstatus;

	private Timestamp order_status_date;

	private String statusRemark;

	private Timestamp shipped_date;

	private String returnAWB;

	private Timestamp createDate;

	private Timestamp modiDate;

	private String deleted;

	private BigDecimal orderPayablePrice;

	private BigDecimal orderMrpSum;

	private BigDecimal shipCharge;

	private Timestamp payDate;

}