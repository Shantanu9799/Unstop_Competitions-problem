import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);
        int i;
        for(i=str.length()-1; i>=0; i--) {
          if(str.charAt(i) == ch) {
            break;
          }
        }
        String rev = str.substring(i);
        rev = revString(rev);
        str = str.substring(0, i)+rev;
        System.out.println(str);
    }
    public static String revString(String str) {
      String newStr = "";
      for(int i=str.length()-1; i>=0; i--) {
        newStr += str.charAt(i);
      }
      return newStr;
    }
}