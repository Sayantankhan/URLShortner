package com.urlshortner.URLShortner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urlshortner.URLShortner.bean.URLShortnerBean;

@Repository
public interface URLShortnerRepo extends JpaRepository<URLShortnerBean, String>{	
}
