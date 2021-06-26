package com.example.tech_final;

public class Model {
    private String id;
    private String title;
    private Nutrition nutrition;

    public Model(String id, String title, Nutrition nutrition) {
        this.id = id;
        this.title = title;
        this.nutrition = nutrition;
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

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }
}
