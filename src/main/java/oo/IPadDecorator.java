package oo;

import oo.accessory.Accessory;

public class IPadDecorator extends IPad{
    Accessory accessory;
    IPad iPad;

    public IPadDecorator(IPad iPad, Accessory accessory) {
        this.iPad = iPad;
        this.accessory = accessory;
    }

    @Override
    int getPrice() {
        return iPad.getPrice() + accessory.getPrice();
    }
}
