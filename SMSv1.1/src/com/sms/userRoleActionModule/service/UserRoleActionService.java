package com.sms.userRoleActionModule.service;

import java.util.Map;

import com.sms.model.CgRefCode;
import com.sms.model.RoleTypesConfig;
import com.sms.model.User;
import com.sms.model.UserRole;

public interface UserRoleActionService {
	Map createRoleTypesConfig(RoleTypesConfig roleTypesConfig) throws Exception;
	Map createUser(User user)  throws Exception;
	Map createUserRole(UserRole userRole)  throws Exception;
	Map createCgRefCode(CgRefCode cgRefCode)  throws Exception;
	Map updateRoleTypesConfigByRoleId(RoleTypesConfig roleTypesConfig)  throws Exception;
	Map updateUserByUserId(User user)  throws Exception;
	Map updateUserRoleByUsername(UserRole userRole)  throws Exception;
	Map deleteCgRefCodeByDomainType(CgRefCode cgRefCode) throws Exception;
	Map deleteRoleTypesConfigByRoleId(RoleTypesConfig roleTypesConfig) throws Exception;
	Map deleteUserByUserId(User user) throws Exception;
	Map deleteUserRoleByUsername(UserRole userRole) throws Exception;
	Map retrieveCgRefCodeByDomainType(CgRefCode cgRefCode);
	Map retrieveRoleTypesConfigByRoleId(RoleTypesConfig roleTypesConfig);
	Map retrieveUserByUserId(User user);
	Map retrieveUserRoleByUsername(UserRole userRole);
	Map retrieveAllCgRefCode();
	Map retrieveAllRoleTypesConfig();
	Map retrieveAllUser();
	Map retrieveAllUserRole();
}
