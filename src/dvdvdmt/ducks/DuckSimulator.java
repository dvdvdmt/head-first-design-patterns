package dvdvdmt.ducks;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.swim();
        mallard.fly();
        mallard.quack();

        Duck model = new ModelDuck();
        model.fly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.fly();
    }
}
