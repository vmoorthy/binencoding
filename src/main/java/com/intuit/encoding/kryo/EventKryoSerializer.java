package com.intuit.encoding.kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class EventKryoSerializer {
    public EventKryoSerializer(){
    }

    public byte[] serialize(Event event) throws IOException {
        Kryo kryo = new Kryo();
        kryo.register(Event.class);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Output output = new Output(byteArrayOutputStream);
        try {
            kryo.writeClassAndObject(output, event);
            output.close();
            byte[] bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } finally {
            output.close();
            byteArrayOutputStream.close();
        }
    }
}
