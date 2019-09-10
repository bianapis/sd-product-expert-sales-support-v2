package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis   {
  private String salesSpecialistSupportAdministrativePlanInstanceAnalysisData = null;

  private String salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType = null;

  private Object salesSpecialistSupportAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysisData
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceAnalysisData() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysisData;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysisData(String salesSpecialistSupportAdministrativePlanInstanceAnalysisData) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysisData = salesSpecialistSupportAdministrativePlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceAnalysisReportType() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysisReportType(String salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType = salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysisReport
  **/

  public Object getSalesSpecialistSupportAdministrativePlanInstanceAnalysisReport() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysisReport;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysisReport(Object salesSpecialistSupportAdministrativePlanInstanceAnalysisReport) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysisReport = salesSpecialistSupportAdministrativePlanInstanceAnalysisReport;
  }


}

