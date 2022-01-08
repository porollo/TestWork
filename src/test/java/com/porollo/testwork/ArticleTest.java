package com.porollo.testwork;

import com.porollo.testwork.model.Article;
import com.porollo.testwork.repository.ArticleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ArticleTest {

    @Autowired
    ArticleRepository articleRepository;

    @Test
    public void myTest() throws Exception {
        articleRepository.save(new Article());
    }
}