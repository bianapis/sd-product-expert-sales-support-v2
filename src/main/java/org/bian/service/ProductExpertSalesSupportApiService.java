/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductExpertSalesSupportApiService {

	SDProductExpertSalesSupportActivateOutputModel activate(SDProductExpertSalesSupportActivateInputModel request);
	
	BQAssignmentCaptureOutputModel captureAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentCaptureInputModel request);
	
	SDProductExpertSalesSupportConfigureOutputModel configure(String sdReferenceId, SDProductExpertSalesSupportConfigureInputModel request);
	
	CRSalesSpecialistSupportAdministrativePlanCreateOutputModel create(String sdReferenceId, CRSalesSpecialistSupportAdministrativePlanCreateInputModel request);
	
	BQAssignmentCreateOutputModel createAssignment(String sdReferenceId, String crReferenceId, BQAssignmentCreateInputModel request);
	
	BQAssignmentExchangeOutputModel exchangeAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentExchangeInputModel request);
	
	SDProductExpertSalesSupportFeedbackOutputModel feedback(String sdReferenceId, SDProductExpertSalesSupportFeedbackInputModel request);
	
	BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request);
	
	CRSalesSpecialistSupportAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSalesSpecialistSupportAdministrativePlanRequestInputModel request);
	
	CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDProductExpertSalesSupportRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRSalesSpecialistSupportAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSalesSpecialistSupportAdministrativePlanUpdateInputModel request);
	
	BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request);
	
}
