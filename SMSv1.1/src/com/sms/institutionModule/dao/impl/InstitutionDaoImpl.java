package com.sms.institutionModule.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sms.institutionModule.dao.InstitutionDao;
import com.sms.model.CgRefCode;
import com.sms.model.Institution;

@Repository
public class InstitutionDaoImpl implements InstitutionDao {

	private Logger logger = Logger.getLogger(InstitutionDaoImpl.class);

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
			if(entity instanceof Institution){    
				Institution institutionObj = (Institution)entity;
				sqlQuery = "INSERT INTO sms.institution ("
						+ " institution_name,"
						+ " institution_registraion_code,"
						+ " ins_address_line1,"
						+ " ins_address_line2,"
						+ " ins_type,"
						+ " ins_parent_id,"
						+ " ins_status,"
						+ " ins_phone,"
						+ " ins_alt_phone,"
						+ " ins_fax,"
						+ " ins_email,"
						+ " ins_website_url,"
						+ " ins_country,"
						+ " ins_state,"
						+ " ins_city,"
						+ " ins_pin_code,"
						+ " ins_date_of_inception,"
						+ " created_by,"
						+ " ins_head_id,"
						+ " ins_head_name,"
						+ " ins_head_email_id,"
						+ " ins_head_office_no,"
						+ " ins_head_personal_no,"
						+ " ins_board,"
						+ " ins_examination_code,"
						+ " ins_medium_of_education)VALUES ('"
						+ institutionObj.getInstitutionName() +"','"
						+ institutionObj.getInstitutionRegistraionCode() +"','"
						+ institutionObj.getInsAddressLine1() +"','"
						+ institutionObj.getInsAddressLine2() +"','"
						+ institutionObj.getInsType() +"',"
						+ institutionObj.getInsParentId() +",'"
						+ institutionObj.getInsStatus() +"','"
						+ institutionObj.getInsPhone() +"','"
						+ institutionObj.getInsAltPhone() +"','"
						+ institutionObj.getInsFax() +"','"
						+ institutionObj.getInsEmail() +"','"
						+ institutionObj.getInsWebsiteUrl() +"','"
						+ institutionObj.getInsCountry() +"','"
						+ institutionObj.getInsState() +"','"
						+ institutionObj.getInsCity() +"','"
						+ institutionObj.getInsPinCode() +"',STR_TO_DATE('"
						+ institutionObj.getInsDateOfInception() +"', '%m/%d/%Y'),"
						+ institutionObj.getCreatedBy() +","
						+ institutionObj.getInsHeadId() +",'"
						+ institutionObj.getInsHeadName() +"','"
						+ institutionObj.getInsHeadEmailId() +"','"
						+ institutionObj.getInsHeadOfficeNo() +"','"
						+ institutionObj.getInsHeadPersonalNo() +"','"
						+ institutionObj.getInsBoard() +"','"
						+ institutionObj.getInsExaminationCode() +"','"
						+ institutionObj.getInsMediumOfEducation() +"')";
			}
			logger.info(sqlQuery);
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "InstitutionDaoImplcreate";
			logger.error(errorCode+"-"+errorMsg+"-"+entity.getClass().toString());
		}
		returnMap.put("errorCode", errorCode); 
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}

	/*
	 * For Institution PK is institution_id
	 */
	@Override
	public Map updateByPK(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof Institution){
				Institution institutionObj = (Institution)entity;
				sqlQuery = "update sms.institution set institution_name="+institutionObj.getInstitutionName()
						+ ", institution_registraion_code="+institutionObj.getInstitutionRegistraionCode()
						+ ", ins_address_line1="+institutionObj.getInsAddressLine1()
						+ ", ins_address_line2="+institutionObj.getInsAddressLine2()
						+ ", ins_type="+institutionObj.getInsType()
						+ ", ins_parent_id="+institutionObj.getInsParentId()
						+ ", ins_status="+institutionObj.getInsStatus()
						+ ", ins_phone="+institutionObj.getInsPhone()
						+ ", ins_alt_phone="+institutionObj.getInsAltPhone()
						+ ", ins_fax="+institutionObj.getInsFax()
						+ ", ins_email="+institutionObj.getInsEmail()
						+ ", ins_website_url="+institutionObj.getInsWebsiteUrl()
						+ ", ins_country="+institutionObj.getInsCountry()
						+ ", ins_state="+institutionObj.getInsState()
						+ ", ins_city="+institutionObj.getInsCity()
						+ ", ins_pin_code="+institutionObj.getInsPinCode()
						+ ", ins_date_of_inception="+institutionObj.getInsDateOfInception()
						+ ", updated_by="+institutionObj.getUpdatedBy()
						+ ", ins_head_id="+institutionObj.getInsHeadId()
						+ ", ins_head_name="+institutionObj.getInsHeadName()
						+ ", ins_head_email_id="+institutionObj.getInsHeadEmailId()
						+ ", ins_head_office_no="+institutionObj.getInsHeadOfficeNo()
						+ ", ins_head_personal_no="+institutionObj.getInsHeadPersonalNo()
						+ ", ins_board="+institutionObj.getInsBoard()
						+ ", ins_examination_code="+institutionObj.getInsExaminationCode()
						+ ", ins_medium_of_education="+institutionObj.getInsMediumOfEducation()
						+" where institution_id="+institutionObj.getInstitutionId();
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "InstitutionDaoImplupdateByPK";
			logger.error(errorCode+"-"+errorMsg+"-"+entity.getClass().toString());
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}

	/*
	 * For Institution PK is institution_id
	 */
	@Override
	public Map deleteByPK(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof Institution){
				Institution institutionObj = (Institution)entity;
				sqlQuery = "delete from sms.institution where institution_id = "+institutionObj.getInstitutionId();
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "InstitutionDaoImpldeleteByPK";
			logger.error(errorCode+"-"+errorMsg+"-"+entity.getClass().toString());
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		returnMap.put("noOfRowsImpacted", noOfRowsImpacted);
		return returnMap;
	}

	/*
	 * For Institution PK is institution_id
	 */
	@Override
	public Map retrieveByPK(Object entity) {
		String sqlQuery = null;
		int noOfRowsImpacted = 0;
		String errorCode = "";
		String errorMsg = "";
		Map returnMap = new HashMap();
		try{
			if(entity instanceof Institution){
				List<Institution> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.institution where institution_id="+((Institution)entity).getInstitutionId(),
						new RowMapper<Institution>() {
							public Institution mapRow(ResultSet rs, int rowNum) throws SQLException {
								Institution institutionObj = new Institution();
								institutionObj.setInstitutionId(rs.getLong("institution_id"));
								institutionObj.setInstitutionName(rs.getString("institution_name"));
								institutionObj.setInstitutionRegistraionCode(rs.getString("institution_registraion_code"));
								institutionObj.setInsAddressLine1(rs.getString("ins_address_line1"));
								institutionObj.setInsAddressLine2(rs.getString("ins_address_line2"));
								institutionObj.setInsType(rs.getString("ins_type"));
								institutionObj.setInsParentId(rs.getLong("ins_parent_id"));
								institutionObj.setInsStatus(rs.getString("ins_status"));
								institutionObj.setInsPhone(rs.getString("ins_phone"));
								institutionObj.setInsAltPhone(rs.getString("ins_alt_phone"));
								institutionObj.setInsFax(rs.getString("ins_fax"));
								institutionObj.setInsEmail(rs.getString("ins_email"));
								institutionObj.setInsWebsiteUrl(rs.getString("ins_website_url"));
								institutionObj.setInsCountry(rs.getString("ins_country"));
								institutionObj.setInsState(rs.getString("ins_state"));
								institutionObj.setInsCity(rs.getString("ins_city"));
								institutionObj.setInsPinCode(rs.getString("ins_pin_code"));
								institutionObj.setInsDateOfInception(rs.getString("ins_date_of_inception"));
								institutionObj.setCreatedBy(rs.getLong("created_by"));
								institutionObj.setUpdatedBy(rs.getLong("updated_by"));
								institutionObj.setCreatedDate(rs.getDate("created_date"));
								institutionObj.setUpdatedDate(rs.getDate("updated_date"));
								institutionObj.setInsHeadId(rs.getLong("ins_head_id"));
								institutionObj.setInsHeadName(rs.getString("ins_head_name"));
								institutionObj.setInsHeadEmailId(rs.getString("ins_head_email_id"));
								institutionObj.setInsHeadOfficeNo(rs.getString("ins_head_office_no"));
								institutionObj.setInsHeadPersonalNo(rs.getString("ins_head_personal_no"));
								institutionObj.setInsBoard(rs.getString("ins_board"));
								institutionObj.setInsExaminationCode(rs.getString("ins_examination_code"));
								institutionObj.setInsMediumOfEducation(rs.getString("ins_medium_of_education"));
								return institutionObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "InstitutionDaoImplretrieveByPK";
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
			if(entity instanceof Institution){
				List<Institution> listOfObjects = this.jdbcTemplate.query(
						"select * from sms.institution",
						new RowMapper<Institution>() {
							public Institution mapRow(ResultSet rs, int rowNum) throws SQLException {
								Institution institutionObj = new Institution();
								institutionObj.setInstitutionId(rs.getLong("institution_id"));
								institutionObj.setInstitutionName(rs.getString("institution_name"));
								institutionObj.setInstitutionRegistraionCode(rs.getString("institution_registraion_code"));
								institutionObj.setInsAddressLine1(rs.getString("ins_address_line1"));
								institutionObj.setInsAddressLine2(rs.getString("ins_address_line2"));
								institutionObj.setInsType(rs.getString("ins_type"));
								institutionObj.setInsParentId(rs.getLong("ins_parent_id"));
								institutionObj.setInsStatus(rs.getString("ins_status"));
								institutionObj.setInsPhone(rs.getString("ins_phone"));
								institutionObj.setInsAltPhone(rs.getString("ins_alt_phone"));
								institutionObj.setInsFax(rs.getString("ins_fax"));
								institutionObj.setInsEmail(rs.getString("ins_email"));
								institutionObj.setInsWebsiteUrl(rs.getString("ins_website_url"));
								institutionObj.setInsCountry(rs.getString("ins_country"));
								institutionObj.setInsState(rs.getString("ins_state"));
								institutionObj.setInsCity(rs.getString("ins_city"));
								institutionObj.setInsPinCode(rs.getString("ins_pin_code"));
								institutionObj.setInsDateOfInception(rs.getString("ins_date_of_inception"));
								institutionObj.setCreatedBy(rs.getLong("created_by"));
								institutionObj.setUpdatedBy(rs.getLong("updated_by"));
								institutionObj.setCreatedDate(rs.getDate("created_date"));
								institutionObj.setUpdatedDate(rs.getDate("updated_date"));
								institutionObj.setInsHeadId(rs.getLong("ins_head_id"));
								institutionObj.setInsHeadName(rs.getString("ins_head_name"));
								institutionObj.setInsHeadEmailId(rs.getString("ins_head_email_id"));
								institutionObj.setInsHeadOfficeNo(rs.getString("ins_head_office_no"));
								institutionObj.setInsHeadPersonalNo(rs.getString("ins_head_personal_no"));
								institutionObj.setInsBoard(rs.getString("ins_board"));
								institutionObj.setInsExaminationCode(rs.getString("ins_examination_code"));
								institutionObj.setInsMediumOfEducation(rs.getString("ins_medium_of_education"));
								return institutionObj;
							}
						});
				returnMap.put("noOfRowsImpacted", listOfObjects.size());
				returnMap.put("listOfObjects", listOfObjects);
			}
			if(sqlQuery != null)
				noOfRowsImpacted = jdbcTemplate.update(sqlQuery);
		}catch(Exception ex){
			errorMsg = ex.getMessage();
			errorCode = "InstitutionDaoImplretrieveAll";
			logger.error(errorCode+"-"+errorMsg);
		}
		returnMap.put("errorCode", errorCode);
		returnMap.put("errorMsg", errorMsg);
		return returnMap;
	}


}
