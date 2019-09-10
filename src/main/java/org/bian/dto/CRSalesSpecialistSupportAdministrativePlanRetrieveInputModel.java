package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveInputModel
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveInputModel   {
  private Object salesSpecialistSupportAdministrativePlanRetrieveActionTaskRecord = null;

  private String salesSpecialistSupportAdministrativePlanRetrieveActionRequest = null;

  private CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord salesSpecialistSupportAdministrativePlanInstanceReportRecord = null;

  private CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis salesSpecialistSupportAdministrativePlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return salesSpecialistSupportAdministrativePlanRetrieveActionRequest
  **/

  public String getSalesSpecialistSupportAdministrativePlanRetrieveActionRequest() {
    return salesSpecialistSupportAdministrativePlanRetrieveActionRequest;
  }

  public void setSalesSpecialistSupportAdministrativePlanRetrieveActionRequest(String salesSpecialistSupportAdministrativePlanRetrieveActionRequest) {
    this.salesSpecialistSupportAdministrativePlanRetrieveActionRequest = salesSpecialistSupportAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceReportRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceReportRecord
  **/

  public CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord getSalesSpecialistSupportAdministrativePlanInstanceReportRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceReportRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReportRecord(CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord salesSpecialistSupportAdministrativePlanInstanceReportRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceReportRecord = salesSpecialistSupportAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceAnalysis
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysis
  **/

  public CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis getSalesSpecialistSupportAdministrativePlanInstanceAnalysis() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysis;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysis(CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis salesSpecialistSupportAdministrativePlanInstanceAnalysis) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysis = salesSpecialistSupportAdministrativePlanInstanceAnalysis;
  }


}

