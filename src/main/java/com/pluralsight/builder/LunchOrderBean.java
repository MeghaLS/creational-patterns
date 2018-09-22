package com.pluralsight.builder;

public class LunchOrderBean {
    private String bread;
    private String condiments;
    private String dressings;
    private String meat;

    public LunchOrderBean() {
    }

    public String getBread() {

        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressings() {
        return dressings;
    }

    public void setDressings(String dressings) {
        this.dressings = dressings;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
