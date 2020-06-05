package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public void hello(HttpServletResponse r) throws IOException {
		r.getWriter().print("TESTSTEST 뿡뿌루뿡뿡");
	} 
}
