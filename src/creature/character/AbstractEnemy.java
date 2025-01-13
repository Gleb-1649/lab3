package creature.character;

import creature.Creature;

public abstract class AbstractEnemy implements Creature {
    private String name;
    private int strength;
    private boolean hostile;

    public AbstractEnemy(String name, int strength, boolean hostile) {
        this.name = name;
        this.strength = strength;
        this.hostile = hostile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    @Override
    public abstract void fight();

    @Override
    public abstract void kill();

    @Override
    public abstract void die();

    @Override
    public abstract void eat();

    @Override
    public abstract void drink();

    public abstract void attack();
}