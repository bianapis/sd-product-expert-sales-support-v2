package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentCreateInputModelAssignmentInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQAssignmentCreateOutputModelAssignmentInstanceRecord
 */
public class BQAssignmentCreateOutputModelAssignmentInstanceRecord   {
  private String salesSpecialistSupportAssignmentRequestType = null;

  private String salesSpecialistSupportSessionWorkProducts = null;

  private String salesSpecialistSupportAssignmentLocation = null;

  private String salesSpecialistSupportAssignmentFee = null;

  private String salesSpecialistSupportAssignmentResult = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of any meeting notes, work products and administrative documentation generated during the assignment 
   * @return salesSpecialistSupportSessionWorkProducts
  **/

  public String getSalesSpecialistSupportSessionWorkProducts() {
    return salesSpecialistSupportSessionWorkProducts;
  }

  public void setSalesSpecialistSupportSessionWorkProducts(String salesSpecialistSupportSessionWorkProducts) {
    this.salesSpecialistSupportSessionWorkProducts = salesSpecialistSupportSessionWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The location of the customer interaction (e.g. branch, phone, customer site) 
   * @return salesSpecialistSupportAssignmentLocation
  **/

  public String getSalesSpecialistSupportAssignmentLocation() {
    return salesSpecialistSupportAssignmentLocation;
  }

  public void setSalesSpecialistSupportAssignmentLocation(String salesSpecialistSupportAssignmentLocation) {
    this.salesSpecialistSupportAssignmentLocation = salesSpecialistSupportAssignmentLocation;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the customer interaction, including any suggested follow-up tasks 
   * @return salesSpecialistSupportAssignmentResult
  **/

  public String getSalesSpecialistSupportAssignmentResult() {
    return salesSpecialistSupportAssignmentResult;
  }

  public void setSalesSpecialistSupportAssignmentResult(String salesSpecialistSupportAssignmentResult) {
    this.salesSpecialistSupportAssignmentResult = salesSpecialistSupportAssignmentResult;
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

