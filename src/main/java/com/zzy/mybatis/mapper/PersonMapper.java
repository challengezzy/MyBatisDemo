package com.zzy.mybatis.mapper;

import com.zzy.mybatis.bean.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 数据库操作层
 * Created by zzy on 2020/4/19.
 */
@Mapper
public interface PersonMapper {

    @Delete("delete from person where id = #{id}")
    Person deleteByPrimaryKey(Long id);

    @Select("select id,name,age from person where id = #{id}")
    Person selectByPrimaryKey(Long id);

    @Select("select id,name,age from person ")
    List<Person> selectAllPerson();

    @Insert("insert into person(id,name,age) values(#{id},#{name},#{age})")
    int insert();

}
