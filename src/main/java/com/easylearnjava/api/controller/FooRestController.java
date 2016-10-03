package com.easylearnjava.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.easylearnjava.api.model.Foo;

@Controller
@RequestMapping(value = "/ex")
public class FooRestController {

    public FooRestController() {
        super();
    }

 // API - read

    @RequestMapping(method = RequestMethod.GET, value = "/foos/{id}")
    @ResponseBody
    public Foo findById(@PathVariable final long id) {
        return new Foo(1, "raghu");
    }

    // API - write

    @RequestMapping(method = RequestMethod.PUT, value = "/foos/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Foo updateFoo(@PathVariable("id") final String id, @RequestBody final Foo foo) {
        System.out.println(foo);
        return foo;
    }

    /*@RequestMapping(method = RequestMethod.GET, value = "/foos/{id}", produces = { "application/x-protobuf" })
    @ResponseBody
    public FooProtos.Foo findProtoById(@PathVariable final long id) {
        return FooProtos.Foo.newBuilder().setId(1).setName("Foo Name").build();
    }*/

}