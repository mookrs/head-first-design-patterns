package headfirst.designpatterns.strategy.ducks;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
