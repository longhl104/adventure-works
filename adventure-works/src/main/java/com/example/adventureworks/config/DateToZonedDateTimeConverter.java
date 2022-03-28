package com.example.adventureworks.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Component
public class DateToZonedDateTimeConverter implements Converter<Date, ZonedDateTime>
{

    @Override
    public ZonedDateTime convert(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault());
    }
}