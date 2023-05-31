/**
 * 
 */
package com.dheerendra.urlshortner;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dheerendra
 *
 */

@RestController(value = "/user/url")
public class UserApiController {
	
	
	/**
	 * @return
	 */
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> getAllUrls(){		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	/**
	 * @param url
	 * @return
	 */
	@GetMapping(value = "/{url}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> getUrlDetails(@RequestParam("url") final String url){
		
		return new ResponseEntity<>(url, HttpStatus.OK);
	}
	
	

}
