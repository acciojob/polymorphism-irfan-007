package com.driver;

public class Main {
  
  static class Product{
    public int product(int x, int y) {
      return x*y;
    }
    public int product(int x, int y, int z) {
      return x*y*z;
    }
    public double product(double x, double y) {
      return x*y;
    }
  }
  
  public static void main(String[] args){
    Product p=new Product();
    int x=2;
    int y=5;   
    System.out.println(p.product(x,y));
    int z=3;
    System.out.println(p.product(x,y,z));
    System.out.println(p.product((double)x,(double)y));
    
  }
  
}
