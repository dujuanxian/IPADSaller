package oo;

public class IPadLetteringDecorator extends IPadDecorator {
    private final Lettering lettering;

    public IPadLetteringDecorator(IPad iPad, Lettering lettering) {
        super(iPad);
        this.lettering = lettering;
    }

    @Override
    int getPrice() {
        return iPad.getPrice() + lettering.getPrice();
    }
}
