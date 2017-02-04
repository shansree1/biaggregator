package com.bi.biaggregator.util;

/**
 * The BiSQLConstant is the Interface that used to declare all the SQL related
 * constants
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */
public interface BiSQLConstant {

	/*
	 * SQL query for getting data from BIAG_Artifact_Details and
	 * BIAG_Artifact_Meta_Info input parameter : searchParam and userId
	 */
	String SQL_SEARCH_BY_PARAM = "SELECT * FROM (SELECT " + "    detail.Artifact_ID artifactId,"
			+ "    detail.Artifact_Long_Name artifactLongName," + "    detail.Artifact_Desc artifactDesc,"
			+ "    detail.Artifact_Owner_Dept artifactOwnerDept," + "   meta.Artifact_Meta_Type artifactMetaType,"
			+ "    meta.Artifact_Meta_Desc artifactMetaDesc," + "    meta.Artifact_Field_Count artifactFieldCount,"
			+ "    meta.Artifact_Custodian_Info artifactCustodianInfo" + " FROM" + "    BIAG_Artifact_Details detail"
			+ "    LEFT JOIN" + "    BIAG_Artifact_Meta_Info meta" + " ON detail.Artifact_ID = meta.Artifact_ID"
			+ "   WHERE" + "   (LOWER(detail.Artifact_Long_Name) LIKE :searchParam"
			+ "        OR LOWER(detail.Artifact_Desc) LIKE :searchParam"
			+ "        OR LOWER(detail.Artifact_Owner_Dept) LIKE :searchParam"
			+ "        OR LOWER(meta.Artifact_Meta_Type) LIKE :searchParam"
			+ "        OR LOWER(meta.Artifact_Meta_Desc) LIKE :searchParam)) XX"
			+ " WHERE (SELECT USER_ID FROM BIAG_User_Details WHERE USER_ID= :userId) = :userId";

	String PARAM_ARTIFACT_ID = "artifactId";
	String PARAM_ARTIFACT_LONG_NAME = "artifactLongName";
	String PARAM_ARTIFACT_DESC = "artifactDesc";
	String PARAM_ARTIFACT_OWNER_DEPT = "artifactOwnerDept";
	String PARAM_ARTIFACT_META_TYPE = "artifactMetaType";
	String PARAM_ARTIFACT_META_DESC = "artifactMetaDesc";
	String PARAM_ARTIFACT_FIELD_COUNT = "artifactFieldCount";
	String PARAM_ARTIFACT_CUSTODIAN_INFO = "artifactCustodianInfo";

	String INPARAM_SEARCH_PARAMETER = "searchParam";
	String INPARAM_USER = "userId";
}
