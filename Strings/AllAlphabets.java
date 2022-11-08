// Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
// Input:
// S = Bawds jog, flick quartz, vex nymph//Abc
// Output: 1
// Explantion: In the given input, there
// are all the letters of the English
// alphabet. Hence, the output is 1.
public class AllAlphabets
{
  static int allAlphabetsPresentOrNot (String str)
  {
    char[] arr = new char[26];
    int pos = -1;
    for (int i = 0; i < str.length (); i++)
      {
    	char ch = str.charAt(i);
    	
    	if (ch - 65 < 26 && ch - 65 >= 0)
    	  {
    	    pos = ch - 65;
    	    arr[pos]=ch;
    	  }
    	else if (ch - 97 < 26 &&  ch - 97 >= 0)
    	  {
    	    pos = ch - 97;
    	    arr[pos]=ch;
    	  }
    	else
    	  {
    	    continue;
    	  }
    
      }
    int n = 1;
    for(int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
    for (int i = 0; i < 26; i++)
      {
	if (arr[i] == 0)
	  n=0;
}
return n;
}
  public static void main (String[]args)
  {

    System.out.println(allAlphabetsPresentOrNot("Bwds jog, flick quartz, vex nymphb"));

  }
}
