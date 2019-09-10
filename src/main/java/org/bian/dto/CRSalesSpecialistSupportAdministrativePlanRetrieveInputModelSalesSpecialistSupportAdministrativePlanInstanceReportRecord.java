package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveInputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord   {
  private String salesSpecialistSupportAdministrativePlanInstanceReportReference = null;

  private String salesSpecialistSupportAdministrativePlanInstanceReportType = null;

  private String salesSpecialistSupportAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return salesSpecialistSupportAdministrativePlanInstanceReportReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceReportReference() {
    return salesSpecialistSupportAdministrativePlanInstanceReportReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReportReference(String salesSpecialistSupportAdministrativePlanInstanceReportReference) {
    this.salesSpecialistSupportAdministrativePlanInstanceReportReference = salesSpecialistSupportAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return salesSpecialistSupportAdministrativePlanInstanceReportType
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceReportType() {
    return salesSpecialistSupportAdministrativePlanInstanceReportType;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReportType(String salesSpecialistSupportAdministrativePlanInstanceReportType) {
    this.salesSpecialistSupportAdministrativePlanInstanceReportType = salesSpecialistSupportAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return salesSpecialistSupportAdministrativePlanInstanceReportParameters
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceReportParameters() {
    return salesSpecialistSupportAdministrativePlanInstanceReportParameters;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReportParameters(String salesSpecialistSupportAdministrativePlanInstanceReportParameters) {
    this.salesSpecialistSupportAdministrativePlanInstanceReportParameters = salesSpecialistSupportAdministrativePlanInstanceReportParameters;
  }


}

