public class SimFight{
    public static void main(String[] args) {
        Character knight = new Knight();
        Character troll = new Troll();

        knight.fight();
        troll.fight();

        knight.setWeapon(new SwordBehavior());
        troll.setWeapon(new AxeBehavior());

        knight.fight();
        troll.fight();
    }
}