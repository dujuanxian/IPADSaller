package oo;

public enum MemorySize{
    G16(800), G32(1600), G64(2500), G128(3200);

    private final int price;

    MemorySize(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
