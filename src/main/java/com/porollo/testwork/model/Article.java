package com.porollo.testwork.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data

public class Article implements Serializable {

    @Id
    @GeneratedValue
    @Column(length=100)
    private Long id;

    @NonNull
    @Column(length=100)
    private String name;

    @NonNull
    @Column(length=100)
    private String author;

    @NonNull
    @Column(length=100)
    private String content;

    @NonNull
    @Column(length=100)
    private Date date; //Fix

    @NonNull
    @Column(length=100)
    private Boolean result;

    public Article() {
    }

    public Article(String name, String author, String content, Date date, Boolean result) {
        this.name = name;
        this.author = author;
        this.content = content;
        this.date = date;
        this.result = result;
    }
}
