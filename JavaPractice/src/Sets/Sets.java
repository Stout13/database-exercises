package Sets;

import org.w3c.dom.NodeList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import static java.lang.String.join;
import static java.util.List.*;


public class Sets {

    public static void main(String[] args) {
        String userInput = "[1, 2, 3] + [3, 5, 7]";
        setCalculator(userInput);
    }



    public static ArrayList<Character> setCalculator(String setOperation) {
        String cleanSet = setOperation.replaceAll(" ", "");
        String noBrackets = cleanSet.replaceAll("\\[", "");
        noBrackets = noBrackets.replaceAll("]", "");
        noBrackets = noBrackets.replaceAll(",", "");
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (char c : noBrackets.toCharArray()) {
            characterArrayList.add(c);
        }
        ArrayList<Character> first = null;
        ArrayList<Character> second = null;
        ArrayList<Character> newSet = null;
//        for (int r = 0; r < characterArrayList.size(); r++) {
//
//        }
        for (int i = 0; i < characterArrayList.size(); i++) {
            if (characterArrayList.get(i).equals('+')) {
                int plus = characterArrayList.indexOf('+');
                for (int j = 0; j < plus; j++) {
                    if (first == null) {
                        System.out.println(
                                "no nulls please"
                        );
                        setCalculator(setOperation);
                    }

                }
                for (int k = plus; k > 0; k--) {
                    if (second == null) {
                        System.out.println(
                                "no nulls please"
                        );
                        setCalculator(setOperation);
                    }
                    second.add(characterArrayList.get(k));
                }

                //A.addAll(B)
//        A.removeAll(B)
//        A.retainAll(B)
                for (char s : characterArrayList) {
                    if (first.contains(s)) {
                        newSet.add(s);
                    } else if (second.contains(s) && !first.contains(s)) {
                        newSet.add(s);
                    }
                }
            } else if (characterArrayList.get(i).equals('-')) {
                int plus = characterArrayList.indexOf('-');

                for (int m = 0; m < plus; m++) {
                    if (first == null) {
                        System.out.println(
                                "no nulls please"
                        );
                        setCalculator(setOperation);
                    }
                    first.add(characterArrayList.get(m));
                }
                for (int n = plus; n > 0; n--) {
                    if (second == null) {
                        System.out.println(
                                "no nulls please"
                        );
                        setCalculator(setOperation);
                    }
                    second.add(characterArrayList.get(n));
                }
                for (char t : characterArrayList) {
                    if (first.contains(t) && !first.contains(t)) {
                        newSet.add(t);
                    }
                }
            } else if (characterArrayList.get(i).equals('*')) {
                int plus = characterArrayList.indexOf('*');
                for (int p = 0; p < plus; p++) {
                    if (first == null) {
                        System.out.println(
                                "no nulls please"
                        );
                        setCalculator(setOperation);
                    }
                    first.add(characterArrayList.get(p));
                }
                for (int k = plus; k > 0; k--) {
                    if (second == null) {
                        System.out.println(
                                "no nulls please"
                        );
                        setCalculator(setOperation);
                    }
                    second.add(characterArrayList.get(k));
                }
                for (char u : characterArrayList) {
                    if (first.contains(u) && !first.contains(u)) {
                        newSet.add(u);
                    }
                }
            }
            else {
                System.out.println("please submit an set operation in the form [x,x,x] + [x,x,x,x]");
            }
        }
        return newSet;
    }
}

//    This is a non-grade exercise which should be posted to your learning journal.
//
//    In mathematics, several operations are defined on sets. The union of two sets A and B is a set that contains
//    all the elements that are in A together with all the elements that are in B. The intersection of A and B is the
//    set that contains elements that are in both A and B. The difference of A and B is the set that contains all the
//    elements of A except for those elements that are also in B.
//



//    Suppose that A and B are variables of type set in Java. The mathematical operations on A and B can be computed
//    using methods from the Set interface. In particular: A.addAll(B) computes the union of A and B; A.retainAll(B)
//    computes the intersection of A and B; and A.removeAll(B) computes the difference of A and B. (These operations
//    change the contents of the set A, while the mathematical operations create a new set without changing A, but that
//    difference is not relevant to this exercise.)
//
//    For this exercise, you should write a program that can be used as a "set calculator" for simple operations on sets
//    of non-negative integers. (Negative integers are not allowed.) A set of such integers will be represented as a
//    list of integers, separated by commas and, optionally, spaces and enclosed in square brackets. For example: [1,2,3]
//    or [17, 42, 9, 53,108]. The characters +, *, and - will be used for the union, intersection, and difference
//    operations. The user of the program will type in lines of input containing two sets, separated by an operator.
//    The program should perform the operation and print the resulting set. Here are some examples:
//
//    Input Output
//------------------------- -------------------
//        [1, 2, 3] + [3, 5, 7] [1, 2, 3, 5, 7]
//        [10,9,8,7] * [2,4,6,8] [8]
//        [ 5, 10, 15, 20 ] - [ 0, 10, 20 ] [5, 15]
//
//    To represent sets of non-negative integers, use sets of type TreeSet<Integer>. Read the user's input,
//    create two TreeSets, and use the appropriate TreeSet method to perform the requested operation on the two sets.
//    Your program should be able to read and process any number of lines of input. If a line contains a syntax error,
//    yourprogram should not crash. It should report the error and move on to the next line of input. (Note: To
//    print out a Set, A, of Integers, you can just say System.out.println(A).
//    Here, the syntax for sets to be the same as that used by the system for outputting a set.)
//}
