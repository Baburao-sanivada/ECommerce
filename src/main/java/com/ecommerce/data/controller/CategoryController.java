package com.ecommerce.data.controller;

import com.ecommerce.data.model.Category;
import com.ecommerce.data.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public String addCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Success";
    }
}
