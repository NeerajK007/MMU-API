package com.iemr.mmu.data.nurse;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "t_cancervitals")
public class BenCancerVitalDetail {
	@Id
	@GeneratedValue
	@Expose
	@Column(name = "ID")
	private Long ID;

	@Expose
	@Column(name = "BeneficiaryRegID")
	private Long beneficiaryRegID;

	@Expose
	@Column(name = "BenVisitID")
	private Long benVisitID;

	@Expose
	@Column(name = "ProviderServiceMapID")
	private Integer providerServiceMapID;

	@Expose
	@Column(name = "Weight_Kg")
	private Double weight_Kg;

	@Expose
	@Column(name = "Height_cm")
	private Double height_cm;

	@Expose
	@Column(name = "WaistCircumference_cm")
	private Double waistCircumference_cm;

	@Expose
	@Column(name = "BloodGlucose_Fasting")
	private Short bloodGlucose_Fasting;

	@Expose
	@Column(name = "BloodGlucose_Random")
	private Short bloodGlucose_Random;

	@Expose
	@Column(name = "BloodGlucose_2HrPostPrandial")
	private Short bloodGlucose_2HrPostPrandial;

	@Expose
	@Column(name = "SystolicBP_1stReading")
	private Short systolicBP_1stReading;

	@Expose
	@Column(name = "DiastolicBP_1stReading")
	private Short diastolicBP_1stReading;

	@Expose
	@Column(name = "SystolicBP_2ndReading")
	private Short systolicBP_2ndReading;

	@Expose
	@Column(name = "DiastolicBP_2ndReading")
	private Short diastolicBP_2ndReading;
	@Expose
	@Column(name = "SystolicBP_3rdReading")
	private Short systolicBP_3rdReading;

	@Expose
	@Column(name = "DiastolicBP_3rdReading")
	private Short diastolicBP_3rdReading;

	@Expose
	@Column(name = "HbA1C")
	private Short hbA1C;

	@Expose
	@Column(name = "Hemoglobin")
	private Short hemoglobin;

	@Expose
	@Column(name = "Deleted", insertable = false, updatable = true)
	private Boolean deleted;
	@Expose
	@Column(name = "Processed", insertable = false, updatable = true)
	private String processed;
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

