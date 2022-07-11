package com.task.dao;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.task.domain.People;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PeopleDaoTest {

    @Autowired
    private PeopleDao pd;

    @Test
    void getByIdTest() {

        System.out.println(pd.selectById(1));
    }
    @Test
    void saveTest() {
        People p=new People();
        p.setName("text3");
        pd.insert(p);
        System.out.println("插入成功");
    }
    @Test
    void deleteTest() {
        pd.deleteById(2);
        System.out.println();
    }

    @Test
    void updateTest() {
        People p=new People();
        p.setName("text");
        p.setId(2);
        pd.insert(p);
        pd.updateById(p);
        System.out.println("更新成功");
    }
    @Test
    void getAllTest() {

        System.out.println(pd.selectList(null));
    }
    @Test
    void getPageTest() {
        IPage page=new Page(1,1);

        pd.selectPage(page, null);

        List<People> l=pd.selectList(null);
        for(People p:l) {
            System.out.println(p);
        }
    }
    @Test
    void getbyTest() {
        QueryWrapper<People> qw =new QueryWrapper<>();
        qw.like("name","text");

        List<People> l=pd.selectList(qw);
        for(People p:l) {
            System.out.println(p);
        }
    }
    @Test
    void getbyTest2() {
        String name=null;
        LambdaQueryWrapper<People> lqw =new LambdaQueryWrapper<>();
//        if(name!=null) lqw.like(People::getName,name);
        lqw.like(name!=null,People::getName,name);

        List<People> l=pd.selectList(lqw);
        for(People p:l) {
            System.out.println(p);
        }
    }
}
