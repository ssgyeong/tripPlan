package com.teamProject.tripPlan.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//Getter, Setter || Data 다 오류나길래 일단 모든 entity 다 getter, setter 적었어요!
@Entity
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long keywordId;
    private String keyword;

    @ManyToMany(mappedBy = "keywords", fetch = FetchType.LAZY)
    private List<Post> posts = new ArrayList<>();

    public Keyword() {}

    public Keyword(String keyword) {
        this.keyword = keyword;
    }

    public Long getKeywordId() {
        return keywordId;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
