package edu.fsu.cs.cen5035;

public class Arrow extends BasicWeapon implements Weapon{
	public Arrow() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
    	armor -= 5;
    	if (armor < 0)
    		armor = 0;
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }


}
