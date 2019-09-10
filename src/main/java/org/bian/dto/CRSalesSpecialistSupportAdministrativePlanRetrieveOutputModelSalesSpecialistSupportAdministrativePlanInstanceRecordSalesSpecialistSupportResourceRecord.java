package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord
 */
public class CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecordSalesSpecialistSupportResourceRecord   {
  private String salesSpecialistSupportResourceQualificationProfile = null;

  private String salesSpecialistSupportLocationReference = null;

  private String salesSpecialistSupportResourceAvailabilitySchedule = null;

  private String salesSpecialistSupportResourceStatus = null;

  private Object salesSpecialistSupportAssignmentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the qualification, expertise and level of experience of a servicing specialist 
   * @return salesSpecialistSupportResourceQualificationProfile
  **/

  public String getSalesSpecialistSupportResourceQualificationProfile() {
    return salesSpecialistSupportResourceQualificationProfile;
  }

  public void setSalesSpecialistSupportResourceQualificationProfile(String salesSpecialistSupportResourceQualificationProfile) {
    this.salesSpecialistSupportResourceQualificationProfile = salesSpecialistSupportResourceQualificationProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the locations service by the resource where face to face meetings are required 
   * @return salesSpecialistSupportLocationReference
  **/

  public String getSalesSpecialistSupportLocationReference() {
    return salesSpecialistSupportLocationReference;
  }

  public void setSalesSpecialistSupportLocationReference(String salesSpecialistSupportLocationReference) {
    this.salesSpecialistSupportLocationReference = salesSpecialistSupportLocationReference;
  }


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

