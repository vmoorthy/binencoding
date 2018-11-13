package com.intuit.encoding.kryo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class EventGZipSerializer {

    public EventGZipSerializer(){
    }

    public byte[] serialize(Event event) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(new GZIPOutputStream(byteArrayOutputStream));
        outputStream.writeObject(event);
        outputStream.close();
        byte[] bytes = byteArrayOutputStream.toByteArray();
        return bytes;
    }
}
