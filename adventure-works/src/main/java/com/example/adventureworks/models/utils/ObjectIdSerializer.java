package com.example.adventureworks.models.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bson.types.ObjectId;

import java.io.IOException;
import java.util.Base64;

public class ObjectIdSerializer extends JsonSerializer<ObjectId>
{
    @Override
    public void serialize(ObjectId value, JsonGenerator jsonGen, SerializerProvider provider) throws IOException
    {
        jsonGen.writeString(new String(Base64.getEncoder().encode(value.toByteArray())));
    }
}