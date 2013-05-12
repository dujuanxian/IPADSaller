package oo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadLetteringDecoratorPriceTest {
    @Test
    public void shouldGetCorrectPriceForBlackGoldLetteringIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadGoldLetteringDecorator = new IPadLetteringDecorator(iPad, Lettering.GOLD);
        assertThat(iPadGoldLetteringDecorator.getPrice(), is(3688 + 400));
    }

    @Test
    public void shouldGetCorrectPriceForBlackSilverLetteringIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadSilverLetteringDecorator = new IPadLetteringDecorator(iPad, Lettering.SILVER);
        assertThat(iPadSilverLetteringDecorator.getPrice(), is(3688 + 200));
    }

    @Test
    public void shouldGetCorrectPriceForBlackNormalLetteringIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadNormalLetteringDecorator = new IPadLetteringDecorator(iPad, Lettering.NORMAL);
        assertThat(iPadNormalLetteringDecorator.getPrice(), is(3688 + 100));
    }
}
