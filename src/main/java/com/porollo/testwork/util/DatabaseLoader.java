package com.porollo.testwork.util;

import com.porollo.testwork.model.Article;
import com.porollo.testwork.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ArticleRepository articleRepository;

    @Autowired
    public DatabaseLoader(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.articleRepository.save(new Article("Animals", "Dmitriy", "Cats is fine animals ", new Date(2017,10,22), true));
    }
}
