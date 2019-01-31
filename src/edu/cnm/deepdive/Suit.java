package edu.cnm.deepdive;

public enum Suit {
  CLUBS("\u2663"),
  DIAMONDS("\u2662"),
  HEARTS("\u2661"),
  SPADES("\u2660");

  private final String symbol;

  private Suit (String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return symbol;
  }
}
