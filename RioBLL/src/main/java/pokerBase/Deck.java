package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerBase.eCardSuit;

public class Deck  {

	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	public  Deck() {
		
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 14; j++){
				Card c = new Card(eCardSuit.values()[i], eCardRank.values()[j]);
				
			}
		}
		
		
		
			}
		
	
		public int GetSize() {
			
			return DeckCards.size();
		
		}	
		
		
			
		
	
			
		
				
	
			
			
			
		
		}
		
	
	
		
	
		

	
	
			
	
	

