package com.credit_card.creditCard_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credit_card.creditCard_management.model.CreditCardModel;
import com.credit_card.creditCard_management.service.CreditCardService;


@CrossOrigin("*")
@RestController
@RequestMapping("/CreditCard")

public class CreditCard {
	@Autowired
	CreditCardService Creditcardservice;
	
	@GetMapping("/show")
	 String show(){
		return "welcom to the world";
	}
	
//	http://localhost:9977/CreditCard/postcard
	@PostMapping("/postcard")
public CreditCardModel  createCard(@RequestBody CreditCardModel  c) {
		System.out.println(c);
		return Creditcardservice.createCard(c);
	}
	
	
//	http://localhost:9977/CreditCard/update/2
	@PutMapping("update/{user_id}")
	CreditCardModel  updateCardByUserId(@RequestBody CreditCardModel  c,@PathVariable Integer user_id) {
		return Creditcardservice.updateCardByUserId(c,user_id) ;	 
	 }
	
//	http://localhost:9977/CreditCard/getallCredits
	@GetMapping("/getallCredits")
	 List<CreditCardModel > getAllCredits() {
		return Creditcardservice.getAllCredits();
	}
	
//	http://localhost:9977/CreditCard/getCardByUserId/2
	@GetMapping("/getCardByUserId/{user_id}")
	CreditCardModel getCardByUserId(@PathVariable Integer user_id) throws Exception {
			return Creditcardservice. getCardByUserId(user_id);
	}
	
//	http://localhost:8801/student/getallStudent/fname/rahul
//	@GetMapping("/getallStudent/fname/{fname}")
//	CreditCard  getStudentByFname(@PathVariable Integer card_id) {
//			return Creditcardservice.getStudentByFname(card_id);
//	}
	
//	http://localhost:9977/CreditCard/delete/2
	@DeleteMapping("/delete/{user_id}")
	 String deleteCardByUserId(@PathVariable Integer user_id) {
		Creditcardservice.deleteCardByUserId(user_id);
		return "delete"+user_id+"succussfully";
		 
	 }

}
