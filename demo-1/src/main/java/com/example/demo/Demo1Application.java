package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entites.User;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
	
//		User user1 =new User();
//		user1.setName("Aj");
//		user1.setCity("Ranchi");
//		user1.setStatus("I am Meme Wale Bhaiya");
//		
//		User user2 =new User();
//		user2.setName("Ravi Kumar");
//		user2.setCity("Bokaro");
//		user2.setStatus("I am bhadwa");
//		User user = userRepository.save(user1);
//		System.out.println(user);
		
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result= userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		
		
		//update the user
//		Optional<User> id = userRepository.findById(2);
//		User user =id.get();
//		System.out.println(user);
//		user.setName("Riya Biswas");
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
		
		
		
		// how to get the data 
		Iterable<User> itr = userRepository.findAll();
		
		Iterator<User> iterator = itr.iterator();
		
//		while(iterator.hasNext()){
//			User user=iterator.next();
//			System.out.println(user);
//		} 
		
		//or 
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		
//		 deleting the user element 
//		userRepository.deleteById(12);
//		System.out.println("deleted ");
		
		
//		 #custoum finder methods 
//		data by name 
//		data by name and password
//		data by name or password
//		data name starting with prefix 
//		data by name like 'keyword'
		
		
//		List<User> list = userRepository.findByNameStartingWith("R");
//		list.forEach(e->System.out.println(e));
		
//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(e->System.out.println(e));
		
//		List<User> name = userRepository.getUserBYName("Aj")	;
//		name.forEach(e->System.out.println(e));
		
		
	}

}
