package com.iemr.mmu.repo.nurse.anc;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.mmu.data.anc.BencomrbidityCondDetails;

@Repository
public interface BencomrbidityCondRepo extends CrudRepository<BencomrbidityCondDetails, Long> {

	@Query("select comorbidCondition ,  otherComorbidCondition, year "
			+ "from BencomrbidityCondDetails a where a.beneficiaryRegID = :beneficiaryRegID AND a.isForHistory = true ORDER BY createdDate DESC ")
	public ArrayList<Object[]> getBencomrbidityCondDetails(@Param("beneficiaryRegID") Long beneficiaryRegID);
	
	@Query(" SELECT beneficiaryRegID, benVisitID, providerServiceMapID, comorbidConditionID, comorbidCondition, year, otherComorbidCondition, "
			+ " isForHistory, createdDate  FROM BencomrbidityCondDetails "
			+ " WHERE beneficiaryRegID = :benRegID AND benVisitID = :benVisitID ")
	public ArrayList<Object[]> getBencomrbidityCondDetails(@Param("benRegID") Long benRegID, @Param("benVisitID") Long benVisitID);

	
	@Modifying
	@Transactional
	@Query(" Delete from BencomrbidityCondDetails WHERE beneficiaryRegID = :benRegID")
	public int deleteExistingBenComrbidityCondDetails(@Param("benRegID") Long benRegID);
	
}
