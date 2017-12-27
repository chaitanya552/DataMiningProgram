/*
 Programming Challenge Description:
Given two strings, write a program to determine the longest common subsequence between them. Each string can have a maximum length of 50 characters. Note, this subsequence need not be contiguous.

Input:
Your program should read lines of text from standard input. Ignore empty lines. Each non-empty line will contain two semicolon-seperated strings. You can assume that there is only one unique subsequence per line.

Output:
For each line of input, print to standard output the longest common subsequence. Ensure that there are no trailing spaces on each line you print.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class lcs {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
   // String line;
    String line = "";
    String s1="";
    String s2="";
    String cvsSplitBy = ";";
    String[] data = null;
    while ((line = in.readLine()) != null){
     
     data = line.split(";");
      s1= data[0];
   //   System.out.println(s1);
      s2= data[1];
     if (s1!=null){
    	 break;
     }
    }
   
    int m = s1.length();
    int n = s2.length();
    lcs(s1, s2, m, n);    
    // string 1 vs string 2
    //dynaic programming has to be used.. save values while you iterate
  }
  static void lcs(String X, String Y, int m, int n)
  {
      int[][] L = new int[m+1][n+1];

       
      for (int i=0; i<=m; i++)
      {
          for (int j=0; j<=n; j++)
          {
              if (i == 0 || j == 0)
                  L[i][j] = 0;
              else if (X.charAt(i-1) == Y.charAt(j-1))
                  L[i][j] = L[i-1][j-1] + 1;
              else
                  L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
          }
      }

      // Following code is used to print LCS
      int index = L[m][n];
      int temp = index;

      
      char[] lcs = new char[index+1];
      lcs[index] = '\0'; // Set the terminating character

      
      int i = m, j = n;
      while (i > 0 && j > 0)
      {
          // If current character in X[] and Y are same, then
          // current character is part of LCS
          if (X.charAt(i-1) == Y.charAt(j-1))
          {
              // Put current character in result
              lcs[index-1] = X.charAt(i-1); 
               
              // reduce values of i, j and index
              i--; 
              j--; 
              index--;     
          }

          // If not same, then find the larger of two and
          // go in the direction of larger value
          else if (L[i-1][j] > L[i][j-1])
              i--;
          else
              j--;
      }

      // Print the lcs
      System.out.print("LCS of "+X+" and "+Y+" is ");
      for(int k=0;k<=temp;k++)
          System.out.print(lcs[k]);
  }
}
