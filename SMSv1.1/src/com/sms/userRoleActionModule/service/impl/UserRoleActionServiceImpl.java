package com.sms.userRoleActionModule.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.sms.model.CgRefCode;
import com.sms.model.Institution;
import com.sms.model.RoleTypesConfig;
import com.sms.model.User;
import com.sms.model.UserRole;
import com.sms.userRoleActionModule.dao.UserRoleActionDao;
import com.sms.userRoleActionModule.service.UserRoleActionService;

@Service("userRoleActionService")
public class UserRoleActionServiceImpl implements UserRoleActionService {

	@Autowired
	UserRoleActionDao userRoleActionDao;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map createRoleTypesConfig(RoleTypesConfig roleTypesConfig) throws Exception {
		Map outMap = userRoleActionDao.create(roleTypesConfig);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map createUser(User user) throws Exception {
		Map outMap = userRoleActionDao.create(user);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map createUserRole(UserRole userRole) throws Exception {
		Map outMap = userRoleActionDao.create(userRole);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map createCgRefCode(CgRefCode cgRefCode) throws Exception {
		Map outMap = userRoleActionDao.create(cgRefCode);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map updateRoleTypesConfigByRoleId(RoleTypesConfig roleTypesConfig) throws Exception {
		Map outMap = userRoleActionDao.updateByPK(roleTypesConfig);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map updateUserByUserId(User user) throws Exception {
		Map outMap = userRoleActionDao.updateByPK(user);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map updateUserRoleByUsername(UserRole userRole) throws Exception {
		Map outMap = userRoleActionDao.updateByPK(userRole);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map deleteCgRefCodeByDomainType(CgRefCode cgRefCode) throws Exception {
		Map outMap = userRoleActionDao.deleteByPK(cgRefCode);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map deleteRoleTypesConfigByRoleId(RoleTypesConfig roleTypesConfig) throws Exception {
		Map outMap = userRoleActionDao.deleteByPK(roleTypesConfig);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map deleteUserByUserId(User user) throws Exception {
		Map outMap = userRoleActionDao.deleteByPK(user);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public Map deleteUserRoleByUsername(UserRole userRole) throws Exception {
		Map outMap = userRoleActionDao.deleteByPK(userRole);
		if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
		return outMap;
	}

	@Override
	public Map retrieveCgRefCodeByDomainType(CgRefCode cgRefCode) {
		Map outMap = userRoleActionDao.retrieveByPK(cgRefCode);
		return outMap;
	}

	@Override
	public Map retrieveRoleTypesConfigByRoleId(RoleTypesConfig roleTypesConfig) {
		Map outMap = userRoleActionDao.retrieveByPK(roleTypesConfig);
		return outMap;
	}

	@Override
	public Map retrieveUserByUserId(User user) {
		Map outMap = userRoleActionDao.retrieveByPK(user);
		return outMap;
	}

	@Override
	public Map retrieveUserRoleByUsername(UserRole userRole) {
		Map outMap = userRoleActionDao.retrieveByPK(userRole);
		return outMap;
	}

	@Override
	public Map retrieveAllCgRefCode() {
		Map outMap = userRoleActionDao.retrieveAll(CgRefCode.class);
		return outMap;
	}

	@Override
	public Map retrieveAllRoleTypesConfig() {
		Map outMap = userRoleActionDao.retrieveAll(RoleTypesConfig.class);
		return outMap;
	}

	@Override
	public Map retrieveAllUser() {
		Map outMap = userRoleActionDao.retrieveAll(User.class);
		return outMap;
	}

	@Override
	public Map retrieveAllUserRole() {
		Map outMap = userRoleActionDao.retrieveAll(User.class);
		return outMap;
	}

}
