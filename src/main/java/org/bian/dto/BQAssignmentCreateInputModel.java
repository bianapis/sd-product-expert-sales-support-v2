package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCreateInputModelAssignmentInstanceRecord;
import org.bian.dto.BQAssignmentCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentCreateInputModel
 */
public class BQAssignmentCreateInputModel   {
  private BQAssignmentCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord = null;

  private String salesSpecialistSupportAdministrativePlanInstanceReference = null;

  private Object assignmentInitiateActionRecord = null;

  private BQAssignmentCreateInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;


  /**
   * Get salesSpecialistSupportAdministrativePlanInstanceRecord
   * @return salesSpecialistSupportAdministrativePlanInstanceRecord
  **/

  public BQAssignmentCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord getSalesSpecialistSupportAdministrativePlanInstanceRecord() {
    return salesSpecialistSupportAdministrativePlanInstanceRecord;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceRecord(BQAssignmentCreateInputModelSalesSpecialistSupportAdministrativePlanInstanceRecord salesSpecialistSupportAdministrativePlanInstanceRecord) {
    this.salesSpecialistSupportAdministrativePlanInstanceRecord = salesSpecialistSupportAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Sales Specialist Support Administrative Plan instance 
   * @return salesSpecialistSupportAdministrativePlanInstanceReference
  **/

  public String getSalesSpecialistSupportAdministrativePlanInstanceReference() {
    return salesSpecialistSupportAdministrativePlanInstanceReference;
  }

  public void setSalesSpecialistSupportAdministrativePlanInstanceReference(String salesSpecialistSupportAdministrativePlanInstanceReference) {
    this.salesSpecialistSupportAdministrativePlanInstanceReference = salesSpecialistSupportAdministrativePlanInstanceReference;
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
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentCreateInputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentCreateInputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


}

