/**
 * 
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Assignment Gre4ka
 *
 * <Create an Assassin game,
 *  where the player is a spy
 *  that is trying to get the briefcase with documents
 *  and the ninja assassins are trying to catch him.>
 *
 * Team Gre4ka 
 *   <Alexandra Klimenko, Khanh Nguyen, Victor Ruiz, Ian Garrett>
 */
package edu.cpp.cs.cs141.finalProject;

/**
 * The Square class formed the grid with 81 squares, every object class will inherit from this class.
 * Each square has a string symbol to display the object at the current square,
 * it also has the row & column attributes to keep track of the position of the object on the map.
 */
public class Square {
	
	/**
	 * Row & Column to keep track of the object position on the 2 dimensional array.
	 */
	int row;
	int col;
	
	/**
	 * The symbol that will represent the object on the map, default: X.
	 */
	String symbol = "X";
	
	/**
	 * Constructor of the Square class.
	 * @param symbol pass in the string that will be displayed on the map.
	 * @param row a number from 0-8
	 * @param col a number from 0-8
	 */
	public Square(String symbol, int row, int col) {
		this.symbol = symbol;
		this.row = row;
		this.col = col;
	}

	/**
	 * Get the string symbol representation of the object.
	 * @return the string symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Set the string symbol representation of the object.
	 * @param symbol the string symbol to be display on the map.
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the row coordinate.
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @param row a number from 0-8, to set the row.
	 */
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * @return the column coordinate.
	 */
	public int getCol() {
		return col;
	}

	/**
	 * @param col a number from 0-8, to set the column.
	 */
	public void setCol(int col) {
		this.col = col;
	}

}