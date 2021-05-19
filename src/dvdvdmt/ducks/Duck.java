package dvdvdmt.ducks;

public abstract class Duck {
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;

    public Duck() {}

    public void fly() {
        flyBehaviour.fly();
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim.");
    }
}
