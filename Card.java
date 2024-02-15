package week6Assignment;

public class Card {
    private String valueString;
	private int value;
    private String name;
    
    public Card(int value) {
        if (value<12) name = "Diamonds";
        else if (value<25) name = "Hearts";
        else if (value<38) name = "Spades";
        else if (value<52) name = "Diamonds";
        value = value%13+2; //this gives a value of 2-14
        this.value = value;
        //If it is a number card just convert int to String
        if (this.value<11) this.valueString = Integer.toString(value);
        else if (value == 11) this.valueString = "Jack";
        else if (value == 12) this.valueString = "Queen";
        else if (value == 13) this.valueString = "King";
        else if (value == 14) this.valueString = "Ace";
        
    }
    //Getters because no one should be able to change a card once made
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getValueString() {
		return valueString;
	}

    public String describe() {
        return this.valueString + " of " + this.name;
    }
}



