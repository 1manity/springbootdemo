package com.task.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.task.dao.PeopleDao;
import com.task.domain.People;
import com.task.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao pd;

    @Override
    public Boolean save(People p) {
        return pd.insert(p)>0;
    }

    @Override
    public Boolean update(People p) {
        return pd.update(p,null)>0;
    }

    @Override
    public Boolean delete(Integer id) {
        return pd.deleteById(id)>0;
    }

    @Override
    public People getById(Integer id) {
        return pd.selectById(id);
    }


    @Override
    public List<People> getAll() {
        return pd.selectList(null);
    }

    @Override
    public IPage<People> getPage(Integer page, Integer capacity) {
        IPage p=new Page(page,capacity);
        return pd.selectPage(p,null);
    }
}
