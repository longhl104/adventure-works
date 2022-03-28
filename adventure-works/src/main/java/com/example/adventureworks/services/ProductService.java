package com.example.adventureworks.services;

import com.example.adventureworks.models.Product;
import com.example.adventureworks.repositories.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseService<Product>
{
    private final ProductRepository repository;

    public ProductService(ProductRepository repository)
    {
        this.repository = repository;
    }

    @Override
    protected MongoRepository<Product, ObjectId> getRepository()
    {
        return repository;
    }
}
