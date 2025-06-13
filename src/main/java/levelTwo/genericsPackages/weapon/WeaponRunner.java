package levelTwo.genericsPackages.weapon;

import levelTwo.practiceOop.Archer;
import levelTwo.practiceOop.Warrior;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());
    }
}
