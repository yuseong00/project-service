package com.projectservice.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("뷰 Controller-게시글")
@WebMvcTest(ArticleControllerTest.class)
class ArticleControllerTest {


    private final MockMvc mvc ;

    public ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }


    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 리스트 페이지")
    @Test
    public void 게시글_리스트페이지_정상호출 ()throws Exception{

        mvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/index"))
                .andExpect(model().attributeExists("articles"));
    }

    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 상세리스트 페이지")
    @Test
    public void 게시글상세페이지_정상호출 ()throws Exception{

        mvc.perform(get("/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("article"))
                .andExpect(model().attributeExists("articlesComments"));
    }


    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 검색 전용 페이지")
    @Test
    public void 게시글_검색전용페이지_정상호출 ()throws Exception{

        mvc.perform(get("/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML));
    }



    @Disabled("구현중")
    @DisplayName("[view][GET] 게시글 해시태그검색 페이지")
    @Test
    public void 게시글_해시태그검색_페이지_정상호출 ()throws Exception{

        mvc.perform(get("/articles/search-hashtag"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML));
    }

}