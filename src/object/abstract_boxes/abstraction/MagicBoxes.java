package object.abstract_boxes.abstraction;


import object.abstraction.Boxes;

// Abstract Class MagicBoxes
public abstract class MagicBoxes extends Boxes {
    private boolean flicker;

    public MagicBoxes(String type, double weight, String material, boolean flicker) {
        super(type, weight, material);
        this.flicker = flicker;
    }

    public boolean isFlicker() {
        return flicker;
    }

    public void setFlicker(boolean flicker) {
        this.flicker = flicker;
    }

    public abstract void teleport();

    public abstract void explode();
}



