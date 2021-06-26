package com.example.tech_final;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Menu {
    private List<Results> results;

    public Menu(List<Results> results) {
        this.results = results;


    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

}

