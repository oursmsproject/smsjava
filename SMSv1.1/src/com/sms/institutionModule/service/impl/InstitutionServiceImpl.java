package com.sms.institutionModule.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.sms.institutionModule.dao.InstitutionDao;
import com.sms.institutionModule.service.InstitutionService;
import com.sms.model.Institution;

@Service("institutionService")
public class InstitutionServiceImpl implements InstitutionService {

	@Autowired
	InstitutionDao institutionDao;
	
	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map createInstituion(Institution institution) throws Exception {
		Map outMap = institutionDao.create(institution);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map updateInstitutionByInstitutionId(Institution institution) throws Exception {
		Map outMap = institutionDao.updateByPK(institution);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map deleteInstitutionByInstitutionId(Institution institution) throws Exception {
		Map outMap = institutionDao.deleteByPK(institution);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Override
	public Map retrieveInstitutionByInstitutionId(Institution institution) {
		Map outMap = institutionDao.retrieveByPK(institution);
		return outMap;
	}

	@Override
	public Map retrieveAllInstitution() {
		Map outMap = institutionDao.retrieveAll(Institution.class);
		return outMap;
	}

}
