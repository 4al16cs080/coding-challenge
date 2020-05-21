import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int i;
String str;
int count[] = new int[256];
Scanner s = new Scanner(System.in);
System.out.print("Enter a String : ");
str=s.nextLine();
for (i = 0; i < str.length(); i++) {
count[(int) str.charAt(i)]++;
}
for (i = 0; i < 256; i++) {
if (count[i] != 0) {
System.out.println( (char) i + " : " + count[i]);
}

package shortestpalindromeexample.java;
import java.util.Scanner;

public class ShortestPalindromeDemo {

public static String shortestPalindrome(String str) {

int x=0;
int y=str.length()-1;

while(y>=0){
if(str.charAt(x)==str.charAt(y)){
x++;
}
y--;
}

if(x==str.length())
return str;

String suffix = str.substring(x);
String prefix = new StringBuilder(suffix).reverse().toString();
String mid = shortestPalindrome(str.substring(0, x));

return prefix+mid+suffix;
}
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter a String to find out shortest palindrome");
String str=in.nextLine();
System.out.println("Shortest palindrome of "+str+" is "+shortestPalindrome(str));
}
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int i;
String str;

    int count[] = new int[256];
    Scanner s = new Scanner(System.in);
   
    System.out.print("Enter a String : ");
    str=s.nextLine();
   
     for (i = 0; i < str.length(); i++) {
        count[(int) str.charAt(i)]++;
    }
    for (i = 0; i < 256; i++) {
        if (count[i] != 0) {
              System.out.println( (char) i  + " : " + count[i]);
        }
    }
}
}
