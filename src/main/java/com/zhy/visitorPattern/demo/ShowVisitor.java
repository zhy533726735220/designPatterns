package com.zhy.visitorPattern.demo;

public class ShowVisitor implements Visitor {
    @Override
    public void visit(Bachelor bachelor) {
        System.out.println("hahaha" + bachelor.getName());
    }

    @Override
    public void visit(College college) {
        System.out.println("wuwuwu" + college.getName());
    }
}
