package com.bi.biaggregator.dao;

import java.util.List;

import com.bi.biaggregator.model.SearchResponceModel;

/**
 * The SearchDao is the Interface that is implemented in SearchDAOImpl This
 * inteface is the abstract method for all methods related to search
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */
public interface SearchDao {

	
	/*
	 * This Abstract Method is implemented in SearchDao for getting the search result 
	 * 
	 * @param searchParam 
	 * 			The search keyword that is used for searching
	 * @param userId 
	 * 			The user id of the users to check the user have access in the application
	 * @response List<SearchResponceModel>
	 * 			The list of Search data fetched form Database
	 * @see com.bi.biaggregator.dao.SearchDao#getAllByParam(java.lang.String,
	 * java.lang.Long)
	 */
	List<SearchResponceModel> getAllByParam(String searchParam,Long userId);
}
