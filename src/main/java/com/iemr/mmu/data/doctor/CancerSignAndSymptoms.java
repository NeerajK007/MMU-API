package com.iemr.mmu.data.doctor;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "t_cancersignandsymptoms")
public class CancerSignAndSymptoms {
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
	@Column(name = "ShortnessOfBreath")
	private Boolean shortnessOfBreath;

	@Expose
	@Column(name = "Cough≥2Weeks")
	private Boolean coughGTE2Weeks;

	@Expose
	@Column(name = "BloodInSputum")
	private Boolean bloodInSputum;

	@Expose
	@Column(name = "DifficultyInOpeningMouth")
	private Boolean difficultyInOpeningMouth;

	@Expose
	@Column(name = "NonHealingUlcerOrPatchOrGrowth")
	private Boolean nonHealingUlcerOrPatchOrGrowth;

	@Expose
	@Column(name = "ChangeInTheToneOfVoice")
	private Boolean changeInTheToneOfVoice;

	@Expose
	@Column(name = "LumpInTheBreast")
	private Boolean lumpInTheBreast;

	@Expose
	@Column(name = "BloodStainedDischargeFromNipple")
	private Boolean bloodStainedDischargeFromNipple;

	@Expose
	@Column(name = "ChangeInShapeAndSizeOfBreasts")
	private Boolean changeInShapeAndSizeOfBreasts;

	@Expose
	@Column(name = "VaginalBleedingBetweenPeriods")
	private Boolean vaginalBleedingBetweenPeriods;

	@Expose
	@Column(name = "VaginalBleedingAfterMenopause")
	private Boolean vaginalBleedingAfterMenopause;

	@Expose
	@Column(name = "VaginalBleedingAfterIntercourse")
	private Boolean vaginalBleedingAfterIntercourse;

	@Expose
	@Column(name = "FoulSmellingVaginalDischarge")
	private Boolean foulSmellingVaginalDischarge;

	@Expose
	@Column(name = "LymphNode_Enlarged")
	private Boolean lymphNode_Enlarged;

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

