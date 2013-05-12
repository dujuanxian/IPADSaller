package oo;

public enum Lettering {
    NORMAL(100), SILVER(200), GOLD(400);

    private final int price;

    Lettering(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
