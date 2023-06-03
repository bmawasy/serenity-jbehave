package com.civalue.math.api;


import feign.Param;
import feign.RequestLine;

interface MathApi {
    String PATH = "/math/api";

    @RequestLine("POST " + PATH + "/multiply/{x}")
    Long multiply(@Param("x") Long x);

    @RequestLine("POST " + PATH + "/divide/{x}")
    Long divide(@Param("x") Long x);

    @RequestLine("POST " + PATH + "/add/{x}")
    Long add(@Param("x") Long x);

    @RequestLine("POST " + PATH + "/subtract/{x}")
    Long subtract(@Param("x") Long x);


    @RequestLine("POST " + PATH + "/set/{x}")
    void set(@Param("x") Long x);

    @RequestLine("GET " + PATH + "/x")
    Long getValue();


}


