package com.urlshortner.URLShortner.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.urlshortner.URLShortner.bean.URLShortnerBean;
import com.urlshortner.URLShortner.repository.URLShortnerCustomRepo;
import com.urlshortner.URLShortner.repository.URLShortnerRepo;

@Service
public class URLShortnerService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired 
	private URLShortnerRepo shortnerRepo;
	
	@Autowired
	private URLShortnerCustomRepo shortnerCustomRepo;
	
	public String getUrlfromShorter(String shortUrl) {
		Optional<URLShortnerBean> find_data = shortnerRepo.findById(shortUrl);
		URLShortnerBean urlBean = find_data.get();
		logger.info("Fetching Completed :: "+urlBean.toString());
		String live_url = null;
		if(urlBean != null) {
			live_url = urlBean.getLive_url();
		}
		return live_url;
	}
	
	public List<String> getStatusCheck() {
		
		return null;
	}
	
	public List<URLShortnerBean> getInactiveList(){
		List<URLShortnerBean> inactiveBeans = shortnerCustomRepo.fetchInActiveList();
		return inactiveBeans;
	}
}
