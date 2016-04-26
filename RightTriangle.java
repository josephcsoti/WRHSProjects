class RightTriangle extends Triangle {

   double hyp;

   public RightTriangle(double side, double hyp) {
   
      super(side);
      this.hyp = hyp;
   }
  
  public double getPerimeter(){
  
      return super.getSide() + super.getSide() + hyp;
  }
 
  public  double getArea(){
   
      return (super.getSide() + super.getSide()) / 2.0;
  }
  
}