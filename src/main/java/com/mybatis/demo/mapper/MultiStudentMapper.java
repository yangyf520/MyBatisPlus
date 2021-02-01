package com.mybatis.demo.mapper;

//import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.demo.pojo.MultiAccount;
import com.mybatis.demo.pojo.MultiStudent;
import org.springframework.stereotype.Repository;

//@DS("slave")
//@Repository
public interface MultiStudentMapper extends BaseMapper<MultiStudent> {
}
