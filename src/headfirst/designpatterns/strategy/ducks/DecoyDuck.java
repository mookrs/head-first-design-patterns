package headfirst.designpatterns.strategy.ducks;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
