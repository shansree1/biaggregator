package com.bi.biaggregator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * The ArtifactDetails is the class which helps Hibernate to map the table
 * BIAG_Artifact_Details
 *
 * @author Shan Sreenivas
 * @version 1.0
 * @since 2017-02-01
 */
@Entity
@Table(name = "BIAG_Artifact_Details")
public class ArtifactDetails {

	private Integer artifactId;
	private String artifactLongName;
	private String artifactDesc;
	private String artifactOwnerDept;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Artifact_ID", unique = true, nullable = false)
	public Integer getArtifactId() {
		return this.artifactId;
	}

	public void setArtifactId(Integer artifactId) {
		this.artifactId = artifactId;
	}

	@Column(name = "Artifact_Long_Name")
	public String getArtifactLongName() {
		return artifactLongName;
	}

	public void setArtifactLongName(String artifactLongName) {
		this.artifactLongName = artifactLongName;
	}

	@Column(name = "Artifact_Desc")
	public String getArtifactDesc() {
		return artifactDesc;
	}

	public void setArtifactDesc(String artifactDesc) {
		this.artifactDesc = artifactDesc;
	}

	@Column(name = "Artifact_Owner_Dept")
	public String getArtifactOwnerDept() {
		return artifactOwnerDept;
	}

	public void setArtifactOwnerDept(String artifactOwnerDept) {
		this.artifactOwnerDept = artifactOwnerDept;
	}

}
