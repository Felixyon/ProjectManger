package com.projectmange.Entity;

public class Cursor {
    private int id;
    private String value;

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cursor{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
