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
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String ultimateString = new String(ch);
        if(str.equals(ultimateString)) {
          System.out.print("YES");
        } else {
          System.out.print("NO");
        }
    }
}
