import java.util.*;
public class PuzzleJava{

    public int[] getTenRolls(){
        Random randMachine = new Random();
        
        int[] tenRolls = new int[10];
        for(int i=0; i<tenRolls.length; i++){
            tenRolls[i] = randMachine.nextInt(20)+1;
            System.out.println(tenRolls[i]);
        }
        return tenRolls;
    }


    public String getRandomLetter(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; 
        String[] alphaArray = alphabet.split("");
        Random randMachine = new Random();
        String randomLetter = alphaArray[randMachine.nextInt(25)];
        return randomLetter;


    }

    public String generatePassword(){
        String passWord = "";
        for(int i=0; i<8; i++){
            passWord+= getRandomLetter();
        }
        return passWord;
    } 

    public String[] getNewPasswordSet(int setNum){
        String[] set = new String[setNum];
        for(int i=0; i<setNum; i++){
            set[i] = generatePassword();
            System.out.println(set[i]);
        }
        return set;
    }
}