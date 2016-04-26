class EquilateralTriangle extends Triangle {

   public EquilateralTriangle(double side) {
   
      super(side);
   }
  
  public double getPerimeter(){
  
      return super.getSide() * 3.0;
  }

  public  double getArea(){
   
      return (Math.sqrt(3) / 4.0) * Math.pow(super.getSide(), 2);
  }

}