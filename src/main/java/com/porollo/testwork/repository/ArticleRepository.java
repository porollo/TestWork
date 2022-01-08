package com.porollo.testwork.repository;

import com.porollo.testwork.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    public Article findByName(String name);
    public Article findByAuthor(String author);
    public Article findByContent(String content);
    public Article findByDate(String date);
    public Article findByResult(String result);

    public Article findAllByName(String name);
    public Article findAllByAuthor(String author);
    public Article findAllByContent(String content);
    public Article findAllByDate(String date);
    public Article findAllByResult(String result);

}