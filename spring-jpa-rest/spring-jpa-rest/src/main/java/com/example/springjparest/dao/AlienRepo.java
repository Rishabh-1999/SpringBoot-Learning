package com.example.springjparest.dao;

import com.example.springjparest.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface AlienRepo extends JpaRepository<Alien,Integer> {

}
