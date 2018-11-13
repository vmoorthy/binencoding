package com.intuit.encoding.kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class EventKryoDeserializer {
    public EventKryoDeserializer(){
    }

    public Event deserialize(byte[] bytes) throws IOException {
        Kryo kryo = new Kryo();
        kryo.register(Event.class);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        Input input = new Input(byteArrayInputStream);
        Event event =  (Event)kryo.readClassAndObject(input);
        input.close();
        return event;
    }
}
