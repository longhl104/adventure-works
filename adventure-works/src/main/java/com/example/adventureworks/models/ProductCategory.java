package com.example.adventureworks.models;

import com.example.adventureworks.models.utils.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@EqualsAndHashCode(callSuper = true)
@Document("productCategory")
@Data
public class ProductCategory extends Model
{
    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId productCategoryId;

    private String productCategoryName;

    @Override
    protected ObjectId getModelId()
    {
        return productCategoryId;
    }
}
