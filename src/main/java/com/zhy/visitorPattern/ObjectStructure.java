package com.zhy.visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象角色类，这个结构对象角色持有一个聚集，并向外界提供一个add()方法作为聚集的管理操作。通过调用这个方法，可以动态的添加一个新的节点
 */
public class ObjectStructure {
    private List<Node> nodes = new ArrayList<>();

    /**
     * 执行方法操作
     * @param visitor
     */
    public void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }
    }

    /**
     * 添加一个新元素
     * @param node
     */
    public void add(Node node) {
        nodes.add(node);
    }
}
