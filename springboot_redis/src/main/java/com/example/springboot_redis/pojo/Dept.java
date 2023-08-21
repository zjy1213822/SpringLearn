package com.example.springboot_redis.pojo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Schema(title = "部门")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    Integer deptId;
    String deptName;
}
