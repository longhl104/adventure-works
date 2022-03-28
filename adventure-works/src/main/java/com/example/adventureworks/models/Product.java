package com.example.adventureworks.models;

import com.example.adventureworks.models.utils.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.ZonedDateTime;

@EqualsAndHashCode(callSuper = true)
@Document("product")
@Data
public class Product extends Model
{
    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    private ObjectId productId;

    @Field("Name")
    private String productName;

    @Indexed(unique = true)
    @Field("ProductNumber")
    private String productCode;

    @Field("Color")
    private String color;

    @Field("StandardCost")
    private double cost;

    @Field("SellStartDate")
    private ZonedDateTime sellStartDate;

    @Field("SellEndDate")
    private ZonedDateTime sellEndDate;

    @DBRef(lazy = true)
    private ProductCategory productCategory;

    @Override
    protected ObjectId getModelId()
    {
        return productId;
    }
}
