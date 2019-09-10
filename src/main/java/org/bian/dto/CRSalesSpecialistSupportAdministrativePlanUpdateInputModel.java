package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanUpdateInputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanUpdateInputModel   {
  private String productExpertSalesSupportServicingSessionReference = null;

  private String salesSpecialistSupportAdministrativePlanInstanceReference = null;

  private CRSalesSpecialistSupportAdministrativePlanUpdateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private Object salesSpecialistSupportAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return productExpertSalesSupportServicingSessionReference
  **/

  public String getProductExpertSalesSupportServicingSessionReference() {
    return productExpertSalesSupportServicingSessionReference;
  }

  public void setProductExpertSalesSupportServicingSessionReference(String productExpertSalesSupportServicingSessionReference) {
    this.productExpertSalesSupportServicingSessionReference = productExpertSalesSupportServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

