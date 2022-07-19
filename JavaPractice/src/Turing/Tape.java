package Turing;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Objects;

/** Tape class is a doubly linked ArrayList of Cells which contain a next and previous pointer


 */
//public class Tape {
//
////    Tape thisTape = new Tape(null, null) {
////    };
//
//    //    public ArrayList<Cell> newTape() {
////        return new ArrayList<>();
////    }
////    private Cell tail;
//    public Cell temp;
//    public Cell currentCell;
////    private Cell prev = this.prev;
//
//
//    public Tape() {
//        this.currentCell = new Cell();
////        LinkedList<Cell> thisTape = new LinkedList<Cell>(new Cell());
//    }
//
//
//
//    /**
//     * A head is required in any doubly linked list which the prev pointer is null
//     * a tail is also required which the next is null.
//     * These null values help to determine which end of the list the currentCell is
//     *
//     *
//     */
//
//
//
////    public Tape(LinkedList<Cell> oldTape) throws NullPointerException {
////
////    }
//    public Cell getCurrentCell() throws NullPointerException {
//        return this.currentCell;
//    }
//    public String getTapeContents() throws NullPointerException, IllegalStateException{
//        temp = this.getCurrentCell();
////        System.out.println(currentCell.content);
//        if (currentCell == null) {
////            Tape tape = new Tape();
//            return "";
//        }
//        StringBuilder contents = new StringBuilder("");
//
//        while(currentCell.prev != null) {
//            this.moveLeft();
//        }
//        if (currentCell.content == ' ') {
//            return " ";
//        } else if (currentCell.next == null) {
//            return Character.toString(currentCell.content);
//        } else {
//            do {
////                System.out.println(currentCell.content);
//                contents.append(currentCell.content);
//                this.moveRight();
//            } while (currentCell.next != null);
//        }
//        currentCell = temp;
//        return contents.toString();
//    }
//
//    public void moveRight() throws NullPointerException, IllegalStateException {
////        Cell newCell = new Cell();
////        Cell temp = this.getCurrentCell();
//        if (currentCell.next == null) {
//            currentCell.next = new Cell();
//        }
//        this.currentCell = this.getCurrentCell().next;
//    }
//
//    public void moveLeft() throws NullPointerException, IllegalStateException {
////        Cell temp = currentCell;
//        if (currentCell.prev == null) {
//            currentCell.prev = new Cell();
//        }
//        this.currentCell = this.getCurrentCell().prev;
//    }
//
////        LinkedList<Character> cellContent = new LinkedList<>();
//
////        do {
////            cellContent.add(this.content);
////            moveRight();
////        } while (next != null);
////        return String.valueOf(cellContent);
////    }
//
////    public Tape(Cell next, Cell prev) {
////        this.next = next;
////        this.prev = prev;
////    }
//
////    public String getTapeContents() throws NullPointerException{
////
////        cellContent = this;
////        while (this.prev != null) {
////            moveLeft();
////        }
////        do {
////            cellContent.add(this.content);
////            moveRight();
////        } while (next != null);
////        return String.valueOf(cellContent);
////    }
////            for (char current:
////                 ) {
////
////            }
////            return tape.get(0).content;
////            for (Cell cell: tape) {
////                currentCell = tape.
////            }
//
//
////    public void moveRight() throws NullPointerException {
////        }
////        if (this.next == null) {
////            Cell newCell = new Cell(this, "right");
////        }
////        else {
////            this.prev = this.next;
////            this.next = new Cell();
////        }
//
//
////    public void moveLeft(){
////        if (this.prev == head) {
////            for (Cell cell: this) this.next = this.prev;
////        } else {
////
//////            this.prev = new Cell(this);
////        }
//
//
//
//
//    public char getContent() throws NullPointerException {
//        try {
//            return this.currentCell.getContent();
//        }
//        catch (Exception e){
//            return ' ';
//        }
//    }
//
//    public void setContent(char c) throws NullPointerException{
//        if (currentCell == null) {
//            this.currentCell = new Cell();
//        }
//        else {
//            this.currentCell.setContent(c);
//        }
//    }
//}
////            this.prev = new Cell(this);
//
////    @Override
////    public char getContent() {
////        return this.content;
////    }
//
////    public void setContent(char ch) throws NullPointerException {
////        this.content = ch;
////    }
//
//
//
//    //    Your task is to write a class named Tape to represent Turing machine tapes.
////    The class should have an instance variable of type Cell that points to the current cell.
////    To be compatible with the classes that will use the Tape class, your class must include the following methods:
////
////    public Cell getCurrentCell() -- returns the pointer that points to the current cell.
////
////    public char getContent() -- returns the char from the current cell.
////
////    public void setContent(char ch) -- changes the char in the current cell to the specified value.
////
////    public void moveLeft() -- moves the current cell one position to the left along the tape.
////    Note that if the current cell is the leftmost cell that exists, then a new cell must be created and
////    added to the tape at the left of the current cell, and then the current cell pointer can be moved to
////    point to the new cell. The content of the new cell should be a blank space. (Remember that the Turing
////    machine's tape is conceptually infinite, so your linked list must be prepared to expand on-demand when the
////    machine wants to move past the current end of the list.)
////
////    public void moveRight() -- moves the current cell one position to the right along the tape.
////    Note that if the current cell is the rightmost cell that exists, then a new cell must be created and
////    added to the tape at the right of the current cell, and then the current cell pointer can be moved to
////    point to the new cell. The content of the new cell should be a blank space.
////    public String getTapeContents() -- returns a String consisting of the chars from all the cells on the tape,
////    read from left to right, except that leading or trailing blank characters should be discarded. T
////    he current cell pointer should not be moved by this method; it should point to the same cell after the method is
////    called as it did before. You can create a different pointer to move along the tape and get the full contents.
////    (This method is the hardest one to implement.)
////    It is also useful to have a constructor that creates a tape that initially consists of a single cell.
////    The cell should contain a blank space, and the current cell pointer should point to it. (The alternative --
////    letting the current cell pointer be null to represent a completely blank tape -- makes all the methods in the
////    class more difficult to implement.)
////
////    To test your Tape class, you can run the programs that are defined by the files TestTape.java, TestTapeGUI.java,
////    and TestTuringMachine.java. The first two programs just do things with a tape, to test whether it is
////    functioning properly. TestTuringMachine actually creates and runs several Turing machines, using your
////    Tape class to represent the machines' tapes.

