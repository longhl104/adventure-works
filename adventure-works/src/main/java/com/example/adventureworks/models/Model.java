package com.example.adventureworks.models;

import org.bson.types.ObjectId;

public abstract class Model
{
    protected abstract ObjectId getModelId();
}
