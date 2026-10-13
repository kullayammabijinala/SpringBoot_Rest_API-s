package com.credit_card.creditCard_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="creditcardtb")
@Setter
@Getter
public class CreditCardModel{

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		Integer user_id;
		Integer card_id;
		Double atl_amt;
		Double transaction_amt;
		Double rem_bal;
//		public Integer getUser_id() {
//			return user_id;
//		}
//		public void setUser_id(Integer user_id) {
//			this.user_id = user_id;
//		}
//		public Integer getCard_id() {
//			return card_id;
//		}
//		public void setCard_id(Integer card_id) {
//			this.card_id = card_id;
//		}
//		public Double getAtl_amt() {
//			return atl_amt;
//		}
//		public void setAtl_amt(Double atl_amt) {
//			this.atl_amt = atl_amt;
//		}
//		public Double getTransaction_amt() {
//			return transaction_amt;
//		}
//		public void setTransaction_amt(Double transaction_amt) {
//			this.transaction_amt = transaction_amt;
//		}
//		public Double getRem_bal() {
//			return rem_bal;
//		}
//		public void setRem_bal(Double rem_bal) {
//			this.rem_bal = rem_bal;
//		}
		
		@Override
		public String toString() {
			return "CreditCardModel [user_id=" + user_id + ", card_id=" + card_id + ", atl_amt=" + atl_amt
					+ ", transaction_amt=" + transaction_amt + ", rem_bal=" + rem_bal + "]";
		}
		
		
		
		
		
}
