package com.iemr.mmu.data.anc;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.iemr.mmu.data.doctor.ChiefComplaintMaster;

@Entity
@Table(name = "t_BenAdherence")
public class BenAdherence {

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
	@Column(name = "ToDrugs")
	private Boolean toDrugs;
	@Expose
	@Column(name = "DrugReason")
	private String drugReason;
	@Expose
	@Column(name = "ToReferral")
	private Boolean toReferral;
	@Expose
	@Column(name = "ReferralReason")
	private String referralReason;
	@Expose
	@Column(name = "Progress")
	private String progress;
	
	
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

	public BenAdherence() {
	}

	public BenAdherence(Long iD, Long beneficiaryRegID, Long benVisitID, Integer providerServiceMapID, Boolean toDrugs,
			String drugReason, Boolean toReferral, String referralReason, String progress) {
		super();
		ID = iD;
		this.beneficiaryRegID = beneficiaryRegID;
		this.benVisitID = benVisitID;
		this.providerServiceMapID = providerServiceMapID;
		this.toDrugs = toDrugs;
		this.drugReason = drugReason;
		this.toReferral = toReferral;
		this.referralReason = referralReason;
		this.progress = progress;
	}
	
	public static BenAdherence getBenAdherences(ArrayList<Object[]> resList) {
		ArrayList<BenAdherence> resArray = new ArrayList<BenAdherence>();
		BenAdherence cOBJ = null;
		for(Object[] obj:resList){		
			cOBJ = new BenAdherence((Long)obj[0], (Long)obj[1], (Long)obj[2], (Integer)obj[3], (Boolean)obj[4], (String)obj[5],
					(Boolean)obj[6], (String)obj[7], (String)obj[8]);
		}
		return cOBJ;
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

	public Boolean getToDrugs() {
		return toDrugs;
	}

	public void setToDrugs(Boolean toDrugs) {
		this.toDrugs = toDrugs;
	}

	public String getDrugReason() {
		return drugReason;
	}

	public void setDrugReason(String drugReason) {
		this.drugReason = drugReason;
	}

	public Boolean getToReferral() {
		return toReferral;
	}

	public void setToReferral(Boolean toReferral) {
		this.toReferral = toReferral;
	}

	public String getReferralReason() {
		return referralReason;
	}

	public void setReferralReason(String referralReason) {
		this.referralReason = referralReason;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
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
