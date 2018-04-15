package com.urlshortner.URLShortner.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_shorturl")
public class URLShortnerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	private String live_url;
	private String description;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="shorturl")
	private String shortUrl;
	private String status;
	
	public URLShortnerBean() {
		super();
	}

	public URLShortnerBean(String live_url, String description, String shortUrl, String status) {
		super();
		this.live_url = live_url;
		this.description = description;
		this.shortUrl = shortUrl;
		this.status = status;
	}
	
	public String getLive_url() {
		return live_url;
	}
	public void setLive_url(String live_url) {
		this.live_url = live_url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getShortUrl() {
		return shortUrl;
	}
	public void setShortUrl(String shortUrl) {
		this.shortUrl = shortUrl;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		URLShortnerBean other = (URLShortnerBean) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (live_url == null) {
			if (other.live_url != null)
				return false;
		} else if (!live_url.equals(other.live_url))
			return false;
		if (shortUrl == null) {
			if (other.shortUrl != null)
				return false;
		} else if (!shortUrl.equals(other.shortUrl))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "URLShortnerBean [status=" + status + ", live_url=" + live_url + ", description=" + description
				+ ", shortUrl=" + shortUrl + "]";
	}
}
