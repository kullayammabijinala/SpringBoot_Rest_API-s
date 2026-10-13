package com.credit_card.creditCard_management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.credit_card.creditCard_management.model.CreditCardModel;
@Repository
public interface CreditCardRepo extends JpaRepository<CreditCardModel, Integer> {

}
