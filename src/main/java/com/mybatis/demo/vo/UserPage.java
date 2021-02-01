package com.mybatis.demo.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.demo.pojo.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class UserPage extends Page<User> {
    private static final long serialVersionUID = 7246194974980132237L;

    private Integer selectInt;
    private String selectStr;

    public UserPage(long current, long size) {
        super(current, size);
    }
}