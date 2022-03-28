package com.example.adventureworks.controllers;

import com.example.adventureworks.models.Product;
import com.example.adventureworks.services.BaseService;
import com.example.adventureworks.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/product")
@AllArgsConstructor
public class ProductController extends BaseController<Product>
{
    private final ProductService service;

    @Override
    protected BaseService<Product> getService()
    {
        return service;
    }
}
