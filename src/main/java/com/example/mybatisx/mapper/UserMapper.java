package com.example.mybatisx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author PC
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-07-21 20:15:22
* @Entity com.example.mybatisx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    List<User> selectAllById(@Param("id") Long id);

}




