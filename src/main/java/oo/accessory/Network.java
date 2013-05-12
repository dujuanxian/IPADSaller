package oo.accessory;

public enum Network implements Accessory{
    WIFI(800), G3(1600), WIFI_G3(3200);

    private final int price;

    Network(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
