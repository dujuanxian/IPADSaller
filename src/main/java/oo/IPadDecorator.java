package oo;

public abstract class IPadDecorator extends IPad{
    IPad iPad;

    public IPadDecorator(IPad iPad) {
        this.iPad = iPad;
    }
}
