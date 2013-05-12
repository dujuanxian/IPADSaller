package oo;

import oo.accessory.Lettering;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadLetteringDecoratorPriceTest {
    @Test
    public void shouldGetCorrectPriceForBlackGoldLetteringIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadGoldLetteringDecorator = new IPadDecorator(iPad, Lettering.GOLD);
        assertThat(iPadGoldLetteringDecorator.getPrice(), is(3688 + 400));
    }

    @Test
    public void shouldGetCorrectPriceForBlackSilverLetteringIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadSilverLetteringDecorator = new IPadDecorator(iPad, Lettering.SILVER);
        assertThat(iPadSilverLetteringDecorator.getPrice(), is(3688 + 200));
    }

    @Test
    public void shouldGetCorrectPriceForBlackNormalLetteringIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadNormalLetteringDecorator = new IPadDecorator(iPad, Lettering.NORMAL);
        assertThat(iPadNormalLetteringDecorator.getPrice(), is(3688 + 100));
    }
}
