package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord
 */
public class CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord   {
  private String salesSpecialistSupportResourceAllocationServiceSchedule = null;

  private String salesSpecialistSupportResourceReference = null;

  private CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord salesSpecialistSupportResourceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Maintains the allocation records of available sales specialist service resources. This includes all past and future booking commitments 
   * @return salesSpecialistSupportResourceAllocationServiceSchedule
  **/

  public String getSalesSpecialistSupportResourceAllocationServiceSchedule() {
    return salesSpecialistSupportResourceAllocationServiceSchedule;
  }

  public void setSalesSpecialistSupportResourceAllocationServiceSchedule(String salesSpecialistSupportResourceAllocationServiceSchedule) {
    this.salesSpecialistSupportResourceAllocationServiceSchedule = salesSpecialistSupportResourceAllocationServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a sales specialist support resource 
   * @return salesSpecialistSupportResourceReference
  **/

  public String getSalesSpecialistSupportResourceReference() {
    return salesSpecialistSupportResourceReference;
  }

  public void setSalesSpecialistSupportResourceReference(String salesSpecialistSupportResourceReference) {
    this.salesSpecialistSupportResourceReference = salesSpecialistSupportResourceReference;
  }


  /**
   * Get salesSpecialistSupportResourceRecord
   * @return salesSpecialistSupportResourceRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord getSalesSpecialistSupportResourceRecord() {
    return salesSpecialistSupportResourceRecord;
  }

  public void setSalesSpecialistSupportResourceRecord(CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord salesSpecialistSupportResourceRecord) {
    this.salesSpecialistSupportResourceRecord = salesSpecialistSupportResourceRecord;
  }


}

