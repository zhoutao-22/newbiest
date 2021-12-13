package com.newbiest.mms.model;

import com.newbiest.base.model.NBHis;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by wangxinqi
 */
@Entity
@Table(name="GC_FUTURE_HOLD_CONFIG_HIS")
@Data
public class FutureHoldConfigHis extends NBHis {

    public static final String SCM_ADD = "SCMADD";
    public static final String SCM_DELETE = "SCMDELETE";
    public static final String HOLD_DELETE = "HoldDelete";

    /**
     * LotId
     */
    @Column(name = "LOT_ID")
    private String lotId;

    /**
     * HOLD原因
     */
    @Column(name="HOLD_REASON")
    private String holdReason;

    /**
     * 产品类别
     */
    @Column(name = "PRODUCT_AREA")
    private String productArea;

    /**
     * 接收来源
     */
    @Column(name = "RECEIVE_TYPE")
    private String receiveType;
}
