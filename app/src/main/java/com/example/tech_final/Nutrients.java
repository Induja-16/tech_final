package com.example.tech_final;

public class Nutrients {
    private String name;
    private String title;
    private String amount;
    private String unit;
    private String percentOfDailyNeeds;

    public Nutrients(String name, String title, String amount, String unit, String percentOfDailyNeeds) {
        this.name = name;
        this.title = title;
        this.amount = amount;
        this.unit = unit;
        this.percentOfDailyNeeds = percentOfDailyNeeds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPercentOfDailyNeeds() {
        return percentOfDailyNeeds;
    }

    public void setPercentOfDailyNeeds(String percentOfDailyNeeds) {
        this.percentOfDailyNeeds = percentOfDailyNeeds;
    }
}

