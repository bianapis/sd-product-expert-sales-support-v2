package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRequestOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRequestOutputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanRequestOutputModel   {
  private CRSalesSpecialistSupportAdministrativePlanRequestOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private String salesSpecialistSupportAdministrativePlanRequestActionTaskReference = null;

  private Object salesSpecialistSupportAdministrativePlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanRequestOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(CRSalesSpecialistSupportAdministrativePlanRequestOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales Specialist Support Administrative Plan instance request service call 
   * @return salesSpecialistSupportAdministrativePlanRequestActionTaskReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanRequestActionTaskReference() {
    return salesSpecialistSupportAdministrativePlanRequestActionTaskReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanRequestActionTaskReference(String salesSpecialistSupportAdministrativePlanRequestActionTaskReference) {
    this.salesSpecialistSupportAdministrativePlanRequestActionTaskReference = salesSpecialistSupportAdministrativePlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return salesSpecialistSupportAdministrativePlanRequestActionTaskRecord
  **/

  public Object getSalesSpecialistSupportAdministrativePlanRequestActionTaskRecord() {
    return salesSpecialistSupportAdministrativePlanRequestActionTaskRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanRequestActionTaskRecord(Object salesSpecialistSupportAdministrativePlanRequestActionTaskRecord) {
    this.salesSpecialistSupportAdministrativePlanRequestActionTaskRecord = salesSpecialistSupportAdministrativePlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

