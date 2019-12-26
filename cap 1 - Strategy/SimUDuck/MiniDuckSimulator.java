public class MiniDuckSimulator{
   public static void main(String[] args){
      Duck mallard = new MallardDuck();
      mallard.display();
      mallard.performQuack();
      mallard.performFly();
      System.out.println();

      Duck decoy = new Decoy();
      decoy.display();
      decoy.performFly();
      decoy.performQuack();
      System.out.println();

      Duck model = new ModelDuck();
      model.display();
      model.performFly();
      model.performQuack();
      model.setFlyBehavior(new FlyRocketPowered());
      model.performFly();
      System.out.println();
   }
}

