package com.zhy.visitorPattern;

public class NodeA extends Node {

    /**
     * 接收操作
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeA特有的方法
     * @return
     */
    public String operationA() {
        return "NodeA";
    }
}
