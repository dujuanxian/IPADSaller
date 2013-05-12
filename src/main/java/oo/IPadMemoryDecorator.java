package oo;

public class IPadMemoryDecorator extends IPadDecorator{

    private final MemorySize memorySize;

    public IPadMemoryDecorator(IPad iPad, MemorySize memorySize) {
        super(iPad);
        this.memorySize = memorySize;
    }

    public int getPrice() {
        int accessoryPrice = 0;
        try {
            switch (memorySize) {
                case G16:
                    accessoryPrice = 800;
                    break;
                case G32:
                    accessoryPrice = 1600;
                    break;
                case G64:
                    accessoryPrice = 2500;
                    break;
                case G128:
                    accessoryPrice = 3200;
                    break;
                default:
                    throw new NoSuchFieldException();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return iPad.getPrice() + accessoryPrice;
    }
}
