package place.abstract_place.arena;

import place.abstract_place.abstraction.Arena;
import place.enumeration.WorldTypeEnum;

public class ClashArena extends Arena {
    public ClashArena(String placeName, WorldTypeEnum world, String legendaryLevel, boolean bloody, String type) {
        super(placeName, world, legendaryLevel, bloody, type);
    }

    @Override
    public void startBattle() {
        System.out.println("Battle starts in " + getPlaceName());
    }

    @Override
    public void exist() {
        System.out.println(getPlaceName() + " exists in " + getWorld());
    }

    @Override
    public void visit() {
        System.out.println("Visiting the Clash Arena...");
    }
}
