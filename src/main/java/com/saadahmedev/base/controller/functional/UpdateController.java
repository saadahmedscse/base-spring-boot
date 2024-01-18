package com.saadahmedev.base.controller.functional;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FunctionalInterface
public interface UpdateController<I, D> {

    @Nonnull
    @PutMapping("{id}")
    ResponseEntity<?> update(@PathVariable("id") I id, @Nullable @RequestBody D body);
}
