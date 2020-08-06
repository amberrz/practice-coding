import java.lang.reflect.Array;
import java.util.Arrays;

public class Kata {

  public static String reverseWords(final String original) {
    //Write code her

//  create new string array named backWords
//  fill backWordswith the individual words from the sting "original"

    String[] backWords = original.split(" ");

//  create an empty String

    String reverse = "";
    // creat a for loop to iterate (go thru)  backwords
    for (int i = 0; i < backWords.length; i++) {
      //stores the word at element i
      String word = backWords[i];
      // this string will hold the word once its been reversed
      String reverseWord = "";
      //creat a for loop that reverses word
      for (int j = word.length() - 1; j >= 0; j--) {
        // the litters at element j are stored here until the whole word is reversed
        reverseWord = reverseWord + word.charAt(j);

      }
      // creats the compliet sentence with reversed words
      reverse = reverse + reverseWord + " ";

    }
    // returns the revers sentence
    return reverse;
  }

//  Anagram Program In Java With Code And Example
//  Ad by Valueimpression
//    In this post, we will write java programs to check whether two strings are anagram or not. We will discuss 5 different methods to check for anagram strings. Before moving ahead with Anagram program in java , first we need to know what does anagram mean?
//    What is Anagram ?
//    If two strings contain same set of characters but in different order then the two strings are called anagrams.
//    for example :
//    1. "now" and "own"
//    2. "ton" and "not"
//    3. "fiber" and "brief"

  public static boolean isAnagram(String first, String second) {
    //check letter
    first = first.replaceAll("\\s", "").toLowerCase();
    second = second.replaceAll("\\s", "").toLowerCase();
    //check length
    if (first.length() != second.length()){
      return false;
    }
    //turn Strings into Char Arrays ant than sort both to see if equal
    char[] firstArray = first.toCharArray();
    char[] secondArray = second.toCharArray();
    Arrays.sort(firstArray);
    Arrays.sort(secondArray);
    return Arrays.equals(firstArray, secondArray);
  }

//  Using Integer ParseInt() Method : Code With Example
//  Ad by Valueimpression
//  We want to manually convert string to int without using parseInt() built in method . So let us understand the question first .
//  As integer can be positive and negative , Here two case arises
//  Case 1 :   If string is positive
//  If user inputs   "12345"  ,then      it should give output   12345  as an int number
//  Case 2 : If string is negative
//  If user inputs   "-12345"  ,then     it should give output  -12345 as an int number




  public static int stringToint( String str ){

    // create variable for int i
    int i = 0;
    int number = 0;
    boolean negative = false;
    int length = str.length();
    if (str.charAt(0) == '-'){
      negative = true;
      i = 1;
    }
    while (i < length) {
      number = number * 10;
      number = number + str.charAt(i++) - '0';
    }
    if (negative) {
      number = - number;
    }
    return number;

  }
















}





