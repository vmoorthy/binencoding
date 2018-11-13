package com.intuit.encoding.kryo;

import junit.framework.TestCase;


public class EventTest extends TestCase {

    public void testConstructEvent() {
        Event event = EventUtil.createEvent();
        assertEquals("INSERT",event.getEventType());
        assertEquals(new Long(1234567l),event.getSeqno());

        System.out.println("Java Event Object Size =" + ObjectSizeCalculator.getObjectSize(event));
    }

}
