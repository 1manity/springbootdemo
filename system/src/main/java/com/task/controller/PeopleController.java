package com.task.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.task.domain.People;
import com.task.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class PeopleController {

    @Autowired
    private IPeopleService iPeopleService;

    @GetMapping("/home")
    public String home() {
        return "cg";
    }

    @GetMapping("{id}")
    public People getById(@PathVariable Integer id) {
        return iPeopleService.getById(id);
    }
    @GetMapping
    public List<People> getAll() {
        return iPeopleService.list();
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public IPage<People> getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize) {
        return iPeopleService.getPage(currentPage,pageSize);
    }

    @PostMapping
    public Boolean save(@RequestBody People p) {
        return iPeopleService.save(p);
    }

    @PutMapping
    public Boolean update(@RequestBody People p) {
        return iPeopleService.updateById(p);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return iPeopleService.removeById(id);
    }
}
