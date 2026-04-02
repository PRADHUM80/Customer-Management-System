package sales_savvy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTester {

	@GetMapping("/api/test")
	public String apiTest()
	{
		return " API was hit, Go ahead!";
	}
}
