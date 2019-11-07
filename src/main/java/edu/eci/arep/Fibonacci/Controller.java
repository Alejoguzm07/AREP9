package edu.eci.arep.Fibonacci;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fibonacci")
public class Controller {		
		@GetMapping("/{number}")
		public ResponseEntity<?> getFibonacci(@PathVariable("number") String i) throws Exception{
		    try {
		        return new ResponseEntity<>(fibonacci(Integer.parseInt(i)),HttpStatus.ACCEPTED);
		    } catch (Exception ex) {
		        return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
		    }
	    }
		
		private static int fibonacci(int i) {
			if(i == 0) {
				return 0;
			}else if( i == 1) {
				return 1;
			}else {
				return fibonacci(i - 1) + fibonacci(i - 2); 
			}
		}

}
