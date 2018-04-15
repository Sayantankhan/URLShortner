package com.urlshortner.URLShortner.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.urlshortner.URLShortner.bean.URLShortnerBean;
import com.urlshortner.URLShortner.repository.URLShortnerCustomRepo;
import com.urlshortner.URLShortner.repository.URLShortnerRepo;

import static com.urlshortner.URLShortner.constant.URLShortnerConstant.*;

@Repository
public class URLShortnerCustomRepoImpl implements URLShortnerCustomRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<URLShortnerBean> fetchInActiveList() {
		List<URLShortnerBean> inactiveUrlList = jdbcTemplate
				.query(INACTIVE_URL_QUERY,new BeanPropertyRowMapper(URLShortnerBean.class));
		return inactiveUrlList;
	}

}
