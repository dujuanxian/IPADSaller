package oo;

public class IPadMemoryDecorator extends IPadDecorator{

    public IPadMemoryDecorator(IPad iPad) {
        super(iPad);
    }

    public int getPrice() {
        return iPad.getPrice() + 800;
    }
}
