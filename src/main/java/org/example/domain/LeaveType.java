package org.example.domain;

public class LeaveType {
    private Long id;
    private String name;
    private String description;
    private int defaultDays;

    public LeaveType(Long id, String name, String description, int defaultDays) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.defaultDays = defaultDays;
    }

    public LeaveType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDefaultDays() {
        return defaultDays;
    }

    public void setDefaultDays(int defaultDays) {
        this.defaultDays = defaultDays;
    }
}