package com.zzy.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.zzy.mybatis.bean.Person;
import com.zzy.mybatis.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller层，提供给前端的服务
 * Created by zzy on 2020/4/19.
 */

@Slf4j
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/queryAll")
    public String queryAllPersons(){
        log.info("查询所有用户信息begin");
        List<Person> persons = personService.selectAllPerson();

        log.info("查询所有用户信息end,信息为{}", JSONObject.toJSONString(persons));

        return JSONObject.toJSONString(persons);
    }
}
