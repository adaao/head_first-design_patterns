public class Call{
    QuackBehavior quackBehavior;
    
    public Call(){
        quackBehavior = new Quack();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
