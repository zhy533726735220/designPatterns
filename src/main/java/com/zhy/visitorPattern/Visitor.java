package com.zhy.visitorPattern;

/**
 * 抽象访问者（Visitor）角色：声明了一个或多个方法操作，形成所有的具体访问角色必须实现的接口
 */
public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     * @param node
     */
    void visit(NodeA node);

    /**
     * 对应于NodeB的访问操作
     * @param node
     */
    void visit(NodeB node);
}
