package oo;

public class IPadNetworkDecorator extends IPadDecorator {
    private final Network network;

    public IPadNetworkDecorator(IPad iPad, Network network) {
        super(iPad);
        this.network = network;
    }

    @Override
    int getPrice() {
        int accessoryPrice = 0;
        try {
            switch (network) {
                case WIFI:
                    accessoryPrice = 800;
                    break;
                case G3:
                    accessoryPrice  = 1600;
                    break;
                case WIFI_G3:
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
