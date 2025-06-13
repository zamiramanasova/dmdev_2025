package levelTwo.practiceOop;

import levelTwo.genericsPackages.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T>{
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " взмахнул мячом в "+ enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
