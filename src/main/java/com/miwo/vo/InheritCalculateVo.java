package com.miwo.vo;

public class InheritCalculateVo {
	String fatherType;

	String motherType;
	public String getFatherType() {
		return fatherType;
	}
	public void setFatherType(String fatherType) {
		this.fatherType = fatherType;
	}
	public String getMotherType() {
		return motherType;
	}
	public void setMotherType(String motherType) {
		this.motherType = motherType;
	}
	public boolean isUseGender() {
		return useGender;
	}
	public void setUseGender(boolean useGender) {
		this.useGender = useGender;
	}
	boolean useGender;
}
