package chapter6;

public class Bottle {

    private int maxVolumeInMililiters;
    private int currentVolumeInMililiters;
    private String name;
    private String color;

    public Bottle(String name, String color, int maxVolumeInMililiters) {
        this.name = name;
        this.color = color;
        this.maxVolumeInMililiters = maxVolumeInMililiters;
        currentVolumeInMililiters = 0;
    }

    public void fill(int mililitersToAdd) {
        currentVolumeInMililiters += mililitersToAdd;
        if (currentVolumeInMililiters > maxVolumeInMililiters) {
            currentVolumeInMililiters = maxVolumeInMililiters;
        }
    }

    public void drink(int mililitersToDrink) {
        currentVolumeInMililiters -= mililitersToDrink;
        if (currentVolumeInMililiters < 0) {
            currentVolumeInMililiters = 0;
        }
    }

    public int getMaxVolumeInMililiters() {
        return maxVolumeInMililiters;
    }

    public int getCurrentVolumeInMililiters() {
        return currentVolumeInMililiters;
    }

    public String getName() {
        return name;
    }

    public String color() {
        return color;
    }
}
