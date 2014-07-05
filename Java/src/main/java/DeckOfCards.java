/*
Question
Design the data structure gor a genric deck of cards. Explain how you would
subclass the data structures to implement blackjack.
*/

/*
Solution 
Need to recognize "generic" deck of cards means many things.
Generic could mean a standard deck of cards that can play a poker-like game,
or it could even stretech to Uno or Baseball cards. Important to ask what generic
means

Assume interviewer clarifies the deck is a standard 52-card set
*/

public enum Suit {
	Club(0), Diamond (1), Heart(2), Spade(3);
	private in value;
	private Suit(int v) 
	{ 
		value = v; 
	}
	public int GetValue()
	{
		return value;
	}
	//public static Suit getSuitFromValue(int value) {...}
}

public abstract class Card {
	private boolean available = true;
	/* # or face that's on card - a numebr 2 10 or 
	11 for Jack, 12 for Queen, 13 for King or 1 for Ace */
	protected int value;
	protected Suit suit;

	public Card(int value, Suit suit)
	{
		this.value = this.value;
		this.suit = suit;
	}

	public abstract int value();

	public Suit suit() { 
		return this.suit; 
	}

	public boolean isCardAvailable() {
		return this.available;
	}

	public void cardIsDealt() {
		this.available = false;
	}

	public void cardIsNotDealt() {
		this.available = true;
	}




}

public class Deck extends Card 
{
	private ArrayList<Card> cards;		//All the cards
	private int dealtIndex = 0;			//Marks first undealth card

	public void shuffle() 
	{
		long seed = System.nanoTime();
		Collections.shuffle(cards, new Random(seed));
	}

	public int remaingCards()
	{
		return cards.size() = dealtIndex;
	}

	public Card[] dealHand(int number)
	{


	}

	public Card dealCard()
	{
		cards[dealtIndex].cardIsDealt();
		return cards[dealtIndex++];
	}
}

public class Hand extends Card 
{
	protected ArrayList<Card> cards = new ArrayList<Card>();

	public int score()
	{
		int score = 0;
		for(card : cards)
		{
			score += card.value();
		}
		return score;
	}

	public void addCard(Card card)
	{
		cards.add(card);
	}
}

public class BlackJackHand extends Hand 
{
	public int score()
	{
		ArrayList<Integer> scores = possibleScores();

	}

}

public class BlackJackCard extends Card
{
	public BlackJackCard(int card, Suit suit)
	{
		super(card, suit);
	}

	public boolean busted()
	{
		return score() > 21;
	}

	public boolean is21
}


