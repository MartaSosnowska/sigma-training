package com.sigma.training.listservice.dto;
import java.util.List;

public class ListDTO {
    private Long id;
    private String name;
    private String descripion;
    private List<ItemDTO> items;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

    public String getDescripion() {
        return descripion;
    }

    public List<ItemDTO> getItems() {
        return items;
    }
}
