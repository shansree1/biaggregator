package com.bi.biaggregator.model;

import java.io.Serializable;

/**
 * The SearchResponceModel is the class which is the responce for the Search
 * result
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */
public class SearchResponceModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long artifactId;
	private String artifactLongName;
	private String artifactDesc;
	private String artifactOwnerDept;
	private String artifactMetaType;
	private String artifactMetaDesc;
	private String artifactFieldCount;
	private String artifactCustodianInfo;

	public Long getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(Long artifactId) {
		this.artifactId = artifactId;
	}

	public String getArtifactLongName() {
		return artifactLongName;
	}

	public void setArtifactLongName(String artifactLongName) {
		this.artifactLongName = artifactLongName;
	}

	public String getArtifactDesc() {
		return artifactDesc;
	}

	public void setArtifactDesc(String artifactDesc) {
		this.artifactDesc = artifactDesc;
	}

	public String getArtifactOwnerDept() {
		return artifactOwnerDept;
	}

	public void setArtifactOwnerDept(String artifactOwnerDept) {
		this.artifactOwnerDept = artifactOwnerDept;
	}

	public String getArtifactMetaType() {
		return artifactMetaType;
	}

	public void setArtifactMetaType(String artifactMetaType) {
		this.artifactMetaType = artifactMetaType;
	}

	public String getArtifactMetaDesc() {
		return artifactMetaDesc;
	}

	public void setArtifactMetaDesc(String artifactMetaDesc) {
		this.artifactMetaDesc = artifactMetaDesc;
	}

	public String getArtifactFieldCount() {
		return artifactFieldCount;
	}

	public void setArtifactFieldCount(String artifactFieldCount) {
		this.artifactFieldCount = artifactFieldCount;
	}

	public String getArtifactCustodianInfo() {
		return artifactCustodianInfo;
	}

	public void setArtifactCustodianInfo(String artifactCustodianInfo) {
		this.artifactCustodianInfo = artifactCustodianInfo;
	}

}
