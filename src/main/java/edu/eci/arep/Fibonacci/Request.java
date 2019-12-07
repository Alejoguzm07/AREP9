package edu.eci.arep.Fibonacci;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Request {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://35.173.35.111:8080/fibonacci/15");
		ArrayList<RequestThread> peticiones = new ArrayList<RequestThread>();
    	for(int i = 0; i < 2000; i++) {
    		peticiones.add(new RequestThread(url));
    	}
		for(int i = 0; i < peticiones.size(); i++) {
			peticiones.get(i).run();
		}
	}

}
