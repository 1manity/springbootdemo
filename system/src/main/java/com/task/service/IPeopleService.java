package com.task.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.task.domain.People;

import java.util.List;

public interface IPeopleService extends IService<People> {
    public IPage<People> getPage(int currentPage, int pageSize);
}
