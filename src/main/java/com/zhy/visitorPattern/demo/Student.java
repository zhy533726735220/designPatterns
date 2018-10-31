package com.zhy.visitorPattern.demo;

/**
 * 投简历的例子，都是写本科生、专科生、硕士生
 */
public abstract class Student {
    // 提供对于数据域基本操作函数
    private String name;
    private String university;

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
