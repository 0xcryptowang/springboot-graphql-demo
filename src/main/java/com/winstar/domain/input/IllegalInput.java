package com.winstar.domain.input;

/**
 * illegal input
 *
 * @author gradle
 */
public class IllegalInput {
    /**
     * 车牌号码
     */
    private String plateNumber;
    /**
     * 发动机号
     */
    private String engineNumber;

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
}
