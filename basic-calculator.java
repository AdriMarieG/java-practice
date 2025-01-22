/*
The goal of this calculator is to practice java.
Author: AdriMarieG
Date: 8-14-2023
*/

public class Calculator{
  
  public Calculator(){
  }

//methods

    public int add(int a, int b){
      return(a + b);
    }

    public int subtract(int a, int b){
      if(a>b){
        return(a-b);
      } else return(b-a);
    
    }

    public int multiply(int a, int b){
      return(a * b);
    }

    public int divide(int a, int b){
      if(b!=0){
        return(a / b);
      } else return(0);
    }

    public int modulo(int a, int b){
      return(a % b);
    }

public static void main(String[] args){

  Calculator myCalculator = new Calculator();

    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    System.out.println(myCalculator.divide(24,0));


}
  }

