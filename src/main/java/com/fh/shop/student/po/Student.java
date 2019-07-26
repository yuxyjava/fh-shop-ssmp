package com.fh.shop.student.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private String stuName;

    private int age;
}
