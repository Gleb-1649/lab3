package object.abstract_boxes.average_boxes;

import object.abstract_boxes.abstraction.AverageBoxes;

public class Box extends AverageBoxes {
    public Box() {
        super("Average", 13.99, "wood", "tobacco", "nothing");
    }

    @Override
    public void decay() {
        System.out.println("содержимое ящика разлагается...");
    }

    public void decayQuickly() {
        System.out.println("ящик быстро разваливается!");
    }

    @Override
    public void openBox() {
        System.out.println("открывает ящик...");
    }
}
