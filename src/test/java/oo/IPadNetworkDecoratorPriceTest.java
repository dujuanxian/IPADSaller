package oo;

import oo.accessory.Network;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IPadNetworkDecoratorPriceTest {
    @Test
    public void shouldGetCorrectPriceForBlackWifiNetworkIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadWifiNetworkDecorator = new IPadDecorator(iPad, Network.WIFI);
        assertThat(iPadWifiNetworkDecorator.getPrice(), is(3688 + 800));
    }

    @Test
    public void shouldGetCorrectPriceForBlack3GNetworkIPad() {
        IPad iPad = new BlackIPad();
        IPad iPad3GNetworkDecorator = new IPadDecorator(iPad, Network.G3);
        assertThat(iPad3GNetworkDecorator.getPrice(), is(3688 + 1600));
    }

    @Test
    public void shouldGetCorrectPriceForBlackWifi3GNetworkIPad() {
        IPad iPad = new BlackIPad();
        IPad iPadWifi3GNetworkDecorator = new IPadDecorator(iPad, Network.WIFI_G3);
        assertThat(iPadWifi3GNetworkDecorator.getPrice(), is(3688 + 3200));
    }
}
