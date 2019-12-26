public class Hunter{
    Call call;

    public Hunter(){
        call = new Call();
    }

    public void playCall(){
        call.performQuack();
    }
}
