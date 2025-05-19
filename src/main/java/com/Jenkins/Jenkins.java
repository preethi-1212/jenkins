package com.Jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jenkins {
@GetMapping (value="get")
public String get()
{
	return "Welcome";
}

@GetMapping (value="getint")
public int getint()
{
	return 10;
}
}
