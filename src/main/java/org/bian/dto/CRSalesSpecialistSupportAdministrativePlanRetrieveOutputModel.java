package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModel   {
  private CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private String salesSpecialistSupportAdministrativePlanRetrieveActionTaskReference = null;

  private Object salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord = null;

  private String salesSpecialistSupportAdministrativePlanRetrieveActionResponse = null;

  private CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord salesSpecialistSupportAdministrativePlanInstanceReportRecord = null;

  private CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis salesSpecialistSupportAdministrativePlanInstanceAnalysis = null;


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales Specialist Support Administrative Plan instance retrieve service call 
   * @return salesSpecialistSupportAdministrativePlanRetrieveActionTaskReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanRetrieveActionTaskReference() {
    return salesSpecialistSupportAdministrativePlanRetrieveActionTaskReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanRetrieveActionTaskReference(String salesSpecialistSupportAdministrativePlanRetrieveActionTaskReference) {
    this.salesSpecialistSupportAdministrativePlanRetrieveActionTaskReference = salesSpecialistSupportAdministrativePlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getSalesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord() {
    return salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord(Object salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord) {
    this.salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord = salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return salesSpecialistSupportAdministrativePlanRetrieveActionResponse
  **/

  public String getSalesSpecialistSupportAdministrativePlanRetrieveActionResponse() {
    return salesSpecialistSupportAdministrativePlanRetrieveActionResponse;
  }

  public void setSalesSpecialistSupportAdministrativePlanRetrieveActionResponse(String salesSpecialistSupportAdministrativePlanRetrieveActionResponse) {
    this.salesSpecialistSupportAdministrativePlanRetrieveActionResponse = salesSpecialistSupportAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceReportRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceReportRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord getSalesSpecialistSupportAdministrativePlanInstanceReportRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceReportRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReportRecord(CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord salesSpecialistSupportAdministrativePlanInstanceReportRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceReportRecord = salesSpecialistSupportAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceAnalysis
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysis
  **/

  public CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis getSalesSpecialistSupportAdministrativePlanInstanceAnalysis() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysis;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysis(CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis salesSpecialistSupportAdministrativePlanInstanceAnalysis) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysis = salesSpecialistSupportAdministrativePlanInstanceAnalysis;
  }


}

