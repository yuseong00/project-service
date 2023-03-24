package com.projectservice.service;

import com.projectservice.domain.Type.SearchType;
import com.projectservice.dto.ArticleDto;
import com.projectservice.dto.ArticleUpdateDto;
import com.projectservice.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    //게시글 조회
    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String search_keyword) {
        return Page.empty();

    }

    //아이디로 게시글 조회
    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {


    }

    public void updateArticle(long articleId, ArticleUpdateDto articleUpdateDto) {

    }

    public void deleteArticle(long articleId) {
    }
}
