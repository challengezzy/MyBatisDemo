package com.zzy.mybatis.service;

import com.alibaba.fastjson.JSONObject;
import com.zzy.mybatis.bean.Person;
import com.zzy.mybatis.mapper.PersonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zzy on 2020/4/19.
 */
@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Override
    public List<Person> selectAllPerson() {
        log.info("查询所有用户信息bein");

        List<Person> persons = personMapper.selectAllPerson();

        log.info("查询所有用户信息end,用户信息为{}", JSONObject.toJSONString(persons));

        return persons;
    }
}
