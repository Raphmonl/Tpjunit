package com.maBanque;

public class CompteImpl implements Compte{ 
 
 	float solde; 
 	 
 	@Override 
 	public void crediter(float credit) throws Exception{ 
 		if (credit <= 0) {
 			throw new Exception();
 		}
 		this.solde = this.solde + credit;
 	}

	@Override
	public float getSolde() {
		return this.solde;
	}

	@Override
	public float debiter(float debit) throws Exception {
		if (debit < 20 || debit > 1000) {
			throw new Exception();
		}
		else if (debit < this.solde) {
			this.solde = this.solde - debit;
			return debit;
		}
		else if (debit > this.solde) {
			return this.solde;
		}
		
		
		return 0;
	}

	@Override
	public void setSolde(float solde) throws Exception {
		if (solde <= 0) {
			throw new Exception();
		}
		this.solde = solde;
	} 
  
}