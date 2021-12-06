package springboot.AirportService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	
	
	@RequestMapping("/")
	public String sayHello() {
		//System.out.println("HELLOWORLD");
		return "HelloWorld";
	}
	

}
