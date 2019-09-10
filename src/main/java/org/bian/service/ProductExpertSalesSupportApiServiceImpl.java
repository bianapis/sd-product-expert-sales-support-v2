/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductExpertSalesSupportApiServiceImpl implements ProductExpertSalesSupportApiService {

	public SDProductExpertSalesSupportActivateOutputModel activate(SDProductExpertSalesSupportActivateInputModel request){
		return JsonReader.read("activate-SDProductExpertSalesSupportActivateOutputModel.json",new TypeReference<SDProductExpertSalesSupportActivateOutputModel>(){});
	}
	
	public BQAssignmentCaptureOutputModel captureAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQAssignmentCaptureOutputModel.json",new TypeReference<BQAssignmentCaptureOutputModel>(){});
	}
	
	public SDProductExpertSalesSupportConfigureOutputModel configure(String sdReferenceId, SDProductExpertSalesSupportConfigureInputModel request){
		return JsonReader.read("configure-SDProductExpertSalesSupportConfigureOutputModel.json",new TypeReference<SDProductExpertSalesSupportConfigureOutputModel>(){});
	}
	
	public CRSalesSpecialistSupportAdministrativePlanCreateOutputModel create(String sdReferenceId, CRSalesSpecialistSupportAdministrativePlanCreateInputModel request){
		return JsonReader.read("create-CRSalesSpecialistSupportAdministrativePlanCreateOutputModel.json",new TypeReference<CRSalesSpecialistSupportAdministrativePlanCreateOutputModel>(){});
	}
	
	public BQAssignmentCreateOutputModel createAssignment(String sdReferenceId, String crReferenceId, BQAssignmentCreateInputModel request){
		return JsonReader.read("create-BQAssignmentCreateOutputModel.json",new TypeReference<BQAssignmentCreateOutputModel>(){});
	}
	
	public BQAssignmentExchangeOutputModel exchangeAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQAssignmentExchangeOutputModel.json",new TypeReference<BQAssignmentExchangeOutputModel>(){});
	}
	
	public SDProductExpertSalesSupportFeedbackOutputModel feedback(String sdReferenceId, SDProductExpertSalesSupportFeedbackInputModel request){
		return JsonReader.read("feedback-SDProductExpertSalesSupportFeedbackOutputModel.json",new TypeReference<SDProductExpertSalesSupportFeedbackOutputModel>(){});
	}
	
	public BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request){
		return JsonReader.read("request-BQAssignmentRequestOutputModel.json",new TypeReference<BQAssignmentRequestOutputModel>(){});
	}
	
	public CRSalesSpecialistSupportAdministrativePlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSalesSpecialistSupportAdministrativePlanRequestInputModel request){
		return JsonReader.read("request-CRSalesSpecialistSupportAdministrativePlanRequestOutputModel.json",new TypeReference<CRSalesSpecialistSupportAdministrativePlanRequestOutputModel>(){});
	}
	
	public CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRSalesSpecialistSupportAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDProductExpertSalesSupportRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProductExpertSalesSupportRetrieveOutputModel.json",new TypeReference<SDProductExpertSalesSupportRetrieveOutputModel>(){});
	}
	
	public BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssignmentRetrieveOutputModel.json",new TypeReference<BQAssignmentRetrieveOutputModel>(){});
	}
	
	public CRSalesSpecialistSupportAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSalesSpecialistSupportAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRSalesSpecialistSupportAdministrativePlanUpdateOutputModel.json",new TypeReference<CRSalesSpecialistSupportAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQAssignmentUpdateOutputModel.json",new TypeReference<BQAssignmentUpdateOutputModel>(){});
	}
	
}
