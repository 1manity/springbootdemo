package com.task.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.task.domain.People;

import java.util.List;

public interface PeopleService {
    Boolean save(People p);
    Boolean update(People p);
    Boolean delete(Integer id);
    People getById(Integer id);
    List<People> getAll();
    IPage<People> getPage(Integer page,Integer capacity);
}
