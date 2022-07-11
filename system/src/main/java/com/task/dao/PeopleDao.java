package com.task.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.task.domain.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PeopleDao  extends BaseMapper<People> {

//    @Select("select * from people where id =#{id}")
//    People getById(Integer id);
}
