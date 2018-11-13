package com.intuit.encoding.kryo;

import junit.framework.TestCase;
import java.io.IOException;

public class EventKryoSerializerTest extends TestCase {

    public void testSerializeEvent() throws IOException {
        Event event = EventUtil.createEvent();

        EventKryoSerializer serializer = new EventKryoSerializer();
        byte[] bytes = serializer.serialize(event);
        assertNotNull(bytes);
        System.out.println("Kryo Serialization: Bytes length after serialization = " + bytes.length);

        EventKryoDeserializer deserializer = new EventKryoDeserializer();
        Event event2 = deserializer.deserialize(bytes);
        assertEquals(event,event2);

        System.out.println("Serialized event = " + event);
        System.out.println("Deserialized event = " + event2);

    }
}

