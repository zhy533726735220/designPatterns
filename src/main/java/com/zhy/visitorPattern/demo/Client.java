package com.zhy.visitorPattern.demo;

public class Client {

    public static void main(String[] args) {
        StudentStructure studentStructure = new StudentStructure();
        for (int i = 0; i < 30; i++) {
            Bachelor bachelor = new Bachelor();
            bachelor.setName("zhyB" + i);
            bachelor.setUniversity("bachelor");
            studentStructure.add(bachelor);
        }

        for (int i = 0; i < 30; i++) {
            College college = new College();
            college.setName("zhyC" + i);
            college.setUniversity("college");
            studentStructure.add(college);
        }

        Visitor visitor = new ShowVisitor();
        studentStructure.action(visitor);
    }
}
