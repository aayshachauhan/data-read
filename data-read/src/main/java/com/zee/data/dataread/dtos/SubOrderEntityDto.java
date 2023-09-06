package com.zee.data.dataread.dtos;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubOrderEntityDto {

	private Long subOrderId;

	private List<OrderEntityDto> pstOrder;

	private String orderNumber;

	private String subOrderNumber;

	private String sku;

	private String productName;

	private String weight;

	private Long quantity;

	private BigDecimal itemMrp;

	private BigDecimal itemSalePrice;

	private BigDecimal shipCharge;

	private BigDecimal payablePrice;

	private String courierName;

	private Timestamp assuredDeliveryTime;

	private Timestamp createDate;

	private Timestamp modiDate;

	private String deleted;

	private Timestamp shipDate;

	private String netWeight;

	private String grossWeight;

	private String packQty;

	private String advance;

	private String delCharge;

	private String billMade;

	private String billBy;

	private String billDate;

	private String callMode;

	private String docketNumber;

	private String distributor_User_Name;

	private String orderNewRemark;

	private String edpBy;

	private String edpentryDate;

	private String ocStatus;

	private String outCall_FName;

	private String outCall_Remark;

	private String outCall_Date;

	private String avStatus;

	private String avId;

	private String av_FName;

	private String av_Remark;

	private String av_Date;

	private String qcStatus;

	private String qc_FName;

	private String qc_Remark;

	private String qc_date;

	private String disposition_Name;

	private String date_Of_Registrartion;

	private String order_Assign_date;

	private String dispositionId;

	private String sub_Im_Name;

	private String rtoDate;

	private String rtoStatus;

	private String rto_date;
	private String order_rto_status;
	private String cancel_date;
	private String order_cancel_status;
	private String del_date;
	private String order_del_status;
	private String onback;
	private String warehouse;
	private String carrier_branch_id;
	private String PrepaidOrder;

}