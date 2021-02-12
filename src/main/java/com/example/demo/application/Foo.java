package com.example.demo.application;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Foo {
  @NotNull String foo;
}
