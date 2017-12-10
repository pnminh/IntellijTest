package com.minh.intellij.service;

import com.minh.intellij.model.Name;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NameServiceTest {
    private Name name;
    private NameService nameService = new NameServiceImpl();
    @Before
    public void setup(){
        name = new Name("Minh","Ngoc","Pham");

    }
    @Test
    public void testNameService(){
        Assert.assertEquals("Hello Minh Ngoc Pham",nameService.callName(name));
    }
}
