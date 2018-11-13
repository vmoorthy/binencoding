package com.intuit.encoding.kryo;

import junit.framework.TestCase;
import java.io.IOException;

public class EventSerializerTest extends TestCase {

    public void testSerializeEvent() throws IOException {
        Event event = EventUtil.createEvent();

        EventSerializer serializer = new EventSerializer();
        byte[] bytes = serializer.serialize(event);
        assertNotNull(bytes);
        System.out.println("Java Serialization: Bytes length after serialization = " + bytes.length);
    }
}
