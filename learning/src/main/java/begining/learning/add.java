package begining.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class add {
//	objects
	Response res = new Response();
	Builder builder = new Builder();

	
	
	
	String validUser =  "Harsha";
	String validPass = "1234567890";
	@GetMapping("/add/{a}/{b}")
	public int  adding(@PathVariable int a, @PathVariable  int b) {
		return a+b; 
	}
	
	@GetMapping("/working")
	public String testing() {
		
		return "Hello, World";
	}
	@GetMapping("/getData")
	public Response  getUserInfo() {
			res.setCity("Bengaluru");
			res.setId(1);
			res.setName("Harsha");
		return 	res;		
	}
	@PostMapping("/setAndReturn")
	public Response setAndGet(@RequestBody Response obj) {
		res.setCity(obj.getCity());
		res.setId(obj.getId());
		res.setName(obj.getName());	
	 return res;	
	}
	
	
	
	@GetMapping("/getBuilder")
	public Builder getBuilder() {
		builder.setId(1);
		builder.setbuilderName("Sneha");
		builder.setAge("23");
		builder.setContact("1234567890");
		builder.setAdhar("123456789012345");
		builder.setBank("KFC");
		builder.setAcctNo("1234567890");
		builder.setIFC("IFCS");

		Exp expObj = new Exp();
		
		expObj.setId(1);
		expObj.setOwner("Preeti");
		expObj.setLocation("ATP");
		expObj.setDisputes("None");
		expObj.setRating("5");
		expObj.setExptdCost("2000000");
		expObj.setSettldCost("200000");
		
		builder.setExp(expObj);
	 return builder;	
	}
	
	
	
	@PostMapping("/login")
	public String login(@RequestBody loginUser obj) {
		
	System.out.println(" obj = " +   obj.getUsername()  + " database = " + validUser  );
		if(validUser.equals(obj.getUsername()))     {
			if(validPass.equals(obj.getPassword())) {
				return "SuccessFully logged in as " + obj.getUsername();
			}
			else {
				return "P501";
			}	
		}
		else {
			return "U401";
		}
		
	}
	
	
}
