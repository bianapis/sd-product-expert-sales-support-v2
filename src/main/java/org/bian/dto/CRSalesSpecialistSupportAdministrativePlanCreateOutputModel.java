package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanCreateOutputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanCreateOutputModel   {
  private String salesSpecialistSupportAdministrativePlanInstanceReference = null;

  private String salesSpecialistSupportAdministrativePlanCreateActionReference = null;

  private Object salesSpecialistSupportAdministrativePlanCreateActionRecord = null;

  private String salesSpecialistSupportAdministrativePlanInstanceStatus = null;

  private CRSalesSpecialistSupportAdministrativePlanCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales Specialist Support Administrative Plan instance 
   * @return salesSpecialistSupportAdministrativePlanInstanceReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceReference() {
    return salesSpecialistSupportAdministrativePlanInstanceReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReference(String salesSpecialistSupportAdministrativePlanInstanceReference) {
    this.salesSpecialistSupportAdministrativePlanInstanceReference = salesSpecialistSupportAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return salesSpecialistSupportAdministrativePlanCreateActionReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanCreateActionReference() {
    return salesSpecialistSupportAdministrativePlanCreateActionReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanCreateActionReference(String salesSpecialistSupportAdministrativePlanCreateActionReference) {
    this.salesSpecialistSupportAdministrativePlanCreateActionReference = salesSpecialistSupportAdministrativePlanCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return salesSpecialistSupportAdministrativePlanCreateActionRecord
  **/

  public Object getSalesSpecialistSupportAdministrativePlanCreateActionRecord() {
    return salesSpecialistSupportAdministrativePlanCreateActionRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanCreateActionRecord(Object salesSpecialistSupportAdministrativePlanCreateActionRecord) {
    this.salesSpecialistSupportAdministrativePlanCreateActionRecord = salesSpecialistSupportAdministrativePlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Sales Specialist Support Administrative Plan instance (e.g. initialised, pending, active) 
   * @return salesSpecialistSupportAdministrativePlanInstanceStatus
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceStatus() {
    return salesSpecialistSupportAdministrativePlanInstanceStatus;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceStatus(String salesSpecialistSupportAdministrativePlanInstanceStatus) {
    this.salesSpecialistSupportAdministrativePlanInstanceStatus = salesSpecialistSupportAdministrativePlanInstanceStatus;
  }


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(CRSalesSpecialistSupportAdministrativePlanCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


}

