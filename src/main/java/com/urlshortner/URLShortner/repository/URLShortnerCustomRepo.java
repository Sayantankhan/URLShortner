package com.urlshortner.URLShortner.repository;

import java.util.List;

import com.urlshortner.URLShortner.bean.URLShortnerBean;

public interface URLShortnerCustomRepo {
	
	public List<URLShortnerBean> fetchInActiveList();
}
