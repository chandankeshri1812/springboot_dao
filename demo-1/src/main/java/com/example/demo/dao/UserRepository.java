package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
		
//	public List<User> findByName(String name);
//
//	public List <User> findByNameAndCity(String name, String city);
//	
//	public List<User> findByNameStartingWith(String prefix);
//	
//	public List<User> findByNameEndingWith(String suffix);
//	
//	public List<User> findByNameContaining(String words);
//	
//	public List<User> findByNameLike(String likePattern);
//
//	public List<User> findByAgeLessThan(int age);
//	
//	public List<User> findByAgeGreaterThan(int age);
	

//	Executing JPQL and Native Queries with Spring Data JPA | @Query @Param Annotations 
//	@Query
//		JPQL query
//		native query

	
	////		JPQL query

//	@Query("select u FROM User u")
//	public List<User> getAllUser();
	
//	@Query("select u From User u WHERE u.name =:n")
//	public List<User> getUserBYName(@Param("n") String name);

	
	///		native query

	@Query(value ="select * from user", nativeQuery =true)
	public List<User> getUsers();

}
