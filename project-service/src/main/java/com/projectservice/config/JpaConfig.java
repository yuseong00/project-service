package com.projectservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.MappedSuperclass;
import java.util.Optional;

@MappedSuperclass
@EnableJpaAuditing
public class JpaConfig {

    @Bean
    public AuditorAware<String>auditorAware(){
        return () -> Optional.of("ys"); //todo 스프링 시큐리티로 인증기능을 붙이게 될때, 수정하자.
    }



}
