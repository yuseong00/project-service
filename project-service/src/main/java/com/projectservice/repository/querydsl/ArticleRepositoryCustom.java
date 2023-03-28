package com.projectservice.repository.querydsl;


import com.projectservice.domain.Article;
import com.projectservice.domain.QArticle;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;



public interface ArticleRepositoryCustom {
    List<String> findAllDistinctHashtags();
}