package com.example.demo.application;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.UUID;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.SimpleRepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class FooResourceAssembler
    implements SimpleRepresentationModelAssembler<Foo> {

  @Override
  public void addLinks(EntityModel<Foo> resource) {
    var foo = resource.getContent();
    if (foo != null) {
      try {
        resource.add(
            linkTo(methodOn(FooController.class).getFoo(UUID.fromString(foo.getFoo()))).withSelfRel());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public void addLinks(CollectionModel<EntityModel<Foo>> resources) {

  }
}