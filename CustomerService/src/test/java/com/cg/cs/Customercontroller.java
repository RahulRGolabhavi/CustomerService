package com.cg.cs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customercontroller {
	
	@Autowired
	private CustomerServices services;
	
	// Retrieval
	
	@GetMapping("/Customer")
	public List< Customer>list() {
		return services.listAll();
	}
	
	// Retrieve by id
	
	@GetMapping("/Customer/{id}")
	public ResponseEntity<Customer>get(@PathVariable Integer id){
		try {
			Customer customer=services.get(id);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	//Create
	
	@PostMapping("/Customer")
		public void add(@RequestBody Customer customer)
		
		{
			services.save(customer);
		}
	
	//Update 
	@PutMapping("/Customer/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id)
	{
		try {
			Customer existCustomer = services.get(id);
			services.save(customer);
			return new ResponseEntity<> (HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<> (HttpStatus.NOT_FOUND);
		}
	}
	
	//delete
	@DeleteMapping("/Customer/{id}")
	public void delete(@PathVariable Integer id)
	{
		services.delete(id);
	}

}
