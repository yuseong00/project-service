package com.projectservice.config;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QJpaConfig is a Querydsl query type for JpaConfig
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QJpaConfig extends EntityPathBase<JpaConfig> {

    private static final long serialVersionUID = 1978535158L;

    public static final QJpaConfig jpaConfig = new QJpaConfig("jpaConfig");

    public QJpaConfig(String variable) {
        super(JpaConfig.class, forVariable(variable));
    }

    public QJpaConfig(Path<? extends JpaConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJpaConfig(PathMetadata metadata) {
        super(JpaConfig.class, metadata);
    }

}

