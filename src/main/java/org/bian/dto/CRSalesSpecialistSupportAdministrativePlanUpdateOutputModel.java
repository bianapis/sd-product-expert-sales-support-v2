package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanUpdateOutputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanUpdateOutputModel   {
  private CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private String salesSpecialistSupportAdministrativePlanUpdateActionTaskReference = null;

  private Object salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return salesSpecialistSupportAdministrativePlanUpdateActionTaskReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanUpdateActionTaskReference() {
    return salesSpecialistSupportAdministrativePlanUpdateActionTaskReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanUpdateActionTaskReference(String salesSpecialistSupportAdministrativePlanUpdateActionTaskReference) {
    this.salesSpecialistSupportAdministrativePlanUpdateActionTaskReference = salesSpecialistSupportAdministrativePlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getSalesSpecialistSupportAdministrativePlanUpdateActionTaskRecord() {
    return salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanUpdateActionTaskRecord(Object salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord) {
    this.salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord = salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

