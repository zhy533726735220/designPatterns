package com.zhy.visitorPattern;

public abstract class Node {
    /**
     * 接收操作
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
