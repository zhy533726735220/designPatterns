package com.zhy.visitorPattern;

public class VisitorA implements Visitor{

    /**
     * 对应于NodeA的访问操作
     * @param node
     */
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }

    /**
     * 对应于NodeB的访问操作
     * @param node
     */
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
