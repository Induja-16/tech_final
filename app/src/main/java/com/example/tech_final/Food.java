package com.example.tech_final;

public class Food {
    private String id;
    private String title;
    private String sourceUrl;

    public Food(String id, String title, String sourceUrl) {
        this.id = id;
        this.title = title;
        this.sourceUrl = sourceUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}
