package object.abstract_boxes.magic_boxes;

import object.abstract_boxes.abstraction.MagicBoxes;

class WarhummerBox extends MagicBoxes {
    public WarhummerBox(String type, double weight, String material, boolean flicker) {
        super(type, weight, material, flicker);
    }

    @Override
    public void teleport() {
        System.out.println("The WarhummerBox teleports you to a war zone...");
    }

    @Override
    public void explode() {
        System.out.println("The WarhummerBox explodes with a loud bang!");
    }

    @Override
    public void openBox() {
        System.out.println("Opening the WarhummerBox to reveal ancient weapons...");
    }
}