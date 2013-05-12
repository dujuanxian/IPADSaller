package oo;

import oo.accessory.MemorySize;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadMemoryDecoratorPriceTest {
    @Test
    public void shouldGetCorrectPriceForBlack16GIPad() {
        IPad iPad = new BlackIPad();
        IPadDecorator iPad16GMemoryDecorator = new IPadDecorator(iPad, MemorySize.G16);
        assertThat(iPad16GMemoryDecorator.getPrice(), is(3688 + 800));
    }

    @Test
    public void shouldGetCorrectPriceForBlack32GIPad() {
        IPad iPad = new BlackIPad();
        IPadDecorator iPadMemoryDecorator = new IPadDecorator(iPad, MemorySize.G32);
        assertThat(iPadMemoryDecorator.getPrice(), is(3688 + 1600));
    }

    @Test
    public void shouldGetCorrectPriceForWhite16GIPad() {
        IPad iPad = new WhiteIPad();
        IPadDecorator iPad64GMemoryDecorator = new IPadDecorator(iPad, MemorySize.G16);
        assertThat(iPad64GMemoryDecorator.getPrice(), is(3688 + 200 + 800));
    }
}
