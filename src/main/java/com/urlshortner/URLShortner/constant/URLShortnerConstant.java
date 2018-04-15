package com.urlshortner.URLShortner.constant;

public interface URLShortnerConstant {
	
	//http Status code
	public int HTTP_STATUS_FOUND = 302;
	public int HTTP_STATUS_OK = 200;
	
	//query Portion
	public String INACTIVE_URL_QUERY = "select * from tbl_shorturl where status = 'inactive'";

}
