package com.task.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.task.domain.People;
import com.task.service.impl.PeopleServiceImpl;
import com.task.service.impl.PeopleServiceImpl2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PeopleServiceImplTest2 {
    @Autowired
    private PeopleServiceImpl2 psl;

    @Test
    void getByIdTest() {

        System.out.println(psl.getById(1));
    }
    @Test
    void saveTest() {
        People p=new People();
        p.setName("text3");

        System.out.println("插入操作："+psl.save(p));
    }
    @Test
    void deleteTest() {

        System.out.println("删除操作："+psl.removeById(2));
    }

    @Test
    void updateTest() {
        People p=new People();
        p.setName("text");
        p.setId(2);

        System.out.println("更新操作："+psl.updateById(p));
    }
    @Test
    void getAllTest() {

        System.out.println(psl.list());
    }
    @Test
    void getPageTest() {
        IPage<People> ipage =new Page<>(2,2);
        psl.page(ipage);
        System.out.println(ipage.getRecords());
    }
//    @Test
//    void getbyTest() {
//        QueryWrapper<People> qw =new QueryWrapper<>();
//        qw.like("name","text");
//
//        List<People> l=pd.selectList(qw);
//        for(People p:l) {
//            System.out.println(p);
//        }
//    }
//    @Test
//    void getbyTest2() {
//        String name=null;
//        LambdaQueryWrapper<People> lqw =new LambdaQueryWrapper<>();
////        if(name!=null) lqw.like(People::getName,name);
//        lqw.like(name!=null,People::getName,name);
//
//        List<People> l=pd.selectList(lqw);
//        for(People p:l) {
//            System.out.println(p);
//        }
//    }
}
