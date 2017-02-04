package com.bi.biaggregator.dto;

import java.util.List;

import com.bi.biaggregator.model.SearchResponceModel;

/**
 * The SearchDto is the class which is the responce for the Search result
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */
public class SearchDto {

	private List<SearchResponceModel> data;
	private Boolean exception;

	public Boolean getException() {
		return exception;
	}

	public void setException(Boolean exception) {
		this.exception = exception;
	}

	public List<SearchResponceModel> getData() {
		return data;
	}

	public void setData(List<SearchResponceModel> data) {
		this.data = data;
	}

}
