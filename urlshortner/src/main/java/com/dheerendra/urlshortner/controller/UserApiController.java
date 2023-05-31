/**
 * 
 */
package com.dheerendra.urlshortner.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<?> getUrlDetails(@PathVariable("url") final String url){
		
		return new ResponseEntity<>(url, HttpStatus.OK);
	}
	
	/**
	 * @return
	 */
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> createNewShort(){
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	/**
	 * @param id
	 * @return
	 */
	@PutMapping(value = "/{id}", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> updateShort(@PathVariable("id") final String id){
		
		return new ResponseEntity<>(id, HttpStatus.OK);
	}
	
	/**
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> deleteShort(@PathVariable("id") final String id){
		
		return new ResponseEntity<>(id, HttpStatus.NO_CONTENT);
	}

}
