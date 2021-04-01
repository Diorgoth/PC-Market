package com.example.demo.repository;

import com.example.demo.entity.Details;
import com.example.demo.projection.CustomDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "details",collectionResourceRel = "list",excerptProjection = CustomDetails.class)
public interface DetailsRepository extends JpaRepository<Details,Integer> {
}
