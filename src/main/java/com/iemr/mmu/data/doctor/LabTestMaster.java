package com.iemr.mmu.data.doctor;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
@Entity
@Table(name = "m_labtests")
public class LabTestMaster {
	@Id
	@GeneratedValue
	@Expose
	@Column(name = "TestID")
	private Integer testID;
	@Expose
	@Column(name = "TestName")
	private String testName;
	@Expose
	@Column(name = "TestDesc")
	private String testDesc;
	@Expose
	@Column(name = "IsRadiologyImaging")
	private Boolean isRadiologyImaging;
	@Expose
	@Column(name = "Deleted", insertable = false, updatable = false)
	private Boolean deleted;
	@Expose
	@Column(name = "Processed", insertable = false, updatable = false)
	private Character processed;
	@Expose
	@Column(name = "CreatedBy")
	private String createdBy;
	@Expose
	@Column(name = "CreatedDate", insertable = false, updatable = false)
	private Timestamp createdDate;
	@Expose
	@Column(name = "ModifiedBy")
	private String modifiedBy;
	@Expose
	@Column(name = "LastModDate", insertable = false, updatable = false)
	private Timestamp lastModDate;

	public LabTestMaster() {
	}

	public LabTestMaster(Integer testID, String testName, String testDesc, Boolean isRadiologyImaging, Boolean deleted,
			Character processed, String createdBy, Timestamp createdDate, String modifiedBy, Timestamp lastModDate) {
		super();
		this.testID = testID;
		this.testName = testName;
		this.testDesc = testDesc;
		this.isRadiologyImaging = isRadiologyImaging;
		this.deleted = deleted;
		this.processed = processed;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModDate = lastModDate;
	}
	
	public LabTestMaster(Integer testID, String testName, String testDesc, Boolean isRadiologyImaging) {
		super();
		this.testID = testID;
		this.testName = testName;
		this.testDesc = testDesc;
		this.isRadiologyImaging = isRadiologyImaging;
	}

	public static ArrayList<LabTestMaster> getLabTestMasters(ArrayList<Object[]> resList) {
		ArrayList<LabTestMaster> resArray = new ArrayList<LabTestMaster>();
		for (Object[] obj : resList) {
			LabTestMaster cOBJ = new LabTestMaster((Integer)obj[0], (String)obj[1], (String)obj[1], (Boolean)obj[3]);
			resArray.add(cOBJ);
		}
		return resArray;
	}
	
	public Integer getTestID() {
		return testID;
	}

	public void setTestID(Integer testID) {
		this.testID = testID;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestDesc() {
		return testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	public Boolean getIsRadiologyImaging() {
		return isRadiologyImaging;
	}

	public void setIsRadiologyImaging(Boolean isRadiologyImaging) {
		this.isRadiologyImaging = isRadiologyImaging;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Character getProcessed() {
		return processed;
	}

	public void setProcessed(Character processed) {
		this.processed = processed;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Timestamp lastModDate) {
		this.lastModDate = lastModDate;
	}

}