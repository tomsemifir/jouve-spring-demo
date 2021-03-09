package fr.semifir.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class MonController {

	@GetMapping("hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("bye")
	public String bye() {
		return "bye world";
	}
	
	@PostMapping("message/{message}")
	public String message(@PathVariable String message) {
		return message;
	}
	
	@PostMapping("messages")
	public String messages(@RequestBody List<String> messages) {
		return "Vous avez " + messages.size() + " messages";
	}
	
	@PostMapping("params")
	public List<String> params(@RequestParam(required = false) String a, @RequestParam(required = false) String b) {
		if(a!=null && b!=null) return List.of(a,b);
		else if(a!=null) return List.of(a);
		return List.of();
	}
	
}
