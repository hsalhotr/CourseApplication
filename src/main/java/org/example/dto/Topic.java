package org.example.dto;


import javax.persistence.Entity;
import javax.persistence.Id;

// Model
@Entity
public class Topic {

    @Id
    private String name;
    private String description;

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Topic() {

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
}
