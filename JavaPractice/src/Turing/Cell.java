package Turing;

import java.util.*;

/**
 * Represents one cell on a Turing Machine tape.
 */
public class Cell {
	/** Cell requires an ArrayList of Cell type to allow the creation of a tape composed of cells
	 * This new Arraylist requires an empty cell to begin with including pointers to a next and previous cell,
	 * if there are no other cells, next and previous should contain null to indicate the end of the Cell ArrayList
	 */
	public char content = ' ';
	// The character in this cell.
	public Cell prev;
	// Pointer to the cell to the left of this one.
	public Cell next;
	// Pointer to the cell to the right of this one.



//	public Cell(char thisContent) {
//		this.content = thisContent;
//	}





	/**
	 *

	by setting fields with default values, object constructors will possess those values unless otherwise described
	 the cells upon creation have a default character asignment of  ' ' a space.
	 In order to change the value of a cell the cell itself must have getters and setters which may be implemented by the Tape class
	 This is because the Tape class is meant to be a collection of Cells.
	 */

	public Cell(){
	}

//	public Cell(String direction) {
//		if (Objects.equals(direction, "right")){
//
//		}
//	}

//	public Cell(Tape cells, String right) {
//	}
//
//	public Cell moveCells(Cell oldCell, String direction) {
//		if (Objects.equals(direction, "left")) {
//			this.prev = oldCell.next;
//		}
//		else {
//			this.next = oldCell.prev;
//		}
//		return oldCell;
//	}
//
//	public Cell(char content, Cell next, Cell prev) {
//		this.content = content;
//		this.next = next;
//		this.prev = prev;
//	}
//
	public char getContent() {
		return this.content;
	}

	public void setContent(char content) {
		this.content = content;
	}

	public Cell getNext() {
		return this.next;
	}

	public void setNext(Cell next) {
		this.next = next;
	}

	public Cell getPrev() {
		return this.prev;
	}

	public void setPrev(Cell prev) {
		this.prev = prev;
	}
}