package com.iemr.mmu.data.benFlowStatus;

public class I_bendemographics {

	private Integer districtId;
	private String districtName;

	private Integer districtBranchID;
	private String districtBranchName;

	private Integer servicePointID;
	private String servicePointName;

	public Integer getServicePointID() {
		return servicePointID;
	}

	public void setServicePointID(Integer servicePointID) {
		this.servicePointID = servicePointID;
	}

	public String getServicePointName() {
		return servicePointName;
	}

	public void setServicePointName(String servicePointName) {
		this.servicePointName = servicePointName;
	}

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Integer getDistrictBranchID() {
		return districtBranchID;
	}

	public void setDistrictBranchID(Integer districtBranchID) {
		this.districtBranchID = districtBranchID;
	}

	public String getDistrictBranchName() {
		return districtBranchName;
	}

	public void setDistrictBranchName(String districtBranchName) {
		this.districtBranchName = districtBranchName;
	}

}