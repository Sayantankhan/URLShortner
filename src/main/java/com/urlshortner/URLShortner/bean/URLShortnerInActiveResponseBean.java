package com.urlshortner.URLShortner.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class URLShortnerInActiveResponseBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("inactive_urls")
	private List<URLShortnerBean> shortUrllist;

	public List<URLShortnerBean> getShortUrllist() {
		return shortUrllist;
	}

	public void setShortUrllist(List<URLShortnerBean> shortUrllist) {
		this.shortUrllist = shortUrllist;
	}
	
}
