package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentExchangeInputModelAssignmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAssignmentExchangeInputModel
 */
public class BQAssignmentExchangeInputModel   {
  private String salesSpecialistSupportAdministrativePlanInstanceReference = null;

  private String assignmentInstanceReference = null;

  private Object assignmentExchangeActionTaskRecord = null;

  private BQAssignmentExchangeInputModelAssignmentExchangeActionRequest assignmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return assignmentExchangeActionTaskRecord
  **/

  public Object getAssignmentExchangeActionTaskRecord() {
    return assignmentExchangeActionTaskRecord;
  }

  public void setAssignmentExchangeActionTaskRecord(Object assignmentExchangeActionTaskRecord) {
    this.assignmentExchangeActionTaskRecord = assignmentExchangeActionTaskRecord;
  }


  /**
   * Get assignmentExchangeActionRequest
   * @return assignmentExchangeActionRequest
  **/

  public BQAssignmentExchangeInputModelAssignmentExchangeActionRequest getAssignmentExchangeActionRequest() {
    return assignmentExchangeActionRequest;
  }

  public void setAssignmentExchangeActionRequest(BQAssignmentExchangeInputModelAssignmentExchangeActionRequest assignmentExchangeActionRequest) {
    this.assignmentExchangeActionRequest = assignmentExchangeActionRequest;
  }


}

