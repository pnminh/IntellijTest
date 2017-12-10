package com.minh.intellij.service;

import com.minh.intellij.model.Name;

public class NameServiceImpl implements NameService {
    public String callName(Name name) {
        return String.format("Hello %s %s %s", name.getFirstName(), name.getMiddleName(), name.getLastName());
    }
}
