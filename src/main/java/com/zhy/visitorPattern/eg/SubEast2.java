package com.zhy.visitorPattern.eg;

public class SubEast2 extends East {
    @Override
    void goEast(West west) {
        west.goWest2(this);
    }

    String myName() {
        return "SubEast2";
    }
}
