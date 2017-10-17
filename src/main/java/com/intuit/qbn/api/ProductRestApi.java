package com.intuit.qbn.api;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.models.Model;

@RestController
	@RequestMapping("/product")
	public class ProductRestApi {
	   
	    @RequestMapping(value = "/list", method= RequestMethod.GET)
	    public String list(Model model){
	        return "list data";
	    }
	    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET)
	    public String showProduct(@PathVariable Integer id, Model model){
	      
	        return "product Name";
	    }
	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public ResponseEntity<String> saveProduct(@RequestBody String product){
	       
	        return new ResponseEntity("Product saved successfully", HttpStatus.OK);
	    }
	    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody String product){
	        
	        return new ResponseEntity("Product updated successfully", HttpStatus.OK);
	    }
	    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity delete(@PathVariable Integer id){
	       
	        return new ResponseEntity("Product deleted successfully", HttpStatus.OK);
	    }
	}

