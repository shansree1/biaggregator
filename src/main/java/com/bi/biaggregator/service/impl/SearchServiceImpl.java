package com.bi.biaggregator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bi.biaggregator.dao.SearchDao;
import com.bi.biaggregator.dao.impl.SearchDaoImpl;
import com.bi.biaggregator.model.SearchResponceModel;
import com.bi.biaggregator.service.SearchService;

/**
 * The SearchServiceImpl is the method that implements the SearchService This
 * class is the implemention for all methods related to search
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */

@Component
public class SearchServiceImpl implements SearchService {
	
	
	private SearchDao searchDao;

	@Autowired
	public void setSearchDao(SearchDaoImpl searchDao) {
		this.searchDao = searchDao;
	}
	
	/*
	 * This Method getAllByParam fetches the searched data.
	 * calls SearchDao get getAllByParam
	 * 
	 * @param searchParam 
	 * 			The search keyword that is used for searching
	 * @param userId 
	 * 			The user id of the users to check the user have access in the application
	 * @response List<SearchResponceModel>
	 * 			The list of Search data fetched form Database
	 * @see com.bi.biaggregator.service.SearchDao#getAllByParam(java.lang.String,
	 * java.lang.Long)
	 */
	public List<SearchResponceModel> getAllByParam(String searchParam,Long userId) {

		return searchDao.getAllByParam(searchParam,userId);
	}

}
