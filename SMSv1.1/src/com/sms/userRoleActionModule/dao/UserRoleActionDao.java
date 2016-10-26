package com.sms.userRoleActionModule.dao;

import java.util.Map;

public interface UserRoleActionDao {
	Map create(Object entity) ;
	/*
	 * For RoleTypesConfig PK is role_id
	 * For User PK is user_id
	 * For UserRole is PK username
	 */
	Map updateByPK(Object entity);
	/*
	 * cg_ref_code PK is domain_type
	 * role_types_config PK is role_id
	 * users PK is user_id 
	 * user_roles PK is username and role_id
	 */
	Map deleteByPK(Object entity) ;
	/*
	 * cg_ref_code PK is domain_type
	 * role_types_config PK is role_id
	 * users PK is user_id 
	 * user_roles PK is username
	 */
	Map retrieveByPK(Object entity);
	Map retrieveAll(Object entity) ;
}
