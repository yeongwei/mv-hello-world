package com.example.app;

import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;
import com.jsoniter.output.JsonStream;
import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.TestCase;

public class JsoniterTest extends TestCase {
    public void testJsoniter() {
        String json = JsonStream.serialize(new String[]{"hello", "world"});
        assertTrue(json.equals("[\"hello\",\"world\"]"));
    }

    public void testJsoniter2() {
        Any any = JsonIterator.deserialize("[\"hello\",\"world\"]");
        assertTrue(any.get(0).as(String.class).equals("hello"));
        assertTrue(any.get(1).as(String.class).equals("world"));
    }

    private class Record {
        private String key;
        private String value;
        public Record(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    /*
    public void testJsoniter3() {
        Record r = new Record("key", "value");
        String json = JsonStream.serialize(r);
        Any any = JsonIterator.deserialize(json);
        any.as(Record.class);
    }
    */
}
