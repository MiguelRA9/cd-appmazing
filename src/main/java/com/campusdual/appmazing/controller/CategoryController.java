package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.ICategoryService;
import com.campusdual.appmazing.model.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String testController(){return "Categories controller works!";}

    @PostMapping
    public String testController(@RequestBody String name){return "Categories controller works, "+ name +"!";}

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){return "Categories controller method works!";}

    @PostMapping(value = "/get")
    public CategoryDto queryCategory(@RequestBody CategoryDto categoryDto){return this.categoryService.queryCategory(categoryDto);}

    @GetMapping(value = "/getAll")
    public List<CategoryDto> queryAllCategories(){return this.categoryService.queryAllCategories();}

    @PostMapping(value = "/add")
    public int insertCategory(@RequestBody CategoryDto categoryDto){return this.categoryService.insertCategory(categoryDto);}

    @PutMapping(value = "/update")
    public int updateCategory(@RequestBody CategoryDto categoryDto){return this.categoryService.updateCategory(categoryDto);}

    @DeleteMapping(value = "/delete")
    public int deleteCategory(@RequestBody CategoryDto categoryDto){return this.categoryService.deleteCategory(categoryDto);}
}
