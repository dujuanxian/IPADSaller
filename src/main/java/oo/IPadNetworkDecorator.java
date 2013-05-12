package oo;

public class IPadNetworkDecorator extends IPadDecorator {
    private final Network network;

    public IPadNetworkDecorator(IPad iPad, Network network) {
        super(iPad);
        this.network = network;
    }

    @Override
    int getPrice() {
        return iPad.getPrice() + network.getPrice();
    }
}
