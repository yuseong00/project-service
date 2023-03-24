package com.projectservice.service;

import com.projectservice.domain.Article;
import com.projectservice.domain.Type.SearchType;
import com.projectservice.dto.ArticleDto;
import com.projectservice.dto.ArticleUpdateDto;
import com.projectservice.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직-게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks
    private ArticleService sut;  // 시스템 대상

    @Mock private ArticleRepository articleRepository;


    @DisplayName("게시글을 검색하면, 게시글 리스트를 반환")
    @Test
    void 검색_기능()throws Exception{
    //given

    //when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); //제목, 본문,id, 닉네임, 해시태그


        assertThat(articles).isNotNull();

    }


    @DisplayName("아이디로 게시글을 조회하면, 게시글을 반환")
    @Test
    void 아이디로_게시글_반환()throws Exception{
        //given

        //when
        ArticleDto articles = sut.searchArticle(1L); //제목, 본문,id, 닉네임, 해시태그


        assertThat(articles).isNotNull();

    }


    @DisplayName("게시글 정보를 입력하면, 게시글을 생성")
    @Test
    void 게시글_생성()throws Exception{
        // Given
        given(articleRepository.save(any(Article.class))).willReturn(null);

        // When
        sut.saveArticle(ArticleDto.of(LocalDateTime.now(), "ys", "title", "content", "#java"));

        // Then
        then(articleRepository).should().save(any(Article.class));

    }

    @DisplayName("게시글의 ID와 수정정보를 입력하면 게시글 수정")
    @Test
    void 게시글_수정()throws Exception{
        // Given
        given(articleRepository.save(any(Article.class))).willReturn(null);

        // When
        sut.updateArticle(1L, ArticleUpdateDto.of("title", "content", "#java"));

        // Then
        then(articleRepository).should().save(any(Article.class));

    }


    @DisplayName("게시글의 ID를 입력하면, 게시글을 삭제한다")
    @Test
    void 게시글_삭제() {
        // Given
        willDoNothing().given(articleRepository).delete(any(Article.class));

        // When
        sut.deleteArticle(1L);

        // Then
        then(articleRepository).should().delete(any(Article.class));
    }

}