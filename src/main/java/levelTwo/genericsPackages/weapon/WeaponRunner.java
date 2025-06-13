package levelTwo.genericsPackages.weapon;

import levelTwo.practiceOop.Archer;
import levelTwo.practiceOop.Hero;
import levelTwo.practiceOop.Warrior;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<Sword> hero) {
        Sword weapon = hero.getWeapon();
        hero.setWeapon(new Sword());
        System.out.println(hero.getWeapon().getDamage());
    }
}
