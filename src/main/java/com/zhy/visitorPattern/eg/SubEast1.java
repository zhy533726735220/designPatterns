package com.zhy.visitorPattern.eg;

public class SubEast1 extends East {
    @Override
    void goEast(West west) {
        west.goWest1(this);
    }

    String myName() {
        return "SubEast1";
    }
}
