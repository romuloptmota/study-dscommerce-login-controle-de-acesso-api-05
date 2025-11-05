package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;

public class CategoryDto {

    // ATRIBUTOS
    private Long id;
    private String name;

    // CONSTRUTORES
    public CategoryDto() {
    }

    public CategoryDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDto(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    //GETTER
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
