package com.winstar.domain.objecttype;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLDescription;
import com.oembedler.moon.graphql.engine.stereotype.GraphQLField;
import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import java.util.Date;

/**
 * illegal
 *
 * @author gradle
 */
@GraphQLObject("Illegal")
public class Illegal {
    /**
     * 序号
     */
    @GraphQLDescription("违法序号")
    private String serialNumber;

    /**
     * 违法编号
     */
    private String number;
    /**
     * 车牌号码
     */
    private String plateNumber;
    /**
     * 发动机号
     */
    private String engineNumber;
    /**
     * 号牌类型
     */
    private String plateNumberType;
    /**
     * 违章行为
     */
    private String action;
    /**
     * 违法行为编号
     */
    private String actionCode;
    /**
     * 违章地点
     */
    private String place;
    /**
     * 违章时间
     */
    private Date createdAt;
    /**
     * 违章扣分
     */
    private Integer dockPoints;
    /**
     * 罚款金额
     */
    private Double penaltyAmount;
    /**
     * 违章状态(0:未裁决未缴费 1:已裁决未缴费 2:已裁决已缴费)
     */
    private Integer status;

    /**
     * 裁决书编号
     */
    private String awardNumber;
    /**
     * 证件编号
     */
    private String certificateNumber;
    /**
     * 证件类型 (A:驾驶证)
     */
    private String certificateType;
    /**
     * 当事人
     */
    private String litigant;
    /**
     * 滞纳金
     */
    private Double leeFee;
    /**
     * 处理机关
     */
    private String awardOrgan;
    /**
     * 裁决日期
     */
    private Date awardAt;

    /**
     * 解锁日期
     */
    private Date unlockAt;

    /**
     * 平台能处理:0 能处理　１　不能处理(本地车辆异地违法异地裁决)
     */
    private Integer handleStatus;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getPlateNumberType() {
        return plateNumberType;
    }

    public void setPlateNumberType(String plateNumberType) {
        this.plateNumberType = plateNumberType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDockPoints() {
        return dockPoints;
    }

    public void setDockPoints(Integer dockPoints) {
        this.dockPoints = dockPoints;
    }

    public Double getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(Double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getLitigant() {
        return litigant;
    }

    public void setLitigant(String litigant) {
        this.litigant = litigant;
    }

    public Double getLeeFee() {
        return leeFee;
    }

    public void setLeeFee(Double leeFee) {
        this.leeFee = leeFee;
    }

    public String getAwardOrgan() {
        return awardOrgan;
    }

    public void setAwardOrgan(String awardOrgan) {
        this.awardOrgan = awardOrgan;
    }

    public Date getAwardAt() {
        return awardAt;
    }

    public void setAwardAt(Date awardAt) {
        this.awardAt = awardAt;
    }

    public Date getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(Date unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }
}
