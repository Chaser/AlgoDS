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

import java.util.*;


enum Suit 
{
	Club (0), 
	Diamond (1), 
	Heart (2), 
	Spade (3);

	private int value;
	private Suit(int v) 
	{ 
		value = v; 
	}
	
	public int GetValue()
	{
		return value;
	}
	
	public static Suit getSuitFromValue(int value) 
	{
		switch(value)
		{
			case 0:
				return Suit.Club;

			case 1:
				return Suit.Diamond;

			case 2:
				return Suit.Heart;

			case 3:
				return Suit.Spade;

			default:
				return null;
		}
	}
}

abstract class Card
{
	private boolean available = true;
	protected int faceValue;
	protected Suit suit;

	public Card(int value, Suit suit)
	{
		this.faceValue = value;
		this.suit = suit;
	}

	public abstract int value();

	public Suit suit()
	{
		return suit;
	}

	//Returns where or not the card is availble to be given out to someone
	public boolean isAvailable()
	{
		return available;
	}

	public void setAsUnavailable()
	{
		available = false;
	}

	public void setAsAvailable()
	{
		available = true;
	}

	public void print()
	{
		String[] faceValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		System.out.print(faceValues[faceValue-1]);
		switch(suit)
		{
			case Club:
				System.out.print("C");
				break;
			
			case Heart:
				System.out.print("H");
				break;

			case Diamond:
				System.out.print("D");
				break;
			case Spade:
				System.out.print("S");
		}

		System.out.print(" ");
	}
}


class Deck <T extends Card> 
{
	private ArrayList<T> cards;
	private int dealtIndex = 0;

	public Deck()
	{

	}

	public void setDeckOfCards(ArrayList<T> deckOfCards)
	{
		cards = deckOfCards;
	}

	public void shuffle()
	{
		Collections.shuffle(cards);

	}	

	public int remainingCards()
	{
		return cards.size() - dealtIndex;
	}

	public T[] dealCard(int number)
	{
		if(number <=0 || remainingCards() < number)
			return null;

		T[] hand = (T[]) new Card[number];
		int count = 0;
		while (count < number)
		{
			T card = dealCard();
			if(card != null)
			{
				hand[count] = card;
				count++;
			}
			else return null;	
		}
		return hand;
	}

	public T dealCard()
	{
		if(remainingCards() == 0)
			return null;

		T card = cards.get(dealtIndex);
		card.setAsUnavailable();
		dealtIndex++;

		return card;
	}

	public void print()
	{
		for(Card card: cards)
			card.print();
	}
}

class Hand<T extends Card>
{
	protected ArrayList<T> cards = new ArrayList<T>();

	public int score()
	{
		int score = 0;
		for(T card : cards)
		{
			score += card.value();
		}
		return score;
	}

	public void addCard(T card)
	{
		cards.add(card);
	}

}

/*BLACK JACK SPECIFIC CLASSES*/

class BlackJackCard extends Card
{
	public BlackJackCard(int card, Suit suit)
	{
		super(card, suit);
	}

	public int value()
	{
		if(isAce())
			return 1;
		else if(faceValue >= 11 && faceValue <= 13)
			return 10;
		else
			return faceValue;
	}

	public int minValue()
	{
		if(isAce())
			return 1;
		else
			return value();
	}

	public int maxValue()
	{	if(isAce())
			return 11;
		else 
			return value();
	}

	public boolean isAce()
	{
		return faceValue == 1;
	}

	public boolean isFaceCard()
	{
		return faceValue >= 11 && faceValue <= 13;
	}
}


class BlackJackHand extends Hand<BlackJackCard>
{
	public BlackJackHand()
	{

	}

	public int score()
	{
		ArrayList<Integer> scores = possibleScores();
	}
	
	private ArrayList<Integer> possibleScores()
	{
		ArrayList<Integer> scores = new ArrayList<Integer>();
		if(cards.size() == 0)
		{
			return scores;
		}

		int length = scores.size();
		for(BlackJackCard card : cards)
		{
			addCardToScoreList(card, scores);
		}

		return scores;
	}

	private void addCardToScoreList(BlackJackCard card, ArrayList<Integer> scores)
	{
		if(scores.size() == 0)
		{
			scores.add(0);
		}
		int length = scores.size();
		for(int i = 0; i < length; i++)
		{
			int score = scores.get(i);
			score.set(i, score + card.minValue());
			if(card.minValue() != card.maxValue())
				scores.add(score + card.maxValue());
		}
	}

	public boolean busted()
	{
		return score() > 21;
	}

	public boolean is21()
	{
		return score() == 21;
	}

	public boolean isBlackJack()
	{
		if(cards.size() != 2)
			return false;

		BlackJackCard first = cards.get(0);
		BlackJackCard second = cards.get(1);

		return(first.isAce() && second.isFaceCard() ||
		second.isAce() && first.isFaceCard());
	}
	

}



