package creature.abstract_enemy;

import creature.abstraction.AbstractEnemy;

public class Enemy extends AbstractEnemy {
    public Enemy(String name, int strength, boolean hostile) {
        super(name, strength, hostile);
    }

    @Override
    public void fight() {
        System.out.println(getName() + " is fighting with strength " + getStrength());
    }

    @Override
    public void kill() {
        System.out.println(getName() + " kills its target.");
    }

    @Override
    public void die() {
        System.out.println(getName() + " has been defeated.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating to restore energy.");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking to stay hydrated.");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " launches an attack!");
    }
}
