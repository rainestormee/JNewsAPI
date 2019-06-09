package io.github.rainestormee.jnewsapi.responses;

import io.github.rainestormee.jnewsapi.objects.NewsArticle;

import java.util.List;

public class EverythingResponse implements NewsResponse {

    private String status;
    private int totalResults;
    private List<NewsArticle> articles;

    public EverythingResponse() {
    }

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<NewsArticle> getArticles() {
        return articles;
    }
}
