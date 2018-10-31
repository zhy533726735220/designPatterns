package com.zhy.visitorPattern.demo;

/**
 * 接口定义了两种Element的访问
 */
public interface Visitor {
    public void visit(Bachelor bachelor);
    public void visit(College college);
}
