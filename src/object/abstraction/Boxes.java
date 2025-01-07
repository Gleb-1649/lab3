package object.abstraction;
import object.Object;

public abstract class Boxes implements Object {
    private String type;
    private double weight;
    private String material;

    public Boxes(String type, double weight, String material) {
        this.type = type;
        this.weight = weight;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract void openBox();

    @Override
    public void lie() {
        System.out.println("The box is lying on the ground.");
    }

    @Override
    public void take() {
        System.out.println("The box is taken.");
    }

    @Override
    public void overlook() {
        System.out.println("Looking over the box.");
    }
}
