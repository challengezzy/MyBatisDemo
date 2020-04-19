package com.zzy.mybatis.service;

import com.zzy.mybatis.bean.Person;

import java.util.List;

/**
 * 服务层，业务逻辑处理
 * Created by zzy on 2020/4/19.
 */
public interface PersonService {

    /**
     * 查询所有用户
     * @return
     */
    List<Person> selectAllPerson();
}
