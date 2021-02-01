package com.mybatis.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "t_user")
public class MultiAccount {

    @TableId(type = IdType.AUTO)
    public Long id;

    private String name;

    private Integer age;
}
