package place.abstract_place.palace;

import place.abstract_place.abstraction.Palace;
import place.enumeration.WorldTypeEnum;

public class ImperiumHominis extends Palace {
    public ImperiumHominis(String placeName, WorldTypeEnum world, String legendaryLevel, boolean open) {
        super(placeName, world, legendaryLevel, open);
    }

    public void wellSecure() {
        System.out.println(getPlaceName() + " is well-secured.");
    }

    @Override
    public void secure() {
        System.out.println(getPlaceName() + " is being secured...");
    }

    @Override
    public void exist() {
        System.out.println(getPlaceName() + " exists in " + getWorld());
    }

    @Override
    public void visit() {
        System.out.println("Visiting " + getPlaceName());
    }
}
