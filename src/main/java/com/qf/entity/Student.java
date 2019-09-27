package com.qf.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Accessors(chain=true)
@TableName("t_student")
public class Student implements Serializable {

    @TableId(type=IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private String grade;
}
