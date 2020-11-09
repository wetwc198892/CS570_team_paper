package com.mycompany.app;

public class StringToInt 
{
  public static String add(int firstNumber, int secondNumber) {
    try{
      return "" + firstNumber + secondNumber;
    }catch(Exception e){
      return "";
    }
  }

  public static void main( String[] args )
  {
    System.out.println(StringToInt.add(3, 3)); 
  }
}