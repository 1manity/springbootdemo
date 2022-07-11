package com.task;

import com.task.dao.PeopleDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SystemApplicationTests {

    @Autowired
    private PeopleDao pd;
    @Test
    void contextLoads() {
        System.out.println(pd.selectById(1));
    }

}
