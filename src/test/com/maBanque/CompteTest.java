package test.com.maBanque;

import static org.junit.Assert.*;

import org.junit.Test;  
import com.maBanque.CompteImpl; 
 
public class CompteTest { 
 	 
	@Test 
 	public void setSolde(){ 
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  		 	 	
 	 	 	compteImpl.setSolde(10);  	 	 	
 	 	 	float solde = compteImpl.getSolde();  	 	
 	 	 	assertTrue(solde == 10);  	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	}
	
	@Test
	public void setSoldeErreur() throws Exception{
		try {
	 	 	CompteImpl compteImpl = new CompteImpl();  	
	 	 	compteImpl.setSolde(-1);
	 	 	fail("Exception");
		} catch (Exception e) {
			
		}
	}
	
	
	
	
	
	@Test 
 	public void crediter(){ 
 	 	try{
 	 	 	CompteImpl compteImpl = new CompteImpl();	 	 	 
 	 	 	compteImpl.crediter(10);
 	 	 	float solde = compteImpl.getSolde(); 
 	 	 	assertTrue(solde == 10);  	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 
	
	/*@Test (expected = Exception.class)
	public void crediter1(){ 
 	 	try{
 	 	 	CompteImpl compteImpl = new CompteImpl();  		 	 	
 	 	 	compteImpl.setSolde(5);  	 	 	
 	 	 	float solde = compteImpl.getSolde();  
 	 	 	compteImpl.crediter(0);	 	
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 
	
	public void debiter(){ 
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  		 	 	
 	 	 	compteImpl.setSolde(50);
 	 	 	compteImpl.debiter(15);
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} 
	
	public void debiter1(){ 
 	 	try{ 
 	 	 	CompteImpl compteImpl = new CompteImpl();  		 	 	
 	 	 	compteImpl.setSolde(5000);
 	 	 	compteImpl.debiter(1005);
 	 	 } catch(Exception e){ 
 	 	 	fail(e.getMessage()); 
 	 	} 
 	} */


}