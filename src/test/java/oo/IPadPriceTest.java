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
}
