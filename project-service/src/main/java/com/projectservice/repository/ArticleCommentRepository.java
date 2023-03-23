package com.projectservice.repository;

import com.projectservice.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ArticleCommentRepository extends JpaRepository<ArticleComment,Long> {
}
