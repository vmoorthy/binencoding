package com.intuit.encoding.kryo;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class Event implements Serializable {
    private Long seqno;
    private Long fragno;
    private Long timestamp;
    private String columnsChanged;
    private String eventType;
    private Map<String,Object> beforeRecord;
    private Map<String,Object> afterRecord;

    public Event(){
    }

    public Long getSeqno() {
        return seqno;
    }

    public void setSeqno(Long seqno) {
        this.seqno = seqno;
    }

    public Long getFragno() {
        return fragno;
    }

    public void setFragno(Long fragno) {
        this.fragno = fragno;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getColumnsChanged() {
        return columnsChanged;
    }

    public void setColumnsChanged(String columnsChanged) {
        this.columnsChanged = columnsChanged;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Map<String, Object> getBeforeRecord() {
        return beforeRecord;
    }

    public void setBeforeRecord(Map<String, Object> beforeRecord) {
        this.beforeRecord = beforeRecord;
    }

    public Map<String, Object> getAfterRecord() {
        return afterRecord;
    }

    public void setAfterRecord(Map<String, Object> afterRecord) {
        this.afterRecord = afterRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(seqno, event.seqno) &&
                Objects.equals(fragno, event.fragno) &&
                Objects.equals(timestamp, event.timestamp) &&
                Objects.equals(columnsChanged, event.columnsChanged) &&
                Objects.equals(eventType, event.eventType) &&
                Objects.equals(beforeRecord, event.beforeRecord) &&
                Objects.equals(afterRecord, event.afterRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seqno, fragno, timestamp, columnsChanged, eventType, beforeRecord, afterRecord);
    }

    @Override
    public String toString() {
        return "Event{" +
                "seqno=" + seqno +
                ", fragno=" + fragno +
                ", timestamp=" + timestamp +
                ", columnsChanged='" + columnsChanged + '\'' +
                ", eventType='" + eventType + '\'' +
                ", beforeRecord=" + beforeRecord +
                ", afterRecord=" + afterRecord +
                '}';
    }
}


