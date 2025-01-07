package creature.abstraction;

import creature.Creature;

public abstract class AbstractHero implements Creature {
    private String name;
    private boolean alive;

    public AbstractHero(String name, boolean alive) {
        this.name = name;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract void defend();
}