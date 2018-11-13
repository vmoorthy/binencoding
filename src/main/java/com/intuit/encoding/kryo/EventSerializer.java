package com.intuit.encoding.kryo;

import java.io.*;

public class EventSerializer {

    public EventSerializer(){
    }

    public byte[] serialize(Event event) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(event);
        outputStream.close();
        byte[] bytes = byteArrayOutputStream.toByteArray();
        return bytes;
    }
}
