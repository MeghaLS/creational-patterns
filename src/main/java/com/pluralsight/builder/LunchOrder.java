package com.pluralsight.builder;
/*
    Builder class
 */
public class LunchOrder {

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.meat = builder.meat;
        this.dressings = builder.dressings;

    }
    public LunchOrder() {
    }
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressings;
        private String meat;

        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
        public Builder dressings(String dressings) {
            this.dressings = dressings;
            return this;
        }
    }
    private String bread;
    private String condiments;
    private String dressings;
    private String meat;

    public String getBread() { return bread; }

    public String getCondiments() {
        return condiments;
    }

    public String getDressings() {
        return dressings;
    }

    public String getMeat() {
        return meat;
    }

}
