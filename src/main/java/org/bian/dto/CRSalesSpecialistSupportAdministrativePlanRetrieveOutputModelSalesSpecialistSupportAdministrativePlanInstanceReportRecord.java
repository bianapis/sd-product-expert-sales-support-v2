package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceReportRecord   {
  private String salesSpecialistSupportAdministrativePlanInstanceReportData = null;

  private String salesSpecialistSupportAdministrativePlanInstanceReportType = null;

  private Object salesSpecialistSupportAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return salesSpecialistSupportAdministrativePlanInstanceReportData
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceReportData() {
    return salesSpecialistSupportAdministrativePlanInstanceReportData;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReportData(String salesSpecialistSupportAdministrativePlanInstanceReportData) {
    this.salesSpecialistSupportAdministrativePlanInstanceReportData = salesSpecialistSupportAdministrativePlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return salesSpecialistSupportAdministrativePlanInstanceReport
  **/

  public Object getSalesSpecialistSupportAdministrativePlanInstanceReport() {
    return salesSpecialistSupportAdministrativePlanInstanceReport;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReport(Object salesSpecialistSupportAdministrativePlanInstanceReport) {
    this.salesSpecialistSupportAdministrativePlanInstanceReport = salesSpecialistSupportAdministrativePlanInstanceReport;
  }


}

