package com.example.app;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
    private static HelloWorld helloWorld;

    public HelloWorldTest(String testName) {
        super(testName);
        helloWorld = init();
    }

    private static HelloWorld init() {
        return new HelloWorld();
    }

    public void testApp() {
        assertTrue(helloWorld.get().equals("Hello World"));
    }

    public void testApp2() {
        assertTrue(true);
    }
}
