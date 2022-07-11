package com.task.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.task.dao.PeopleDao;
import com.task.domain.People;
import com.task.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl2 extends ServiceImpl<PeopleDao, People> implements IPeopleService {

    @Autowired
    private PeopleDao pd;
    @Override
    public IPage<People> getPage(int currentPage,int pageSize) {
        IPage ip=new Page(currentPage,pageSize);
        pd.selectPage(ip,null);
        return ip;
    }
}
