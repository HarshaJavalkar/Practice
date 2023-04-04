package begining.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class add {
	
	@GetMapping("/add/{a}/{b}")
	public int  adding(@PathVariable int a, @PathVariable  int b) {
		return a+b; 
	}
	
	
	
	
	@GetMapping("/working")
	public String testing() {
		
		return "Hello, World";
	}
	
}
