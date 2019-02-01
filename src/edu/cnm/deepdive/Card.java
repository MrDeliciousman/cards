package edu.cnm.deepdive;

/**
 * Instances in this class represent single cards in a deck of standard playing
 * cards. These instances are immutable: once initilized, the rank and suit of
 * a card can't be changed
 *
 * @author raymondherrera @amp; Deep Dive Coding Java + Android cohort 6
 *  * @version 1.0
 */

public class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;

  /**
   * Initializes the <code>Card</code> instance with the specified {@link
   * Suit} and {@link Rank}.
   *
   * @param rank card's ranked (A, 2, &hellip; K).
   * @param suit card's suit (Clubs, Diamonds, Hearts, Spades
   */

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return String.format("%s %s", rank, suit);
  }

  @Override
  public int compareTo(Card other) {
    int comparison = getSuit().compareTo(other.getSuit());
    if (comparison == 0) {
      comparison = getRank().compareTo(other.getRank());
    }
    return comparison;
  }
}
