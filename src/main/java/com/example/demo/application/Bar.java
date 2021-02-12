package com.example.demo.application;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.lang.Nullable;

public class Bar <T> {
  private T content;

  protected Bar() {
    this.content = null;
  }

  public static <T> Bar<T> of(T content) {
    return of(content);
  }

  @Nullable
  @JsonUnwrapped
  public T getContent() {
    return this.content;
  }
}
