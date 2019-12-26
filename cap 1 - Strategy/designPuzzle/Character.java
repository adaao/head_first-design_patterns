public abstract class Character{
    WeaponBehavior weaponBehavior;

    public Character(){
        weaponBehavior = new NoWeapon();
    }

    public void setWeapon(WeaponBehavior wb){
        this.weaponBehavior = wb;
    }

    public void fight(){
        display();
        weaponBehavior.useWeapon();
    }

    public abstract void display();

}