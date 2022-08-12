package JavaProject;


import java.util.ArrayList;
import java.util.Objects;

public class WordDetector {
        public static void main(String[] args) {
                String thisString = "This is a test";
                System.out.println(wordDetector(thisString));
        }
        public static Integer wordCount = 0;

        public static Integer wordDetector(String str) {

//                int spaces = str.split(" ").length-1;

//                for (String s : thisString) {
//                        if (Objects.equals(s, " ")) {
//                                wordCount++;
//                        }
                return str.split(" ").length-1;
//		countWords("Just an example here move along") ➞ 6

//countWords("This is a test") ➞ 4

//countWords("What an easy task, right") ➞ 5

        }
}