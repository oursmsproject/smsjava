package com.sms.userRoleActionModule.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.sms.model.CgRefCode;
import com.sms.model.RoleTypesConfig;
import com.sms.model.User;
import com.sms.model.UserRole;
import com.sms.userRoleActionModule.dao.UserRoleActionDao;

@Repository
public class UserRoleActionDaoImpl implements UserRoleActionDao {

	private Logger logger = Logger.getLogger(UserRoleActionDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Map create(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof CgRefCode){    
				CgRefCode cgRefCodeObj = (CgRefCode)entity;
				sqlQuery = "INSERT INTO sms.cg_ref_code(description,domain_label,domain_type,domain_value)"
						+ "VALUES ("+cgRefCodeObj.getDescription()+","+cgRefCodeObj.getDomain_label()+","+cgRefCodeObj.getDomain_type()+","+cgRefCodeObj.getDomain_value()+")";
			}
			if(entity instanceof RoleTypesConfig){
				RoleTypesConfig roleTypesConfigObj = (RoleTypesConfig)entity;
				sqlQuery = "INSERT INTO sms.role_types_config(role_name, role_description, role_Type, institution_id, role_name_ins_level, role_desc_ins_level, created_by, dummy1, dummy2)"
						+ "VALUES ("+roleTypesConfigObj.getRoleName()+","+roleTypesConfigObj.getRoleDescription()+","+roleTypesConfigObj.getRole_Type()+","+roleTypesConfigObj.getInstitutionId()+","+roleTypesConfigObj.getRoleNameInsLevel()+","+roleTypesConfigObj.getRoleDescInsLevel()+","+roleTypesConfigObj.getCreatedBy()+","+roleTypesConfigObj.getDummy1()+","+roleTypesConfigObj.getDummy2()+")";
			}
			if(entity instanceof User){
				User userObj = (User)entity;
				String hashedPassword = "";
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				hashedPassword = passwordEncoder.encode(userObj.getPassword());
				sqlQuery = "INSERT INTO sms.users(username, password, enabled, first_name, middle_name, surname, dummy1, dummy2, dob, created_date, created_by)"
						+ "VALUES ("+userObj.getUsername()+","+hashedPassword+","+userObj.getEnabled()+","+userObj.getFirstName()+","+userObj.getMiddleName()+","+userObj.getSurname()+","+userObj.getDummy1()+","+userObj.getDummy2()+","+userObj.getDob()+","+userObj.getCreated_date()+","+userObj.getCreatedBy()+")";
			}
			if(entity instanceof UserRole){
				UserRole userRoleObj = (UserRole)entity;
				sqlQuery = "INSERT INTO sms.user_roles(user_id, username, role_id, institution_id, created_date, created_by)"
						+ "VALUES ("+userRoleObj.getUser1().getUserId()+","+userRoleObj.getUser1().getUsername()+","+userRoleObj.getRoleTypesConfig().getRoleId()+","+userRoleObj.getInstitution().getInstitutionId()+","+userRoleObj.getCreated_date()+","+userRoleObj.getCreatedBy()+")";
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "UserRoleActionDaoImplcreate";
			logger.error(errorCode+"-"+errorMsg+"-"+entity.getClass().toString());
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}

	/*
	 * For RoleTypesConfig PK is role_id
	 * For User PK is user_id
	 * For UserRole is PK username
	 */
	@Override
	public Map updateByPK(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof RoleTypesConfig){
				RoleTypesConfig roleTypesConfigObj = (RoleTypesConfig)entity;
				sqlQuery = "update sms.role_types_config set role_name="+roleTypesConfigObj.getRoleName()+", role_description="+roleTypesConfigObj.getRoleDescription()+
						", role_Type="+roleTypesConfigObj.getRole_Type()+", institution_id="+roleTypesConfigObj.getInstitutionId()+", role_name_ins_level="+roleTypesConfigObj.getRoleNameInsLevel()+
						", role_desc_ins_level="+roleTypesConfigObj.getRoleDescInsLevel()+", updated_by="+roleTypesConfigObj.getUpdatedBy()+" where role_id="+roleTypesConfigObj.getRoleId();
			}
			if(entity instanceof User){
				User userObj = (User)entity;
				String hashedPassword = "";
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				hashedPassword = passwordEncoder.encode(userObj.getPassword());
				sqlQuery = "update sms.users set username="+userObj.getUsername()+", password="+hashedPassword+", enabled="+userObj.getEnabled()+", first_name="+userObj.getFirstName()+
						", middle_name="+userObj.getMiddleName()+", surname="+userObj.getSurname()+", dob="+userObj.getDob()+",updated_by="+userObj.getUpdatedBy()+" where user_id="+userObj.getUserId();
			}
			if(entity instanceof UserRole){
				UserRole userRoleObj = (UserRole)entity;
				sqlQuery = "update sms.user_roles set role_id="+userRoleObj.getRoleTypesConfig().getRoleId()+", institution_id="+userRoleObj.getInstitution().getInstitutionId()+", updated_by="+userRoleObj.getUpdatedBy()+
						" where username="+userRoleObj.getUser1().getUsername();
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "UserRoleActionDaoImplupdateByPK";
			logger.error(errorCode+"-"+errorMsg+"-"+entity.getClass().toString());
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}

	/*
	 * cg_ref_code PK is domain_type
	 * role_types_config PK is role_id
	 * users PK is user_id 
	 * user_roles PK is username and role_id
	 */
	@Override
	public Map deleteByPK(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof CgRefCode){
				CgRefCode cgRefCodeObj = (CgRefCode)entity;
				sqlQuery = "delete from sms.cg_ref_code where domain_type = "+cgRefCodeObj.getDomain_type();
			}
			if(entity instanceof RoleTypesConfig){
				RoleTypesConfig roleTypesConfigObj = (RoleTypesConfig)entity;
				sqlQuery = "delete from sms.role_types_config  where role_id="+roleTypesConfigObj.getRoleId();
			}
			if(entity instanceof User){
				User userObj = (User)entity;
				sqlQuery = "delete from sms.users where user_id="+userObj.getUserId();
			}
			if(entity instanceof UserRole){
				UserRole userRoleObj = (UserRole)entity;
				sqlQuery = "delete from sms.user_roles where username="+userRoleObj.getUser1().getUsername()+" and role_id="+userRoleObj.getRoleTypesConfig().getRoleId();
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "UserRoleActionDaoImpldeleteByPK";
			logger.error(errorCode+"-"+errorMsg+"-"+entity.getClass().toString());
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}
	
	/*
	 * cg_ref_code PK is domain_type
	 * role_types_config PK is role_id
	 * users PK is user_id 
	 * user_roles PK is username
	 */
	@Override
	public Map retrieveByPK(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof CgRefCode){
				List<CgRefCode> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.cg_ref_code where domain_type="+((CgRefCode)entity).getDomain_type(),
						new RowMapper<CgRefCode>() {
							public CgRefCode mapRow(ResultSet rs, int rowNum) throws SQLException {
								CgRefCode cgRefCodeObj = new CgRefCode();
								cgRefCodeObj.setDescription(rs.getString("description"));
								cgRefCodeObj.setDomain_label(rs.getString("domain_label"));
								cgRefCodeObj.setDomain_type(rs.getString("domain_type"));
								cgRefCodeObj.setDomain_value(rs.getString("domain_value"));
								return cgRefCodeObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(entity instanceof RoleTypesConfig){
				List<RoleTypesConfig> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.role_types_config where role_id="+((RoleTypesConfig)entity).getRoleId(),
						new RowMapper<RoleTypesConfig>() {
							public RoleTypesConfig mapRow(ResultSet rs, int rowNum) throws SQLException {
								RoleTypesConfig roleTypesConfigObj = new RoleTypesConfig();
								roleTypesConfigObj.setRoleId(rs.getLong("role_id"));
								roleTypesConfigObj.setRoleName(rs.getString("role_name"));
								roleTypesConfigObj.setRoleDescription(rs.getString("role_description"));
								roleTypesConfigObj.setRole_Type(rs.getString("role_Type"));
								roleTypesConfigObj.setInstitutionId(rs.getLong("institution_id"));
								roleTypesConfigObj.setRoleNameInsLevel(rs.getString("role_name_ins_level"));
								roleTypesConfigObj.setRoleDescInsLevel(rs.getString("role_desc_ins_level"));
								roleTypesConfigObj.setCreatedDate(rs.getDate("created_date"));
								roleTypesConfigObj.setCreatedBy(rs.getLong("created_by"));
								roleTypesConfigObj.setUpdatedDate(rs.getDate("updated_date"));
								roleTypesConfigObj.setUpdatedBy(rs.getLong("updated_by"));
								return roleTypesConfigObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);	
			}
			if(entity instanceof User){
				List<User> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.users where user_id="+((User)entity).getUserId(),
						new RowMapper<User>() {
							public User mapRow(ResultSet rs, int rowNum) throws SQLException {
								User userObj = new User();
								userObj.setUserId(rs.getLong("user_id"));
								userObj.setUsername(rs.getString("username"));
								userObj.setPassword(rs.getString("password"));
								userObj.setEnabled(rs.getString("enabled"));
								userObj.setFirstName(rs.getString("first_name"));
								userObj.setMiddleName(rs.getString("middle_name"));
								userObj.setSurname(rs.getString("surname"));
								userObj.setDob(rs.getDate("dob"));
								userObj.setCreated_date(rs.getDate("created_date"));
								userObj.setUpdated_date(rs.getDate("updated_date"));
								userObj.setCreatedBy(rs.getLong("created_by"));
								userObj.setUpdatedBy(rs.getLong("updated_by"));
								return userObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(entity instanceof UserRole){
				List<UserRole> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.user_roles where username="+((UserRole)entity).getUser1().getUsername(),
						new RowMapper<UserRole>() {
							public UserRole mapRow(ResultSet rs, int rowNum) throws SQLException {
								UserRole userRoleObj = new UserRole();
								userRoleObj.getUser1().setUserId(rs.getLong("user_id"));
								userRoleObj.getUser1().setUsername(rs.getString("username"));
								userRoleObj.getRoleTypesConfig().setRoleId(rs.getLong("role_id"));
								userRoleObj.getInstitution().setInstitutionId(rs.getLong("institution_id"));
								userRoleObj.setCreated_date(rs.getDate("created_date"));
								userRoleObj.setCreatedBy(rs.getLong("created_by"));
								userRoleObj.setUpdated_date(rs.getDate("updated_date"));
								userRoleObj.setUpdatedBy(rs.getLong("updated_by"));
								return userRoleObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "UserRoleActionDaoImplretrieveByPK";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}

	@Override
	public Map retrieveAll(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof CgRefCode){
				List<CgRefCode> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.cg_ref_code",
						new RowMapper<CgRefCode>() {
							public CgRefCode mapRow(ResultSet rs, int rowNum) throws SQLException {
								CgRefCode cgRefCodeObj = new CgRefCode();
								cgRefCodeObj.setDescription(rs.getString("description"));
								cgRefCodeObj.setDomain_label(rs.getString("domain_label"));
								cgRefCodeObj.setDomain_type(rs.getString("domain_type"));
								cgRefCodeObj.setDomain_value(rs.getString("domain_value"));
								return cgRefCodeObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(entity instanceof RoleTypesConfig){
				List<RoleTypesConfig> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.role_types_config",
						new RowMapper<RoleTypesConfig>() {
							public RoleTypesConfig mapRow(ResultSet rs, int rowNum) throws SQLException {
								RoleTypesConfig roleTypesConfigObj = new RoleTypesConfig();
								roleTypesConfigObj.setRoleId(rs.getLong("role_id"));
								roleTypesConfigObj.setRoleName(rs.getString("role_name"));
								roleTypesConfigObj.setRoleDescription(rs.getString("role_description"));
								roleTypesConfigObj.setRole_Type(rs.getString("role_Type"));
								roleTypesConfigObj.setInstitutionId(rs.getLong("institution_id"));
								roleTypesConfigObj.setRoleNameInsLevel(rs.getString("role_name_ins_level"));
								roleTypesConfigObj.setRoleDescInsLevel(rs.getString("role_desc_ins_level"));
								roleTypesConfigObj.setCreatedDate(rs.getDate("created_date"));
								roleTypesConfigObj.setCreatedBy(rs.getLong("created_by"));
								roleTypesConfigObj.setUpdatedDate(rs.getDate("updated_date"));
								roleTypesConfigObj.setUpdatedBy(rs.getLong("updated_by"));
								return roleTypesConfigObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);	
			}
			if(entity instanceof User){
				List<User> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.users",
						new RowMapper<User>() {
							public User mapRow(ResultSet rs, int rowNum) throws SQLException {
								User userObj = new User();
								userObj.setUserId(rs.getLong("user_id"));
								userObj.setUsername(rs.getString("username"));
								userObj.setPassword(rs.getString("password"));
								userObj.setEnabled(rs.getString("enabled"));
								userObj.setFirstName(rs.getString("first_name"));
								userObj.setMiddleName(rs.getString("middle_name"));
								userObj.setSurname(rs.getString("surname"));
								userObj.setDob(rs.getDate("dob"));
								userObj.setCreated_date(rs.getDate("created_date"));
								userObj.setUpdated_date(rs.getDate("updated_date"));
								userObj.setCreatedBy(rs.getLong("created_by"));
								userObj.setUpdatedBy(rs.getLong("updated_by"));
								return userObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(entity instanceof UserRole){
				List<UserRole> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.user_roles",
						new RowMapper<UserRole>() {
							public UserRole mapRow(ResultSet rs, int rowNum) throws SQLException {
								UserRole userRoleObj = new UserRole();
								userRoleObj.getUser1().setUserId(rs.getLong("user_id"));
								userRoleObj.getUser1().setUsername(rs.getString("username"));
								userRoleObj.getRoleTypesConfig().setRoleId(rs.getLong("role_id"));
								userRoleObj.getInstitution().setInstitutionId(rs.getLong("institution_id"));
								userRoleObj.setCreated_date(rs.getDate("created_date"));
								userRoleObj.setCreatedBy(rs.getLong("created_by"));
								userRoleObj.setUpdated_date(rs.getDate("updated_date"));
								userRoleObj.setUpdatedBy(rs.getLong("updated_by"));
								return userRoleObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "UserRoleActionDaoImplretrieveAll";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}


}
