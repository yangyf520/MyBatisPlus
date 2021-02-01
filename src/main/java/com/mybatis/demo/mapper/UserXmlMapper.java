package com.mybatis.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.mybatis.demo.config.MyBaseMapper;
import com.mybatis.demo.pojo.User;
import com.mybatis.demo.vo.UserPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserXmlMapper extends MyBaseMapper<User> {

    /**
     * 自定义分页查询
     *
     * @param userPage 单独 user 模块使用的分页
     * @return 分页数据
     */
    UserPage selectUserPage(UserPage userPage);

    List<User> findList(@Param("user") User user);

    List<User> customerSqlSegment(@Param("ew") Wrapper ew);

}