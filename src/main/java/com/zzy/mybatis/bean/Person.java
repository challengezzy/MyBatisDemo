package com.zzy.mybatis.bean;

import lombok.Data;

/**
 * 数据库对象，映射到数据库表
 * Created by zzy on 2020/4/19.
 */
@Data
public class Person {

    private long id;
    private String name;
    private int age;
}
