package object.abstract_boxes.magic_boxes;

import object.abstract_boxes.abstraction.MagicBoxes;

class ClashBox extends MagicBoxes {
    public ClashBox(String type, double weight, String material, boolean flicker) {
        super(type, weight, material, flicker);
    }

    @Override
    public void teleport() {
        System.out.println("The ClashBox teleports the player to a battle arena...");
    }

    @Override
    public void explode() {
        System.out.println("The ClashBox explodes with confetti!");
    }

    @Override
    public void openBox() {
        System.out.println("Opening the ClashBox to reveal legendary items...");
    }
}
