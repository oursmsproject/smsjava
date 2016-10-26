package com.sms.institutionModule.dao;

import java.util.Map;

public interface InstitutionDao {
	Map create(Object entity) ;
	/*
	 * For Institution PK is institution_id
	 */
	Map updateByPK(Object entity);
	/*
	 * For Institution PK is institution_id
	 */
	Map deleteByPK(Object entity) ;
	/*
	 * For Institution PK is institution_id
	 */
	Map retrieveByPK(Object entity);
	Map retrieveAll(Object entity) ;
}
