package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Controller {

	
	@RequestMapping(
	          value= "/test",
	          method = RequestMethod.GET)
	  @ResponseBody
	  public String getTest() {
	    return "test without params";
	  }

	  @RequestMapping(
	          value= "/test/",
	          method = RequestMethod.POST)
	  @ResponseBody
	  public String getTest	(@RequestBody User json) {
	    return "test with param"+json.getName();
	  }
}
