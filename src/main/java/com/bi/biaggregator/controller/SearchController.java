package com.bi.biaggregator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bi.biaggregator.dto.SearchDto;
import com.bi.biaggregator.service.SearchService;

/**
 * The SearchController is the Controller class which handles HTTP Requests for
 * Searching
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */
@Controller
@RequestMapping("/search")
public class SearchController {

	private SearchService searchService;

	@Autowired
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

	/**
	 * This method is used to handle HTTP GET request for the searching.
	 * 
	 * @param searchParam
	 *            This is the parameter to getAllByParam method
	 * 
	 * @return SearchDto This returns the search result in json format.
	 */

	@RequestMapping(value = "/{searchParam}", method = RequestMethod.GET)
	@ResponseBody
	public SearchDto fetchbyParam(@PathVariable("searchParam") String searchParam) {

		SearchDto searchDto = new SearchDto();
		
		// need to change the user: hardcoded for testing
		Long userId = 123l;

		try {

			searchDto.setData(searchService.getAllByParam(searchParam,userId));

		} catch (Exception e) {
			searchDto.setException(true);
			e.printStackTrace();
		}

		return searchDto;

	}
}
