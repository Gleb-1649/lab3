package place.abstraction;
import place.Place;
import place.enumeration.WorldTypeEnum;

public abstract class AbstractPlace implements Place {
    private String placeName;
    private WorldTypeEnum world;
    private String legendaryLevel;

    public AbstractPlace(String placeName, WorldTypeEnum world, String legendaryLevel) {
        this.placeName = placeName;
        this.world = world;
        this.legendaryLevel = legendaryLevel;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public WorldTypeEnum getWorld() {
        return world;
    }

    public void setWorld(WorldTypeEnum world) {
        this.world = world;
    }

    public String getLegendaryLevel() {
        return legendaryLevel;
    }

    public void setLegendaryLevel(String legendaryLevel) {
        this.legendaryLevel = legendaryLevel;
    }
}
