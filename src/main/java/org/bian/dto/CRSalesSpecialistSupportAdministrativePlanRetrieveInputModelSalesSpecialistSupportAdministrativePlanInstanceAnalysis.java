package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceAnalysis   {
  private String salesSpecialistSupportAdministrativePlanInstanceAnalysisReference = null;

  private String salesSpecialistSupportAdministrativePlanInstanceAnalysisReportType = null;

  private String salesSpecialistSupportAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysisReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceAnalysisReference() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysisReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysisReference(String salesSpecialistSupportAdministrativePlanInstanceAnalysisReference) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysisReference = salesSpecialistSupportAdministrativePlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return salesSpecialistSupportAdministrativePlanInstanceAnalysisParameters
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceAnalysisParameters() {
    return salesSpecialistSupportAdministrativePlanInstanceAnalysisParameters;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceAnalysisParameters(String salesSpecialistSupportAdministrativePlanInstanceAnalysisParameters) {
    this.salesSpecialistSupportAdministrativePlanInstanceAnalysisParameters = salesSpecialistSupportAdministrativePlanInstanceAnalysisParameters;
  }


}