//    =================================

//public class Tape {
//    private Cell currentCell = new Cell();
//    /*
//     * The constructor initialize the value of currentCell
//     */
//    public Tape() {
//        currentCell.content = ' ';
//    }
//    public Cell getCurrentCell() {
//        return currentCell;
//    }
//    public char getContent() {
//        return currentCell.content;
//    }
//    public void setContent(char ch) {
//        currentCell.content = ch;
//    }
//    public void moveLeft() {
//        if (currentCell.prev == null) {
//            Cell newCell = new Cell();
//            newCell.next = currentCell;
//            newCell.content = ' ';
//            currentCell.prev = newCell;
//        }
//        currentCell = currentCell.prev;
//    }
//    public void moveRight() {
//        if (currentCell.next == null) {
//            Cell newCell = new Cell();
//            newCell.prev = currentCell;
//            newCell.content = ' ';
//            currentCell.next = newCell;
//        }
//        currentCell = currentCell.next;
//    }
//    public String getTapeContents() {
//        String tapeContent = "";
//        Cell traverseCell = currentCell;
//        /*
//         * Go to the left until a null is found
//         */
//        while (traverseCell.prev != null) {
//            traverseCell = traverseCell.prev;
//        }
//        /*
//         * Beginning the Traverse across the Tape
//         */
//        while (traverseCell.next != null) {
//            /*if (traverseCell.item != ' ') {*/
//            tapeContent = tapeContent + traverseCell.content;
//            /*}*/
//            traverseCell = traverseCell.next;
//        }
//        return tapeContent;
//    }
//===========
//    public class Tape {
//
//    private Cell currentCell; // Current cell pointer
//
//    public Tape() { //Constructor to create a blank tape with a single cell, which contains a blank space.
//        Cell newCell = new Cell();
//        newCell.content = ' ';
//        newCell.prev = null;
//        newCell.next = null;
//        currentCell = newCell;
//    }
//
//    public Cell getCurrentCell() { //The pointer to current cell.
//        return currentCell;
//    }
//
//    public char getContent() { //The content of current cell.
//        return currentCell.content;
//    }
//
//    public void setContent(char ch) { //ch The character to be set into the current cell. currentCell.content = ch;
//    }
//
//    public void moveLeft() { //Moves the current cell one position to the left along the tape.
//        if (currentCell.prev == null) {
//            Cell newCell = new Cell();
//            newCell.content = ' ';
//            newCell.prev = null;
//            newCell.next = currentCell;
//            currentCell.prev = newCell;
//        }
//        currentCell = currentCell.prev;
//    }
//
//    public void moveRight() { //Moves the current cell one position to the right along the tape.
//
//        if (currentCell.next == null) {
//            Cell newCell = new Cell();
//            newCell.content = ' ';
//            newCell.next = null;
//            newCell.prev = currentCell;
//            currentCell.next = newCell;
//        }
//        currentCell = currentCell.next;
//    }
//
//    public String getTapeContents() { //Returns a String consisting of the chars from all the cells on the tape.
//        Cell pointer = currentCell;
//        while (pointer.prev != null)
//            pointer = pointer.prev;
//        String strContent = "";
//        while (pointer != null) {
//            strContent += pointer.content;
//            pointer = pointer.next;
//
//        }
//        return strContent;
//    }
//}

public class Tape {
    private Cell currentCell; // Current cell pointer
    public Tape() { //Constructor to create a blank tape with a single cell, which contains a blank space.
        Cell newCell = new Cell();
        newCell.content = ' ';
        newCell.prev = null;
        newCell.next = null;
        currentCell = newCell;
    }
    public Cell getCurrentCell() { //The pointer to current cell.
        return currentCell;
    }
    public char getContent() { //The content of current cell.
        return currentCell.content;
    }
    public void setContent(char ch) { //ch The character to be set into the current cell.
        currentCell.content = ch;
    }
    public void moveLeft() { //Moves the current cell one position to the left along the tape.
        if (currentCell.prev == null) {
            Cell newCell = new Cell();
            newCell.content = ' ';
            newCell.prev = null;
            newCell.next = currentCell;
            currentCell.prev = newCell;
        }
        currentCell = currentCell.prev;
    }
    public void moveRight() { //Moves the current cell one position to the right along the tape.
        if (currentCell.next == null) {
            Cell newCell = new Cell();
            newCell.content = ' ';
            newCell.next = null;
            newCell.prev = currentCell;
            currentCell.next = newCell;
        }
        currentCell = currentCell.next;
    }
    public String getTapeContents() { //Returns a String consisting of the chars from all the cells on the tape.
        Cell pointer = currentCell;
        while (pointer.prev != null)
            pointer = pointer.prev;
        String strContent = "";
        while (pointer != null) {
            strContent += pointer.content;
            pointer = pointer.next;
        }
        strContent = strContent.trim(); //Returns a copy of the string, with leading and trailing whitespace omitted.
        return strContent;
    }

}
