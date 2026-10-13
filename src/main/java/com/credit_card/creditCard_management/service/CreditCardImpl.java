package com.credit_card.creditCard_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credit_card.creditCard_management.model.CreditCardModel;
import com.credit_card.creditCard_management.repo.CreditCardRepo;

@Service
public class CreditCardImpl implements CreditCardService  {
	
	@Autowired
	CreditCardRepo creditcardrepo;

	@Override
	public CreditCardModel createCard(CreditCardModel c) {
		return creditcardrepo.save(c);
	}

	@Override
	public List<CreditCardModel> getAllCredits() {
		return creditcardrepo.findAll();
	}

	@Override
	public CreditCardModel getCardByUserId(Integer user_id){
		return creditcardrepo.findById(user_id).get();
	}

	@Override
	public CreditCardModel updateCardByUserId(CreditCardModel c, Integer user_id) {
		CreditCardModel  existcardfromDb=getCardByUserId(user_id);
		existcardfromDb.setCard_id(c.getCard_id());
		existcardfromDb.setTransaction_amt(c.getTransaction_amt());
		existcardfromDb.setAtl_amt(	c.getAtl_amt());
		existcardfromDb.setRem_bal(c.getRem_bal());
		
		return creditcardrepo.save(existcardfromDb);
	}

	@Override
	public void deleteCardByUserId(Integer id) {
		if(id!=null) {
			CreditCardModel  existcardfromDb =getCardByUserId(id);
			creditcardrepo.delete(existcardfromDb);
		}
		
		
	}

}
