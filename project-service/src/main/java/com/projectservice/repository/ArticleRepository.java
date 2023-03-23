package com.projectservice.repository;

import com.projectservice.domain.Article;
import com.projectservice.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
