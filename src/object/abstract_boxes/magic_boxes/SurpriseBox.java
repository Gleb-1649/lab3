package object.abstract_boxes.magic_boxes;

import object.abstract_boxes.abstraction.MagicBoxes;

// Concrete Class SurpriseBox
class SurpriseBox extends MagicBoxes {
    private String specialReward;

    public SurpriseBox(String type, double weight, String material, boolean flicker, String specialReward) {
        super(type, weight, material, flicker);
        this.specialReward = specialReward;
    }

    public String getSpecialReward() {
        return specialReward;
    }

    public void setSpecialReward(String specialReward) {
        this.specialReward = specialReward;
    }

    @Override
    public void teleport() {
        System.out.println("The SurpriseBox teleports you to an unknown location...");
    }

    @Override
    public void explode() {
        System.out.println("The SurpriseBox explodes, revealing a surprise reward: " + specialReward);
    }

    @Override
    public void openBox() {
        System.out.println("Opening the SurpriseBox... What could it be?");
    }
}