package com.sms.institutionModule.service;

import java.util.Map;

import com.sms.model.Institution;

public interface InstitutionService {
	Map createInstituion(Institution institution)  throws Exception;
	Map updateInstitutionByInstitutionId(Institution institution)  throws Exception;
	Map deleteInstitutionByInstitutionId(Institution institution) throws Exception;
	Map retrieveInstitutionByInstitutionId(Institution institution);
	Map retrieveAllInstitution();
}
