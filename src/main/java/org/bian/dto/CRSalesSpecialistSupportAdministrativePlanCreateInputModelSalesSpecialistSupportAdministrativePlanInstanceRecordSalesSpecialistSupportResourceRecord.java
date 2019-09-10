package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord
 */
public class CRSalesSpecialistSupportAdministrativePlanCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord   {
  private String salesSpecialistSupportResourceAvailabilitySchedule = null;

  private String salesSpecialistSupportResourceStatus = null;

  private Object salesSpecialistSupportAssignmentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the time the resource plans to be and is actually available for assignments 
   * @return salesSpecialistSupportResourceAvailabilitySchedule
  **/

  public String getSalesSpecialistSupportResourceAvailabilitySchedule() {
    return salesSpecialistSupportResourceAvailabilitySchedule;
  }

  public void setSalesSpecialistSupportResourceAvailabilitySchedule(String salesSpecialistSupportResourceAvailabilitySchedule) {
    this.salesSpecialistSupportResourceAvailabilitySchedule = salesSpecialistSupportResourceAvailabilitySchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Tracks the current status indicating availability for assignment 
   * @return salesSpecialistSupportResourceStatus
  **/

  public String getSalesSpecialistSupportResourceStatus() {
    return salesSpecialistSupportResourceStatus;
  }

  public void setSalesSpecialistSupportResourceStatus(String salesSpecialistSupportResourceStatus) {
    this.salesSpecialistSupportResourceStatus = salesSpecialistSupportResourceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Reference to a consolidated record of assignment instances handled by the support resource. This is used to track utilization and performance 
   * @return salesSpecialistSupportAssignmentRecord
  **/

  public Object getSalesSpecialistSupportAssignmentRecord() {
    return salesSpecialistSupportAssignmentRecord;
  }

  public void setSalesSpecialistSupportAssignmentRecord(Object salesSpecialistSupportAssignmentRecord) {
    this.salesSpecialistSupportAssignmentRecord = salesSpecialistSupportAssignmentRecord;
  }


}

