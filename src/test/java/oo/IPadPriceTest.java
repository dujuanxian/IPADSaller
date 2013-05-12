package oo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadPriceTest {
    @Test
    public void shouldGetCorrectPriceForBlackIPad(){
        IPad iPad = new BlackIPad();
        assertThat(iPad.getPrice(), is(3688));
    }

    @Test
    public void shouldGetCorrectPriceForWhiteIPad(){
        IPad iPad = new WhiteIPad();
        assertThat(iPad.getPrice(), is(3688 + 200));
    }
    
    @Test
    public void shouldGetCorrectPriceForRedIPad(){
        IPad iPad = new RedIPad();
        assertThat(iPad.getPrice(), is(3688 + 400));
    }

    @Test
    public void shouldGetCorrectPriceForWhite64GIPad() {
        IPad iPad = new WhiteIPad();
        IPadMemoryDecorator iPad64GMemoryDecorator = new IPadMemoryDecorator(iPad, MemorySize.G64);
        assertThat(iPad64GMemoryDecorator.getPrice(), is(3688 + 200 + 2500));
    }

    @Test
    public void shouldGetCorrectPriceForWhite16GIPad(){
        IPad iPad = new WhiteIPad();
        IPadMemoryDecorator iPadMemoryDecorator = new IPadMemoryDecorator(iPad);
        assertThat(iPadMemoryDecorator.getPrice(), is(3688 + 200 + 800));
    }
}
