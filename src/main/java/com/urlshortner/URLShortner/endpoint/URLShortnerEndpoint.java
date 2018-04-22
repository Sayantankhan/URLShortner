package com.urlshortner.URLShortner.endpoint;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.urlshortner.URLShortner.bean.URLShortnerBean;
import com.urlshortner.URLShortner.bean.URLShortnerInActiveResponseBean;
import com.urlshortner.URLShortner.service.URLShortnerService;
import static com.urlshortner.URLShortner.constant.URLShortnerConstant.*;

import java.util.List;

@RestController
public class URLShortnerEndpoint {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private URLShortnerService urlShortnerService;
	
	@GetMapping(path="/{shortUrl}")
	@CrossOrigin
	public void fetchUrl(@PathVariable("shortUrl") String shortURL,HttpServletResponse response) {
		logger.info("Given URL :: "+shortURL);
		String live_url = urlShortnerService.getUrlfromShorter(shortURL);
		response.setStatus(HTTP_STATUS_FOUND);
		response.addHeader("location", live_url);
	}
	
}
