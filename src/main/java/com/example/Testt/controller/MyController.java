package com.example.Testt.controller;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Testt.controller.entities.Course;
@RestController
public class MyController {
	@GetMapping("/home")
public String home()
{
	return"This is home page";
}
}