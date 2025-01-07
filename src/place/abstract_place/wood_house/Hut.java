package place.abstract_place.wood_house;

import place.abstract_place.abstraction.WoodHouse;
import place.enumeration.WorldTypeEnum;

public class Hut extends WoodHouse {
    public Hut(String placeName, WorldTypeEnum world, String legendaryLevel, boolean burn) {
        super(placeName, world, legendaryLevel, burn);
    }

    public void laudCreak() {
        System.out.println("The hut creaks loudly...");
    }

    @Override
    public void creak() {
        System.out.println("The hut is creaking...");
    }

    @Override
    public void fire() {
        System.out.println("The hut is on fire!");
    }

    @Override
    public void exist() {
        System.out.println(getPlaceName() + " exists in " + getWorld());
    }

    @Override
    public void visit() {
        System.out.println("Visiting the hut...");
    }
}