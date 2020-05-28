package ru.stqa.pft.sandbox;

public class MyFirstProgram {

 public static void main(String[] args) {
  hello ("world");
  hello ("user");
  hello ("Mariya");

  Square s = new Square(5);


  System.out.println(" Площадь " + s.l + " = " + s.area());
 Regtangle r = new Regtangle (5,7);


  System.out.println(" Площадь " + r.a + " и " + r.b + " = " + r.area());

 }
   public static void hello (String somebody) {
    System.out.println("Hello," + somebody + "!");
   }




}