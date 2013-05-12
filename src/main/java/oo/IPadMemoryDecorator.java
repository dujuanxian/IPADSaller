package oo;

public class IPadMemoryDecorator extends IPadDecorator{
    private final MemorySize memorySize;

    public IPadMemoryDecorator(IPad iPad, MemorySize memorySize) {
        super(iPad);
        this.memorySize = memorySize;
    }

    public int getPrice() {
        return iPad.getPrice() + memorySize.getPrice();
    }
}
