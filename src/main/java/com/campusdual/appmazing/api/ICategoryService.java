package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {
    //CRUD Operations
    CategoryDto queryCategory(CategoryDto categoryDto);

    List<CategoryDto> queryAllCategories();

    int insertCategory(CategoryDto categoryDto);

    int updateCategory(CategoryDto categoryDto);

    int deleteCategory(CategoryDto categoryDto);
}
