package io.github.rainestormee.jnewsapi.responses;

import io.github.rainestormee.jnewsapi.objects.NewsArticle;

import java.util.List;

public class TopHeadlinesResponse implements NewsResponse {

    private String status;
    private int totalArticles;
    private List<NewsArticle> articles;

    public TopHeadlinesResponse() {

    }

    public String getStatus() {
        return status;
    }

    public int getTotalArticles() {
        return totalArticles;
    }

    public List<NewsArticle> getArticles() {
        return articles;
    }
}
