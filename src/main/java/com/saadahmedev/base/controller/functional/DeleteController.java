package com.saadahmedev.base.controller.functional;

import jakarta.annotation.Nonnull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FunctionalInterface
public interface DeleteController<I> {

    @Nonnull
    @DeleteMapping("{id}")
    ResponseEntity<?> deleteById(@PathVariable("id") I id);
}