	public BenCancerVitalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BenCancerVitalDetail(Long iD, Long beneficiaryRegID, Long benVisitID, Integer providerServiceMapID,
			Double weight_Kg, Double height_cm, Double waistCircumference_cm, Short bloodGlucose_Fasting,
			Short bloodGlucose_Random, Short bloodGlucose_2HrPostPrandial, Short systolicBP_1stReading,
			Short diastolicBP_1stReading, Short systolicBP_2ndReading, Short diastolicBP_2ndReading,
			Short systolicBP_3rdReading, Short diastolicBP_3rdReading, Short hbA1C, Short hemoglobin, Boolean deleted,
			String processed, String createdBy, Timestamp createdDate, String modifiedBy, Timestamp lastModDate) {
		super();
		ID = iD;
		this.beneficiaryRegID = beneficiaryRegID;
		this.benVisitID = benVisitID;
		this.providerServiceMapID = providerServiceMapID;
		this.weight_Kg = weight_Kg;
		this.height_cm = height_cm;
		this.waistCircumference_cm = waistCircumference_cm;
		this.bloodGlucose_Fasting = bloodGlucose_Fasting;
		this.bloodGlucose_Random = bloodGlucose_Random;
		this.bloodGlucose_2HrPostPrandial = bloodGlucose_2HrPostPrandial;
		this.systolicBP_1stReading = systolicBP_1stReading;
		this.diastolicBP_1stReading = diastolicBP_1stReading;
		this.systolicBP_2ndReading = systolicBP_2ndReading;
		this.diastolicBP_2ndReading = diastolicBP_2ndReading;
		this.systolicBP_3rdReading = systolicBP_3rdReading;
		this.diastolicBP_3rdReading = diastolicBP_3rdReading;
		this.hbA1C = hbA1C;
		this.hemoglobin = hemoglobin;
		this.deleted = deleted;
		this.processed = processed;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModDate = lastModDate;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Long getBeneficiaryRegID() {
		return beneficiaryRegID;
	}

	public void setBeneficiaryRegID(Long beneficiaryRegID) {
		this.beneficiaryRegID = beneficiaryRegID;
	}

	public Long getBenVisitID() {
		return benVisitID;
	}

	public void setBenVisitID(Long benVisitID) {
		this.benVisitID = benVisitID;
	}

	public Integer getProviderServiceMapID() {
		return providerServiceMapID;
	}

	public void setProviderServiceMapID(Integer providerServiceMapID) {
		this.providerServiceMapID = providerServiceMapID;
	}

	public Double getWeight_Kg() {
		return weight_Kg;
	}

	public void setWeight_Kg(Double weight_Kg) {
		this.weight_Kg = weight_Kg;
	}

	public Double getHeight_cm() {
		return height_cm;
	}

	public void setHeight_cm(Double height_cm) {
		this.height_cm = height_cm;
	}

	public Double getWaistCircumference_cm() {
		return waistCircumference_cm;
	}

	public void setWaistCircumference_cm(Double waistCircumference_cm) {
		this.waistCircumference_cm = waistCircumference_cm;
	}

	public Short getBloodGlucose_Fasting() {
		return bloodGlucose_Fasting;
	}

	public void setBloodGlucose_Fasting(Short bloodGlucose_Fasting) {
		this.bloodGlucose_Fasting = bloodGlucose_Fasting;
	}

	public Short getBloodGlucose_Random() {
		return bloodGlucose_Random;
	}

	public void setBloodGlucose_Random(Short bloodGlucose_Random) {
		this.bloodGlucose_Random = bloodGlucose_Random;
	}

	public Short getBloodGlucose_2HrPostPrandial() {
		return bloodGlucose_2HrPostPrandial;
	}

	public void setBloodGlucose_2HrPostPrandial(Short bloodGlucose_2HrPostPrandial) {
		this.bloodGlucose_2HrPostPrandial = bloodGlucose_2HrPostPrandial;
	}

	public Short getSystolicBP_1stReading() {
		return systolicBP_1stReading;
	}

	public void setSystolicBP_1stReading(Short systolicBP_1stReading) {
		this.systolicBP_1stReading = systolicBP_1stReading;
	}

	public Short getDiastolicBP_1stReading() {
		return diastolicBP_1stReading;
	}

	public void setDiastolicBP_1stReading(Short diastolicBP_1stReading) {
		this.diastolicBP_1stReading = diastolicBP_1stReading;
	}

	public Short getSystolicBP_2ndReading() {
		return systolicBP_2ndReading;
	}

	public void setSystolicBP_2ndReading(Short systolicBP_2ndReading) {
		this.systolicBP_2ndReading = systolicBP_2ndReading;
	}

	public Short getDiastolicBP_2ndReading() {
		return diastolicBP_2ndReading;
	}

	public void setDiastolicBP_2ndReading(Short diastolicBP_2ndReading) {
		this.diastolicBP_2ndReading = diastolicBP_2ndReading;
	}

	public Short getSystolicBP_3rdReading() {
		return systolicBP_3rdReading;
	}

	public void setSystolicBP_3rdReading(Short systolicBP_3rdReading) {
		this.systolicBP_3rdReading = systolicBP_3rdReading;
	}

	public Short getDiastolicBP_3rdReading() {
		return diastolicBP_3rdReading;
	}

	public void setDiastolicBP_3rdReading(Short diastolicBP_3rdReading) {
		this.diastolicBP_3rdReading = diastolicBP_3rdReading;
	}

	public Short getHbA1C() {
		return hbA1C;
	}

	public void setHbA1C(Short hbA1C) {
		this.hbA1C = hbA1C;
	}

	public Short getHemoglobin() {
		return hemoglobin;
	}

	public void setHemoglobin(Short hemoglobin) {
		this.hemoglobin = hemoglobin;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
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