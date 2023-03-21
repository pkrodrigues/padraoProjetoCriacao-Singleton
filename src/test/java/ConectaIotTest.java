import classes.ConectaIot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConectaIotTest {
    @Test
    public void shouldReturnDeviceName() {
        ConectaIot.getInstance().setNameDevice("Alexa");
        assertEquals("Alexa", ConectaIot.getInstance().getNameDevice());
    }
    @Test
    public void shouldReturnIpAddress() {
        ConectaIot.getInstance().setAddressIp("177.69.128.1");
        assertEquals("177.69.128.1", ConectaIot.getInstance().getAddressIp());
  }
}
