package oo;

public class IPadLetteringDecorator extends IPadDecorator {
    private final Lettering lettering;

    public IPadLetteringDecorator(IPad iPad, Lettering lettering) {
        super(iPad);
        this.lettering = lettering;
    }

    @Override
    int getPrice() {
        int accessoryPrice = 0;
        try {
            switch (lettering) {
                case GOLD:
                    accessoryPrice = 400;
                    break;
                case SILVER:
                    accessoryPrice = 200;
                    break;
                case NORMAL:
                    accessoryPrice = 100;
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
