package com.zhy.visitorPattern.demo;

public class College extends Student {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
