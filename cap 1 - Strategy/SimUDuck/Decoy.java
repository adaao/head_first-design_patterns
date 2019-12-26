public class Decoy extends Duck{

    public Decoy(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("I'm just a decoy!");
    }

}