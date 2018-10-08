package com.example.simiyunabende.javadevs;

import com.example.simiyunabende.javadevs.view.MainActivity;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class MainActivityTests {

    @Test
    public void mainActivity_has_Ocreate_Method() {
        /*Test that Oncreate() function exists
        */
        Class test_class = MainActivity.class;
        for (Method method : test_class.getDeclaredMethods()) {
            assertEquals(method.getName().equals("OnCreate"),is(true));
        }
    }

}
