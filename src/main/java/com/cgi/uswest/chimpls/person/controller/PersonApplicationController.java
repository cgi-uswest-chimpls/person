package com.cgi.uswest.chimpls.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.uswest.chimpls.person.objects.Person;
import com.cgi.uswest.chimpls.person.objects.PersonRepository;

@RefreshScope
@RestController
public class PersonApplicationController {

	  @Autowired
	  private PersonRepository repository;
	  
	  @RequestMapping("/people/{idprsn}")
	   public Person findOne(@PathVariable("idprsn") String idprsn) {
	       return repository.findPersonByIdprsn(idprsn);
	   }
	
}
