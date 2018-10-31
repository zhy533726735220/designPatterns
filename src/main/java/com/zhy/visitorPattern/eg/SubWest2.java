package com.zhy.visitorPattern.eg;

public class SubWest2 extends West {

    void goWest1(East east) {
        System.out.println("SubWest2" + east.myName());
    }

    void goWest2(East east) {
        System.out.println("SubWest2" + east.myName());
    }
}
