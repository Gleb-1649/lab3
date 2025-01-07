package creature.abstract_hero;

import creature.abstraction.AbstractHero;

public class Hero extends AbstractHero {
    private String power;

    public Hero(String name, boolean alive, String power) {
        super(name, alive);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void defend() {
        System.out.println(getName() + " is defending...");
    }

    @Override
    public void fight() {
        System.out.println(getName() + " is fighting...");
    }

    @Override
    public void kill() {
        System.out.println(getName() + " is killing...");
    }

    @Override
    public void die() {
        System.out.println(getName() + " has died.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating...");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking...");
    }
}
