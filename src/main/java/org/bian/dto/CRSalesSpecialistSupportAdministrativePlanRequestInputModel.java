package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRequestInputModelRequestRecordType;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRequestInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRequestInputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanRequestInputModel   {
  private String productExpertSalesSupportServicingSessionReference = null;

  private String salesSpecialistSupportAdministrativePlanInstanceReference = null;

  private CRSalesSpecialistSupportAdministrativePlanRequestInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private Object salesSpecialistSupportAdministrativePlanRequestActionTaskRecord = null;

  private CRSalesSpecialistSupportAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRSalesSpecialistSupportAdministrativePlanRequestInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(CRSalesSpecialistSupportAdministrativePlanRequestInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRSalesSpecialistSupportAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRSalesSpecialistSupportAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

