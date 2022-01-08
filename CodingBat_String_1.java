import java.util.*;
import java.awt.*;

public class CodingBat_String_1 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println (helloName ("Bob"));
      System.out.println (makeAbba("dog","cat"));
      System.out.println (makeTags("i","cat"));
      System.out.println (firstTwo("donkey"));
      System.out.println (firstHalf("HelloThere"));
      System.out.println (withoutEnd("Anthony"));
      System.out.println (comboString("bye","Toti"));
      System.out.println (nonStart("Hello","There"));
      System.out.println (left2("Hello"));
      System.out.println (right2("Hello")); 
      System.out.println (theEnd("Hello", false));
      System.out.println (withouEnd2("Toti"));
      System.out.println (middleTwo("string"));
      System.out.println (endsLy("oddly"));
      System.out.println (nTwice("chocolate", 2));
      System.out.println (twoChar("coder", 4));
      System.out.println (middleThree("donkeys"));
      System.out.println (hasBad("xbadxx"));
      System.out.println (atFirst("hello"));
      System.out.println (lastChars("yo","java")); 
      System.out.println (conCat("Hello","oThere"));
      System.out.println (lastTwo ("coding"));
      System.out.println (seeColor ("bluexx"));
      System.out.println (frontAgain ("edited"));
      System.out.println (minCat("Hello","java"));
      System.out.println (extraFront ("hello"));
      System.out.println (without2("donkeydo"));
      System.out.println (deFront ("obey"));
      System.out.println (startWord ("hippo","xip"));
      System.out.println (withoutX ("xobeyx"));
      System.out.println (withoutX2 ("hello"));   
   }      

   public static String helloName(String name) {
      return ("Hello " + name);
   }
   
   public static String makeAbba(String a, String b) {
      return (a+b+b+a);
   }
   
   public static String makeTags(String tag, String word) {
      return ("<"+tag+">" + word+"<"+"/"+tag+">");
   }
   
   public static String firstTwo(String str) {
      
      if (str.length()<2){
         return str;
      }
      
      else {
         return (str.substring(0,2));
      }
      
   }
   
   public static String firstHalf(String str) {
      return (str.substring(0,str.length()/2));
   }
   
   public static String withoutEnd(String str) {
      return (str.substring(1,str.length()-1));
   }
   
   public static String comboString(String a, String b) {
      
      if (a.length()<b.length()){
         return (a+b+a);
      }
      
      else if (a.length() > b.length()){
         return (b+a+b);
      }
      
      else {
         return (a+b);
      }
      
   }
   
   public static String nonStart(String a, String b) {
      return (a.substring(1) + b.substring(1,b.length())); //compairing execution with and without the length
      
   }
   
   public static String left2(String str) {
      return (str.substring(2, str.length()) + str.substring(0,2));
   }
   
   public static String right2(String str) {
      return (str.substring(str.length()-2) + str.substring(0,str.length()-2));
   }
   
   public static String theEnd(String str, boolean front) {
      
      if (front == true){
         return str.substring(0,1);
      }
      
      else {
         return (str.substring(str.length()-1));
      }
      
    }
    
    public static String withouEnd2(String str) {
      return (str.substring(1,str.length()-1));
      }
      
   public static String middleTwo(String str) {
      return (str.substring(str.length()/2-1, str.length()/2+1));
   }

   public static boolean endsLy(String str) {
      
      if (str.substring(str.length()-2).equals("ly")){
         return true;
      }
      
      else {
         return false;
      }
   }
   
   public static String nTwice(String str, int n) {
      return (str.substring(0,n) + str.substring(str.length()-n));
   }
   
   public static String twoChar(String str, int index) {
     
     if (str.length()-index >= 2){
      return (str.substring(index,index+2));
     }
     
     else{
      return (str.substring(0,2));
     }
  }
  
  public static String middleThree(String str) {
      return (str.substring((str.length()/2-1) , (str.length()/2+2)));
   }
   
   public static boolean hasBad(String str) {
      
      if (str.length()< 3){
         return false;
      }
      
      else if ((str.substring(0,3)).equals("bad")){
         return true;
      }
      
      else if ((str.substring(1,4)).equals("bad")){
         return true;
      }
       
      return false;
   }
   
   public static String atFirst(String str) {
      
      if (str.length()< 2){
         return str + "@";
      }
      
      else {
            return str.substring(0,2);
      }
   } 
   
   public static String lastChars(String a, String b) {
      if(a.length() == 0)
      a = "@";
      else if (b.length() == 0)
      b = "@";
      
      return a.substring(0,1) + b.substring(b.length()-1, b.length());
      } 
   
   
   public static String conCat(String a, String b) {
     
     if ((a.substring(a.length()-1).equals(b.substring(0,1)))){
      return (a.substring(0, a.length()-1) + b);
     }
     
     else{
      return (a + b);
     }
  }
  
  public static String lastTwo(String str) {
      return (str.substring(0,str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1));
   }
   
   public static String seeColor(String str) {
     
     if (str.substring(0,3).equals("red")){
       return (str.substring(0,3));
     }
     
     else if (str.substring(0,4).equals("blue")){
       return (str.substring(0,4));
     }
     
     else{
      return ("");
     }
   }
   
   public static boolean frontAgain(String str) {
     
     if (str.substring(0,2).equals(str.substring(str.length()-2))){
       return true;
     }
     else
      return false;
   } 
   
   public static String minCat(String a, String b) {
     
     if (a.length() > b.length()){
       return ((a.substring(a.length()-b.length())) + b);
     }
     else if (a.length() < b.length()){
      return (a + (b.substring(b.length()-a.length())));
      }
      else
         return (a + b);
   }
   
   public static String extraFront(String str) {
     
     if (str.length() <= 2){
       //return (str + str + str);
         String tempStr = "";
         for (int i=0;i<3;i++){
            tempStr+=str;
         }
         return tempStr;
     }
      else{
         return ((str.substring(0,2) + (str.substring(0,2) + (str.substring(0,2)))));
      }
   }
   
   public static String without2(String str) {
     
     if (str.substring(0,2).equals(str.substring(str.length()-2))){
       return (str.substring(2));
     }
      else
         return (str);
   }
   
   public static String deFront(String str) {
     
     if (str.substring(0,1).equals("a") && str.substring(1,2).equals("b")){
       return (str);
     }
     
     else if (str.substring(0,1).equals("a")){
      return ("a" + str.substring(2)); 
     }
     
     else if (str.substring(1,2).equals("b")){
      return ("b" + str.substring(2));
      }
      
      else
         return (str.substring(2));
   }
   
   public static String startWord(String str, String word) {
     
     if (word.substring(1,word.length()).equals (str.substring(1, word.length()))){
       return (str.substring(0,word.length()));
      }
      else
         return ("");
   }
   
   public static String withoutX(String str) {
     
     if (str.substring(0,1).equals("x") && str.substring(str.length()-1).equals("x")){
       return (str.substring(1,str.length()-1));
     }
     
     else if ((str.substring(str.length()-1).equals("x"))){
       return (str.substring(1,str.length()));
     }
     
     else if (str.substring(0,1).equals("x")) {
       return (str.substring(0,str.length()-1));
     }

     else{
       return (str);
     }
  }
  
  public static String withoutX2(String str) {
     
     if (str.substring(0,2).equals("xx")){
       return (str.substring(2,str.length()));
     }
     
     else if ((str.substring(0,1).equals("x"))){
       return (str.substring(1,str.length()));
     }
     
     else if (str.substring(1,2).equals("x")){
       return (str.substring(0,1) + str.substring(2,str.length()));
     }

     else{
       return (str);
     }
  }
  
}   