package com;
import com.pkg.Math;
import com.pkg.Math2;

public class mathFunc implements Math, Math2{
  public mathFunc(){
    System.out.println("Package inside /com Directory");
  }
  public void add(int a, int b){
    System.out.printf("\n%d + %d = %d",a,b,a+b);
  }
  public void sub(int a, int b){
    System.out.printf("\n%d - %d = %d",a,b,a-b);
  }
  public void mul(int a, int b){
    System.out.printf("\n%d * %d = %d",a,b,a*b);
  }
  public void div(int a, int b){
    System.out.printf("\n%d / %d = %d",a,b,a/b);
  }
  public void rem(int a, int b){
    System.out.printf("\n%d rem %d = %d",a,b,a%b);
  }
  public void sq(int a){
    System.out.printf("\n%d * %d = %d",a,a,a*a);
  }

}