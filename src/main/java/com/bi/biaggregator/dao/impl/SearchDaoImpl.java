package com.bi.biaggregator.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.hibernate.type.LongType;
import org.springframework.stereotype.Component;

import com.bi.biaggregator.dao.SearchDao;
import com.bi.biaggregator.model.SearchResponceModel;
import com.bi.biaggregator.util.BiSQLConstant;
import com.bi.biaggregator.util.ConnectionUtil;


/**
 * The SearchDaoImpl is the method that implements the SearchDAO and BiSQLConstant
 * This class is the implemention for all methods related to search 
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */

@Component
public class SearchDaoImpl implements SearchDao, BiSQLConstant {

	/*
	 * This Method fetches the searched data from the tables
	 * BIAG_Artifact_Details and BIAG_Artifact_Meta_Info
	 * 
	 * @param searchParam The search keyword that is used for searching
	 * 
	 * @param userId The user id of the users to check the user have access in
	 * the application
	 * 
	 * @response List<SearchResponceModel> The list of Search data fetched form
	 * Database
	 * 
	 * @see com.bi.biaggregator.dao.SearchDao#getAllByParam(java.lang.String,
	 * java.lang.Long)
	 */

	@SuppressWarnings("unchecked")
	public List<SearchResponceModel> getAllByParam(String searchParam, Long userId) {
		
		List<SearchResponceModel> listSearchResponce = null;
		Session session = ConnectionUtil.getSessionFactory().openSession();
		try{
		listSearchResponce = session.createSQLQuery(SQL_SEARCH_BY_PARAM)
				.addScalar(PARAM_ARTIFACT_ID, LongType.INSTANCE).addScalar(PARAM_ARTIFACT_LONG_NAME)
				.addScalar(PARAM_ARTIFACT_DESC).addScalar(PARAM_ARTIFACT_OWNER_DEPT).addScalar(PARAM_ARTIFACT_META_TYPE)
				.addScalar(PARAM_ARTIFACT_META_DESC).addScalar(PARAM_ARTIFACT_FIELD_COUNT)
				.addScalar(PARAM_ARTIFACT_CUSTODIAN_INFO).setParameter(INPARAM_SEARCH_PARAMETER, "%"+searchParam.toLowerCase()+"%")
				.setParameter(INPARAM_USER, userId)
				.setResultTransformer(Transformers.aliasToBean(SearchResponceModel.class)).list();
		}catch (Exception e) {
			// need to throw custom exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return listSearchResponce;
	}

}
