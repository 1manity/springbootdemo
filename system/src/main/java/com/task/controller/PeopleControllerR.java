package com.task.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.task.controller.utils.R;
import com.task.domain.People;
import com.task.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/R")
public class PeopleControllerR {

    @Autowired
    private IPeopleService iPeopleService;

    @GetMapping("/home")
    public String home() {
        return "cg";
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true,iPeopleService.getById(id));
    }

    @GetMapping
    public R getAll() {
        return new R(true,iPeopleService.list());
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize) {
        return new R(true,iPeopleService.getPage(currentPage,pageSize));
    }

    @PostMapping
    public R save(@RequestBody People p) {
        return new R(iPeopleService.save(p),null);
    }

    @PutMapping
    public R update(@RequestBody People p) {
        return new R(iPeopleService.updateById(p),null);
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(iPeopleService.removeById(id),null);
    }
}
