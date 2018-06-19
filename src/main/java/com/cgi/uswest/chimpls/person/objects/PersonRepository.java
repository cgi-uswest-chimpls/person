package com.cgi.uswest.chimpls.person.objects;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, UUID> {

	Person findPersonByIdprsn(@Param("idprsn") String idprsn);
	
}
