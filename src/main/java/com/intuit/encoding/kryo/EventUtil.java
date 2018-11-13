package com.intuit.encoding.kryo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EventUtil {

    public static Event createEvent() {
        Event event = new Event();

        event.setEventType("INSERT");
        event.setSeqno(1234567l);
        event.setFragno(12345678l);
        event.setTimestamp(new Date().getTime());
        event.setColumnsChanged("name,phoneNum");

        Map<String,Object> beforeRecord = new HashMap<String,Object>();
        beforeRecord.put("id",123);
        beforeRecord.put("name","Veera");
        beforeRecord.put("phoneNum",99454611226l);
        beforeRecord.put("location","Bangalore");
        beforeRecord.put("state","Karnataka");

        Map<String,Object> afterRecord = new HashMap<String,Object>();
        afterRecord.put("id",123);
        afterRecord.put("name","Veeramani");
        afterRecord.put("phoneNum",9945411226l);
        afterRecord.put("location","Bangalore");
        afterRecord.put("state","Karnataka");

        event.setAfterRecord(afterRecord);
        event.setBeforeRecord(beforeRecord);
        return event;
    }
}
