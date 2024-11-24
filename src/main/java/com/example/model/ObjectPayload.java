package com.example.model;

import com.example.model.DataRecord;

import java.util.List;

public class ObjectPayload {
    private String name;
    private List<DataRecord> data;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DataRecord> getData() {
        return data;
    }

    public void setData(List<DataRecord> data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "ObjectPayload{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}