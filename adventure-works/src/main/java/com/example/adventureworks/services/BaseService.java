package com.example.adventureworks.services;

import com.example.adventureworks.models.Model;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseService<T extends Model>
{
    protected abstract MongoRepository<T, ObjectId> getRepository();

    public Page<T> getAll(Pageable pageable)
    {
        return getRepository().findAll(pageable);
    }

    public Optional<T> getById(ObjectId id)
    {
        return getRepository().findById(id);
    }

    public T insert(T model)
    {
        return getRepository().insert(model);
    }
}
