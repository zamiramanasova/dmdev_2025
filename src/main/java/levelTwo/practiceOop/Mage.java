package levelTwo.practiceOop;

import levelTwo.genericsPackages.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{
    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
