package object.abstract_boxes.average_boxes;

import object.abstract_boxes.abstraction.AverageBoxes;

public class Box extends AverageBoxes {
    public Box() {
        super("Average", 13.99, "wood", "tobacco", "nothing");
    }

    @Override
    public void decay() {
        System.out.println("The contents of the box are decaying...");
    }

    public void decayQuickly() {
        System.out.println("The box is decaying quickly!");
    }

    @Override
    public void openBox() {
        System.out.println("Opening the box...");
    }
}
