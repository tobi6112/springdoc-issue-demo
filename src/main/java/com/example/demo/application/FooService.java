package com.example.demo.application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class FooService {
  public List<Foo> getFoos() {
    return Arrays.asList(new Foo(UUID.randomUUID().toString()), new Foo(UUID.randomUUID().toString()));
  }
}
