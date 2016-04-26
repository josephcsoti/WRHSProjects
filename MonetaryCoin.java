/*
Design and implement a class called MonetaryCoin 
that is derived from the Coin class from Chapter 4.
 
Store a value in the monetary coin that represents its value 
and add a method that returns ts value. 

Create a main driver class to instantiate ten coins. 
Flip each coin and return the sum of the coins that show heads.
*/

class MonetaryCoin extends Coin {

   int val;
   int type;
   
   MonetaryCoin(int val) {

      setVal(val);  
   }

   public void setVal(int val) {
   
     this.val = val;
   }
   
   public int getVal() {
   
     return val;
   }
   
   

/*  store value when heads */

}