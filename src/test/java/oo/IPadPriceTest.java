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
    public void shouldGetCorrectPriceForRed32G3GNetworkIPad() {
        IPad iPad = new RedIPad();
        IPad iPadWith32GMemory = new IPadMemoryDecorator(iPad, MemorySize.G32);
        IPad iPadWith32GMemory3GNetwork = new IPadNetworkDecorator(iPadWith32GMemory, Network.G3);
        assertThat(iPadWith32GMemory3GNetwork.getPrice(), is(3688 + 400 + 1600 + 1600));
    }

    @Test
    public void shouldGetCorrectPriceForWhite16GWifi3GNetworkGolfLetteringIPad() {
        IPad iPad = new WhiteIPad();
        IPad iPadWith16GMemory = new IPadMemoryDecorator(iPad, MemorySize.G16);
        IPad iPadWith16GMemoryWifi3GNetwork = new IPadNetworkDecorator(iPadWith16GMemory, Network.WIFI_G3);
        IPad iPadWith16GMemoryWifi3GNetworkGolfLettering = new IPadLetteringDecorator(iPadWith16GMemoryWifi3GNetwork, Lettering.GOLD);
        assertThat(iPadWith16GMemoryWifi3GNetworkGolfLettering.getPrice(), is(3688 + 200 + 800 + 3200 + 400));
    }
}
