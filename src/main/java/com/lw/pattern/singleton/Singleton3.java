package com.lw.pattern.singleton;

public enum Singleton3 {
    SINGLETON;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
