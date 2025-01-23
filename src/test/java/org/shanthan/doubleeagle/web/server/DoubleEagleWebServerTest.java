package org.shanthan.doubleeagle.web.server;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleEagleWebServerTest {

    private DoubleEagleWebServer subject;

    @Test
    public void testMainWebServer() {
        subject = new DoubleEagleWebServer();
        Assertions.assertNotNull(subject);
    }
}
