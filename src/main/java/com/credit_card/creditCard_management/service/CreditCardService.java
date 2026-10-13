package com.credit_card.creditCard_management.service;

import java.util.List;

import com.credit_card.creditCard_management.controller.CreditCard;
import com.credit_card.creditCard_management.model.CreditCardModel;


public interface CreditCardService {
	 public  CreditCardModel createCard(CreditCardModel c);
	 
		List <CreditCardModel> getAllCredits();
		CreditCardModel getCardByUserId(Integer user_id) throws Exception ;
		CreditCardModel updateCardByUserId(CreditCardModel c,Integer user_id);
		  void deleteCardByUserId(Integer user_id);

		 
}
