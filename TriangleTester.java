/*
 Using the files in the Inheritance QuickCode folder in the common drive, 
 create EquilateralTriangle and RightTriangle classes that are derived from the abstract Triangle class. 
 Provide an appropriate constructor for each of the classes and make them call the superclass's constructor. 
 Redefine the abstract methods appropriately in the derived classes. 
 Complete the declaration statements in the TriangleTester class. 
 Compile all classes and run the TriangleTester. Full Value if complete by 12:00
 */

public class TriangleTester
{
  public static void main(String[] args)
  {
    EquilateralTriangle equilateralTr = new EquilateralTriangle(15);
    RightTriangle rightTr = new RightTriangle(15, 20);
    System.out.println("Equilateral " + equilateralTr.getRatio());
    System.out.println("Right isosceles " + rightTr.getRatio());
  }
}