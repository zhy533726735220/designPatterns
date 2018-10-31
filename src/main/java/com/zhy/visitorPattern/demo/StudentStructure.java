package com.zhy.visitorPattern.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentStructure {
    private List<Student> nodes = new ArrayList<>();

    /**
     * 执行方法操作
     * @param visitor
     */
    public void action(Visitor visitor) {
        for (Student node : nodes) {
            node.accept(visitor);
        }
    }

    /**
     * 添加一个新元素
     * @param student
     */
    public void add(Student student) {
        nodes.add(student);
    }
}
