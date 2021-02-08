package com.example.demo.application;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

  private final FooService fooService;

  @Autowired
  public FooController(
      FooService fooService) {
    this.fooService = fooService;
  }

  @GetMapping(value = "foos")
  public ResponseEntity<List<Foo>> getFoo(Sort sort) throws Exception {
    var foo = fooService.getFoos();
    return ResponseEntity.ok(foo);
  }
}