package com.ecommerce.data.service;

import com.ecommerce.data.model.Category;
import com.ecommerce.data.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public void createCategory(Category category){
        categoryRepo.save(category);
    }
}
