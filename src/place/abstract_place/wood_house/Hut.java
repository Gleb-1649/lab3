package place.abstract_place.wood_house;

import place.abstract_place.abstraction.WoodHouse;
import place.enumeration.WorldTypeEnum;

public class Hut extends WoodHouse {
    public Hut(String placeName, WorldTypeEnum world, String legendaryLevel, boolean burn) {
        super(placeName, world, legendaryLevel, burn);
    }

    public void laudCreak() {
        System.out.println("The hut громко скрипит...");
    }

    @Override
    public void creak() {
        System.out.println("The hut скрипит...");
    }

    @Override
    public void fire() {
        System.out.println("The hut вохвачена огнем!");
    }

    @Override
    public void exist() {
        System.out.println(getPlaceName() + " существует в" + getWorld());
    }

    @Override
    public void visit() {
        System.out.println("Визит the hut...");
    }
}