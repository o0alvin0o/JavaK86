package act6_1;

import java.util.Random;

public class Smartphone {
    // data field
    private String brand;
    private boolean hasBluetooth;
    private boolean has5G;
    private boolean hasWifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold = new Random().nextInt(1,500);
    private int stock = new Random().nextInt(0,50);

    // contrustor
    public Smartphone() {

    }

    public Smartphone(String brand, boolean hasBluetooth, boolean has5G, boolean hasWifi, String os, float memory, String color, long price) {
        this.brand = brand;
        this.hasBluetooth = hasBluetooth;
        this.has5G = has5G;
        this.hasWifi = hasWifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return brand + "\n"
                + "Bluetooth: " + hasBluetooth + ". 5G: " + has5G + ". Wifi: " + hasWifi + "\n"
                + "Operating system: " + os + ". Memory: " + memory + ". Color: " + color + "\n"
                + "Price: " + price + "$. " + " Sold: " + totalSold + "\n"
                + "-------------\n";
    }
}
