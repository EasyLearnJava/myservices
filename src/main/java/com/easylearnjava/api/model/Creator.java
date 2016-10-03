package com.easylearnjava.api.model;

import org.springframework.hateoas.ResourceSupport;

public class Creator extends ResourceSupport {

	private String creatorName = "Raghu";
	private String message = "Welcome to my java tutorials...";
	private String websiteURL = "www.easylearnjava.com";
	private String gitURL = "https://github.com/EasyLearnJava";

	public Creator() {

	}

	public Creator(String creatorName, String message, String websiteURL, String gitURL) {
		super();
		this.creatorName = creatorName;
		this.message = message;
		this.websiteURL = websiteURL;
		this.gitURL = gitURL;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

	public String getGitURL() {
		return gitURL;
	}

	public void setGitURL(String gitURL) {
		this.gitURL = gitURL;
	}

}
