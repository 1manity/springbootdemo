package com.task.domain;
//lambok

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class People {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
