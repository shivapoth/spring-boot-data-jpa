package com.ojas;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ojas.entity.Customer;
import com.ojas.repo.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		CustomerRepository userRepo = ctx.getBean(CustomerRepository.class, args);

		Customer customer = new Customer();

		// Insert (Single Record)
//
//		customer.setCname("shiva");
//		customer.setCadd("Balapur");
//
//		Customer save = userRepo.save(customer);
//
//		System.out.println("Added SuccessFully " + save);

		// Insert (Multiple records)
//
//		customer.setCname("Aravind");
//		customer.setCadd("Karim Nagar");
//
//		Customer customer1 = new Customer();
//
//		customer1.setCname("Kalyan");
//		customer1.setCadd("Warangal");
//
//		// Java 9 Feature to Store a List
//		List<Customer> listOfCustomers = List.of(customer, customer1);
//
//		Iterable<Customer> saveAll = userRepo.saveAll(listOfCustomers);
//
//		System.out.println(saveAll);

		// update

//		//findById() : It Fetches the Particular Record By Id From Table
//		Optional<Customer> findById = userRepo.findById(1);
//
//		//get(): It Get's the Particular Id
//		Customer cu = findById.get();
//
//		cu.setCname("Shiva Teja");
//		cu.setCadd("Hyderabad");
//
//		Customer save = userRepo.save(cu);
//
//		System.out.println(save);

		// view(Multiple Record)

		// 1) First Approach : This Approach Gives Multiple Records By findAll and By
		// Using Java8 to Display
//		Iterable<Customer> findAll = userRepo.findAll();
//
//		findAll.forEach(e -> System.out.println(e));

		// 2) Second Approach : By Using Customer Predicate (Implementing methods from it)
//		Iterable<Customer> findAll = userRepo.findAll();
//
//		findAll.forEach(new Consumer<Customer>() {
//
//			@Override
//			public void accept(Customer t) {
//
//				System.out.println(t);
//
//			}
//
//		});
		
		// Delete 
//		
//		userRepo.deleteById(2);
	}

}
