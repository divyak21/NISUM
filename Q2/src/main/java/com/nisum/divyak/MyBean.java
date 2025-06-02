package com.nisum.divyak;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("singleton") // default, will override per-controller
public class MyBean {
    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
