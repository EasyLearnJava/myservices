package com.easylearnjava.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="mymodule/getMyResource.do", method = RequestMethod.GET)
@ResponseBody
public class TestETagRestController {

}
