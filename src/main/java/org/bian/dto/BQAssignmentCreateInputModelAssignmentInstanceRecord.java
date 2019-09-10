package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCreateInputModelAssignmentInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQAssignmentCreateInputModelAssignmentInstanceRecord
 */
public class BQAssignmentCreateInputModelAssignmentInstanceRecord   {
  private String salesSpecialistSupportAssignmentRequestType = null;

  private Object salesSpecialistSupportAssignmentRequestRecord = null;

  private String salesSpecialistSupportAssignmentFee = null;

  private BQAssignmentCreateInputModelAssignmentInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the type of assignment (e.g. in person, phone conference) 
   * @return salesSpecialistSupportAssignmentRequestType
  **/

  public String getSalesSpecialistSupportAssignmentRequestType() {
    return salesSpecialistSupportAssignmentRequestType;
  }

  public void setSalesSpecialistSupportAssignmentRequestType(String salesSpecialistSupportAssignmentRequestType) {
    this.salesSpecialistSupportAssignmentRequestType = salesSpecialistSupportAssignmentRequestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Contains details of the product specialist support request, in particular the product or service of interest and the specific topics to be covered 
   * @return salesSpecialistSupportAssignmentRequestRecord
  **/

  public Object getSalesSpecialistSupportAssignmentRequestRecord() {
    return salesSpecialistSupportAssignmentRequestRecord;
  }

  public void setSalesSpecialistSupportAssignmentRequestRecord(Object salesSpecialistSupportAssignmentRequestRecord) {
    this.salesSpecialistSupportAssignmentRequestRecord = salesSpecialistSupportAssignmentRequestRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Details of time and expenses booked and fees associated with the assignment and if appropriate reference to charges made to the customer 
   * @return salesSpecialistSupportAssignmentFee
  **/

  public String getSalesSpecialistSupportAssignmentFee() {
    return salesSpecialistSupportAssignmentFee;
  }

  public void setSalesSpecialistSupportAssignmentFee(String salesSpecialistSupportAssignmentFee) {
    this.salesSpecialistSupportAssignmentFee = salesSpecialistSupportAssignmentFee;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public BQAssignmentCreateInputModelAssignmentInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(BQAssignmentCreateInputModelAssignmentInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

