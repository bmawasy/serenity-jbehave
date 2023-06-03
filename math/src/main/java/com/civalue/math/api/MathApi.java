package com.civalue.math.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = MathApi.PATH)
public interface MathApi {
    static final String PATH = "/math/api";
    @GetMapping("/x")
    long get();

    @PostMapping("/multiply/{x}")
    long multiply(@PathVariable("x") long x);

    @PostMapping("/add/{x}")
    long add(@PathVariable("x") long x);

    @PostMapping("/subtract/{x}")
    long subtract(@PathVariable("x") long x);

    @PostMapping("/divide/{x}")
    long divide(@PathVariable("x") long x);

    @PostMapping("/set/{x}")
    void set(@PathVariable("x")long x);
}
