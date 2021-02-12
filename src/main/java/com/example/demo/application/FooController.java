package com.example.demo.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

  @GetMapping(value = "foos")
  public ResponseEntity<Bar<Foo>> getFoo() {
    var foo = new Foo("test");
    return ResponseEntity.ok(Bar.of(foo));
  }
}