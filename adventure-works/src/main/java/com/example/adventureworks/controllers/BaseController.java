package com.example.adventureworks.controllers;

import com.example.adventureworks.models.Model;
import com.example.adventureworks.services.BaseService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public abstract class BaseController<T extends Model>
{
    protected abstract BaseService<T> getService();

    @GetMapping(path = "get-all")
    public Page<T> getAll(Pageable pageable)
    {
        return getService().getAll(pageable);
    }
}