	public CancerSignAndSymptoms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CancerSignAndSymptoms(Long iD, Long beneficiaryRegID, Long benVisitID, Integer providerServiceMapID,
			Boolean shortnessOfBreath, Boolean coughGTE2Weeks, Boolean bloodInSputum, Boolean difficultyInOpeningMouth,
			Boolean nonHealingUlcerOrPatchOrGrowth, Boolean changeInTheToneOfVoice, Boolean lumpInTheBreast,
			Boolean bloodStainedDischargeFromNipple, Boolean changeInShapeAndSizeOfBreasts,
			Boolean vaginalBleedingBetweenPeriods, Boolean vaginalBleedingAfterMenopause,
			Boolean vaginalBleedingAfterIntercourse, Boolean foulSmellingVaginalDischarge, Boolean lymphNode_Enlarged,
			Boolean deleted, String processed, String createdBy, Timestamp createdDate, String modifiedBy,
			Timestamp lastModDate) {
		super();
		ID = iD;
		this.beneficiaryRegID = beneficiaryRegID;
		this.benVisitID = benVisitID;
		this.providerServiceMapID = providerServiceMapID;
		this.shortnessOfBreath = shortnessOfBreath;
		this.coughGTE2Weeks = coughGTE2Weeks;
		this.bloodInSputum = bloodInSputum;
		this.difficultyInOpeningMouth = difficultyInOpeningMouth;
		this.nonHealingUlcerOrPatchOrGrowth = nonHealingUlcerOrPatchOrGrowth;
		this.changeInTheToneOfVoice = changeInTheToneOfVoice;
		this.lumpInTheBreast = lumpInTheBreast;
		this.bloodStainedDischargeFromNipple = bloodStainedDischargeFromNipple;
		this.changeInShapeAndSizeOfBreasts = changeInShapeAndSizeOfBreasts;
		this.vaginalBleedingBetweenPeriods = vaginalBleedingBetweenPeriods;
		this.vaginalBleedingAfterMenopause = vaginalBleedingAfterMenopause;
		this.vaginalBleedingAfterIntercourse = vaginalBleedingAfterIntercourse;
		this.foulSmellingVaginalDischarge = foulSmellingVaginalDischarge;
		this.lymphNode_Enlarged = lymphNode_Enlarged;
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

	public Boolean getShortnessOfBreath() {
		return shortnessOfBreath;
	}

	public void setShortnessOfBreath(Boolean shortnessOfBreath) {
		this.shortnessOfBreath = shortnessOfBreath;
	}

	public Boolean getCoughGTE2Weeks() {
		return coughGTE2Weeks;
	}

	public void setCoughGTE2Weeks(Boolean coughGTE2Weeks) {
		this.coughGTE2Weeks = coughGTE2Weeks;
	}

	public Boolean getBloodInSputum() {
		return bloodInSputum;
	}

	public void setBloodInSputum(Boolean bloodInSputum) {
		this.bloodInSputum = bloodInSputum;
	}

	public Boolean getDifficultyInOpeningMouth() {
		return difficultyInOpeningMouth;
	}

	public void setDifficultyInOpeningMouth(Boolean difficultyInOpeningMouth) {
		this.difficultyInOpeningMouth = difficultyInOpeningMouth;
	}

	public Boolean getNonHealingUlcerOrPatchOrGrowth() {
		return nonHealingUlcerOrPatchOrGrowth;
	}

	public void setNonHealingUlcerOrPatchOrGrowth(Boolean nonHealingUlcerOrPatchOrGrowth) {
		this.nonHealingUlcerOrPatchOrGrowth = nonHealingUlcerOrPatchOrGrowth;
	}

	public Boolean getChangeInTheToneOfVoice() {
		return changeInTheToneOfVoice;
	}

	public void setChangeInTheToneOfVoice(Boolean changeInTheToneOfVoice) {
		this.changeInTheToneOfVoice = changeInTheToneOfVoice;
	}

	public Boolean getLumpInTheBreast() {
		return lumpInTheBreast;
	}

	public void setLumpInTheBreast(Boolean lumpInTheBreast) {
		this.lumpInTheBreast = lumpInTheBreast;
	}

	public Boolean getBloodStainedDischargeFromNipple() {
		return bloodStainedDischargeFromNipple;
	}

	public void setBloodStainedDischargeFromNipple(Boolean bloodStainedDischargeFromNipple) {
		this.bloodStainedDischargeFromNipple = bloodStainedDischargeFromNipple;
	}

	public Boolean getChangeInShapeAndSizeOfBreasts() {
		return changeInShapeAndSizeOfBreasts;
	}

	public void setChangeInShapeAndSizeOfBreasts(Boolean changeInShapeAndSizeOfBreasts) {
		this.changeInShapeAndSizeOfBreasts = changeInShapeAndSizeOfBreasts;
	}

	public Boolean getVaginalBleedingBetweenPeriods() {
		return vaginalBleedingBetweenPeriods;
	}

	public void setVaginalBleedingBetweenPeriods(Boolean vaginalBleedingBetweenPeriods) {
		this.vaginalBleedingBetweenPeriods = vaginalBleedingBetweenPeriods;
	}

	public Boolean getVaginalBleedingAfterMenopause() {
		return vaginalBleedingAfterMenopause;
	}

	public void setVaginalBleedingAfterMenopause(Boolean vaginalBleedingAfterMenopause) {
		this.vaginalBleedingAfterMenopause = vaginalBleedingAfterMenopause;
	}

	public Boolean getVaginalBleedingAfterIntercourse() {
		return vaginalBleedingAfterIntercourse;
	}

	public void setVaginalBleedingAfterIntercourse(Boolean vaginalBleedingAfterIntercourse) {
		this.vaginalBleedingAfterIntercourse = vaginalBleedingAfterIntercourse;
	}

	public Boolean getFoulSmellingVaginalDischarge() {
		return foulSmellingVaginalDischarge;
	}

	public void setFoulSmellingVaginalDischarge(Boolean foulSmellingVaginalDischarge) {
		this.foulSmellingVaginalDischarge = foulSmellingVaginalDischarge;
	}

	public Boolean getLymphNode_Enlarged() {
		return lymphNode_Enlarged;
	}

	public void setLymphNode_Enlarged(Boolean lymphNode_Enlarged) {
		this.lymphNode_Enlarged = lymphNode_Enlarged;
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