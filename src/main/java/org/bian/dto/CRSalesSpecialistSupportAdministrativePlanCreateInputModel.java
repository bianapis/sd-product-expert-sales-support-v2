package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanCreateInputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanCreateInputModel   {
  private String productExpertSalesSupportServicingSessionReference = null;

  private Object salesSpecialistSupportAdministrativePlanCreateActionRecord = null;

  private String salesSpecialistSupportAdministrativePlanInstanceStatus = null;

  private CRSalesSpecialistSupportAdministrativePlanCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;


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

  public CRSalesSpecialistSupportAdministrativePlanCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(CRSalesSpecialistSupportAdministrativePlanCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


}

