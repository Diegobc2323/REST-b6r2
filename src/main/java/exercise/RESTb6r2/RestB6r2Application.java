package exercise.RESTb6r2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RestB6r2Application {


	 @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
	    public String home() {
	        return "Nothing here. Go to <a href='/ejemplo'>/ejemplo</a>";
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(RestB6r2Application.class, args);
	}

}
