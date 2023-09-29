package com.campusdual.appmazing.model.dto.dtomapper;

import com.campusdual.appmazing.model.Category;
import com.campusdual.appmazing.model.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toDTO(Category category);

    List<CategoryDto> toDTOList(List<Category> categories);

    Category toEntity(CategoryDto categoryDto);
}
