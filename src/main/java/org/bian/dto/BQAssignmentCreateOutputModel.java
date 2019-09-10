package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCreateOutputModelAssignmentInstanceRecord;
import org.bian.dto.BQAssignmentCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentCreateOutputModel
 */
public class BQAssignmentCreateOutputModel   {
  private BQAssignmentCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private String assignmentInstanceReference = null;

  private String assignmentInitiateActionReference = null;

  private Object assignmentInitiateActionRecord = null;

  private String assignmentInstanceStatus = null;

  private BQAssignmentCreateOutputModelAssignmentInstanceRecord assignmentInstanceRecord = null;


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceRecord
  **/

  public BQAssignmentCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(BQAssignmentCreateOutputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment instance 
   * @return assignmentInstanceReference
  **/

  public String getAssignmentInstanceReference() {
    return assignmentInstanceReference;
  }

  public void setAssignmentInstanceReference(String assignmentInstanceReference) {
    this.assignmentInstanceReference = assignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return assignmentInitiateActionReference
  **/

  public String getAssignmentInitiateActionReference() {
    return assignmentInitiateActionReference;
  }

  public void setAssignmentInitiateActionReference(String assignmentInitiateActionReference) {
    this.assignmentInitiateActionReference = assignmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return assignmentInitiateActionRecord
  **/

  public Object getAssignmentInitiateActionRecord() {
    return assignmentInitiateActionRecord;
  }

  public void setAssignmentInitiateActionRecord(Object assignmentInitiateActionRecord) {
    this.assignmentInitiateActionRecord = assignmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Assignment instance (e.g. initialised, pending, active) 
   * @return assignmentInstanceStatus
  **/

  public String getAssignmentInstanceStatus() {
    return assignmentInstanceStatus;
  }

  public void setAssignmentInstanceStatus(String assignmentInstanceStatus) {
    this.assignmentInstanceStatus = assignmentInstanceStatus;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentCreateOutputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentCreateOutputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


}

