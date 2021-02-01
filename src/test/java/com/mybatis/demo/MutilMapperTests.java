package com.mybatis.demo;

import com.mybatis.demo.mapper.MultiAccountMapper;
import com.mybatis.demo.mapper.MultiStudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MutilMapperTests {

    @Autowired
    private MultiAccountMapper accountMapper;

    @Autowired
    private MultiStudentMapper studentMapper;

    @Test
    public void testAccount() {
        accountMapper.selectById(15L);

        studentMapper.selectById(2L);
    }
}
