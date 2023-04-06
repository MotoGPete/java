import java.util.*;

public class PuzzleJavaTest {
    public static void main(String[] args){
        
        PuzzleJava appTest = new PuzzleJava();

        System.out.println(appTest.getTenRolls());

        System.out.println("random letter is: " + appTest.getRandomLetter());

        System.out.println("Random 8 Letter Password: " + appTest.generatePassword());

        System.out.println("three word password set: "+ appTest.getNewPasswordSet(3));
        
        
    }
} 