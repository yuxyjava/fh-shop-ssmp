package com.fh.shop.student.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private String stuName;
    private String passWord;
    private String a;
    private int age;
}
