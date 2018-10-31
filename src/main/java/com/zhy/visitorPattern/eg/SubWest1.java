package com.zhy.visitorPattern.eg;

public class SubWest1 extends West {

    void goWest1(East east) {
        System.out.println("SubWest1" + east.myName());
    }

    void goWest2(East east) {
        System.out.println("SubWest1" + east.myName());
    }
}
