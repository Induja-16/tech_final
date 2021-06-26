package com.example.tech_final;

public class MainModel {
    private Nutrition nutrition;
    private String id;
    private String title;

    public MainModel(Nutrition nutrition, String id, String title) {
        this.nutrition = nutrition;
        this.id = id;
        this.title = title;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

}
