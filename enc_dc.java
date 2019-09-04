import java.util.*;
import javax.swing.*;


public class enc_dc {

    public static String runManipulation(String word){
        int wordlength = word.length();

    String word1 = word.substring(0,wordlength/2);
    String word2 = word.substring((word.length()) /2, wordlength);

    System.out.println("Your word has been splitted to:" + " " + word1 + " " + "And" + " " + word2);

    char [] wordarray1 = word1.toCharArray();
    char[] wordarray1copy = word1.toCharArray();
    char [] wordarray2 = word2.toCharArray();

    System.out.println("FIRST WORD TRANSVERSED:" + " " + new String(wordarray1));
    System.out.println("FIRST WORD TRANSVERSED:" + " " + new String(wordarray2));

    for (int i = 0; i < word2.length(); i++) {
        if (i + 1 > word1.length() - 1 || i == word2.length()) break;
        if (i %2 == 0) wordarray1[i+1] = wordarray2[i];
    }

    for (int i = 0; i < word1.length(); i++) {
        if (i + 1 == wordarray1copy.length) break;
        if (i % 2 == 0) wordarray2[i] = wordarray1copy[i+1];
    }

      return new String(wordarray1) + new String(wordarray2);
    }

    public static void main (String []args){
        String word = "";
        Scanner input = new Scanner(System.in);
        // word = input.nextLine();


    System.out.println("THIS PROGRAM IS DESIGNED TO SPLIT WORDS,PRINT OUT THE REVERSE AND CONCATENATE THE REVERSED WORDS");

    while (word.length() < 10){
        word = JOptionPane.showInputDialog("Enter the string with a minimum of 10 characters in length: ");
        word = word.replaceAll(" ","");
        if (word.length() < 10) {
				JOptionPane.showMessageDialog(null, "Please try again with a string having 10 or more characters\n");
			}
    }
    // System.out.println("PLEASE INPUT YOUR TEXT:");
    input.close();



    // while(wordlength<=10){
    //     System.out.println("PLEASE NOTE THAT TEXT MUST BE MORE THAN TEN CHARACTERS");
    //     // word = input.nextLine();
    // }

    String encodedString = runManipulation(word);

    JOptionPane.showMessageDialog(null,"OUTPUT OF ENCODED WORDS " + " " + encodedString);

    String decodedString = runManipulation(encodedString);

    JOptionPane.showMessageDialog(null,"YOUR WORD HAS BEEN DECODED TO:" + " " + decodedString);
    System.out.println("Word decoding successfully");
    System.out.println("Thank you for using this program");
      }


}
