package com.example.demo.application;

import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class FooService {
  public Optional<Foo> getFoo(UUID uuid) {
    return Optional.of(new Foo(uuid.toString()));
  }
}
