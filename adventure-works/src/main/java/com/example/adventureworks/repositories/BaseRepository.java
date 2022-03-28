package com.example.adventureworks.repositories;

import com.example.adventureworks.models.Model;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BaseRepository<T extends Model> extends MongoRepository<T, ObjectId>
{
}
