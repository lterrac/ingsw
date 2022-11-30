package ex7.designpattern.strategy;

import ex7.designpattern.strategy.Behavior;

public class Robot {

    Behavior behavior;

    public void setBehavior(Behavior behavior){
        this.behavior = behavior;
    }

    public void move(){
        // ...
        behavior.apply(this);
        // ...
    }
}
