public class Card implements Comparable<Card>{
    private String name;
    private String suit;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return this.name;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }

    
    public int getValue(){  
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
     	String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
	    int value = 0;
	    for(int i = 0; i < names.length; i++){
	        if(this.name.equals(names[i])){ // gets the value/index of the card 
		        value += i; // stores it in there for later use
	    }
	}

    	for(int i = 0; i < suits.length; i++){
	        if(this.suit.equals(suits[i])){ 
		        value += i;
		        
	    }
	}
	
	return value; // for example Card card = new Card("Jack", "Clubs"); jack would be index 10 and Clubs would be index 1 (total value would be 10 + 1 = 11)

    }

    @Override
    public int compareTo(Card other){
	    return getValue() - other.getValue();
    }

}




