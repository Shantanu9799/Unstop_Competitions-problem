import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int totalCount = 0;
        for(int i=1; i<=num; i++) {
          totalCount += countSetBit(i);
        }
        System.out.print(totalCount);
    }
    public static int countSetBit(int i) {
      int cnt = 0;
      int mask = 1;
      while(i > 0) {
        if((i&mask) == 1) {
          cnt++;
        }
        i = i >> 1;
      }
      return cnt;
    }
}