import java.util.Scanner;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List


class Steganography extends Picture {

   Steganography(){
   
   }
   
   Pixel[][] pic2dArray;
   
   Pixel[][] pic2dredArray;
   Pixel[][] pic2dgreenArray;
   Pixel[][] pic2dblueArray;
   
   Pixel[][] pic2drgbArray;
   
   
   Picture redpic;
   Picture greenpic;
   Picture bluepic;
   Picture rgbpic;
   
   
   
   public static void main(String[] args){
   
      Steganography run = new Steganography();
      
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Picture Hider 2.0");
      System.out.println("---");
      
      while(true){
         System.out.println("1) Encode");
         System.out.println("2) Decode");
      
         System.out.print("> ");
      
         int c = scan.nextInt();
      
         if(c == 1){
         
            run.encode();
         }
         
            
         if(c == 2){
         
            run.decode();
         }
      
      }
   
   }

   public void encode(){
   
      Picture pic = new Picture("rawimage.jpg");
      
      Scanner scan2 = new Scanner(System.in);
         
      System.out.println("1) B/W");
      System.out.println("2) RGB");
      
      System.out.print("> ");
      
      int c2 = scan2.nextInt();
      
      if(c2 == 1){
         redpic = new Picture("redpic.jpg");
         greenpic = new Picture("greenpic.png");
         bluepic = new Picture("bluepic.jpg");
      
         pic2dArray      = pic.getPixels2D();
      
         pic2dredArray   = redpic.getPixels2D();
         pic2dgreenArray = greenpic.getPixels2D();
         pic2dblueArray  = bluepic.getPixels2D();
      
      //All channels set to even
         for(Pixel[] pixel2d : pic2dArray){
         
            for(Pixel pixel: pixel2d){
            
               int redPixel = pixel.getRed();
               int greenPixel = pixel.getGreen();
               int bluePixel = pixel.getBlue();
            
            //odd
               if(redPixel % 2 == 1){
               
                  pixel.setRed(redPixel - 1);
               }
               if(greenPixel % 2 == 1){
               
                  pixel.setGreen(greenPixel - 1);
               }
               if(bluePixel % 2 == 1){
               
                  pixel.setBlue(bluePixel - 1);
               }
            } 
         }
            
      }
         
      if(c2 == 2){
      
         rgbpic = new Picture("rgbpic.jpg");
         rgbpic.explore();
         pic2drgbArray = rgbpic.getPixels2D();
         
         //All channels set to even
         for(Pixel[] pixel2d : pic2drgbArray){
         
            for(Pixel pixel: pixel2d){
            
               int redPixel = pixel.getRed();
               int greenPixel = pixel.getGreen();
               int bluePixel = pixel.getBlue();
            
            //odd
               if(redPixel % 2 == 1){
               
                  pixel.setRed(redPixel - 1);
               }
               if(greenPixel % 2 == 1){
               
                  pixel.setGreen(greenPixel - 1);
               }
               if(bluePixel % 2 == 1){
               
                  pixel.setBlue(bluePixel - 1);
               }
            } 
         }
      }
      
   
   
   }
   
   public void decode(){
   
      Scanner scan3 = new Scanner(System.in);

      System.out.println("1) Red Chanel");
      System.out.println("2) Green Channel");
      System.out.println("3) Blue Channel");
      System.out.println("4) All Channels (RGB)");
      
      System.out.print("> ");
      
      int c3 = scan3.nextInt();
      
      if(c3 == 1){
      //decode Red
      //get width
         int rwidth = pic2dredArray[0].length;
      
         for (int row = 0; row < pic2dredArray.length; row++)
         {
            for (int col = 0; col < rwidth ; col++)
            {
               if (pic2dredArray[row][col].getRed() < 128)
               {
                  pic2dredArray[row][col].setRed(0);
                  pic2dredArray[row][col].setBlue(0);
                  pic2dredArray[row][col].setGreen(0);
               }
               else
               {
                  pic2dredArray[row][col].setRed(255);
                  pic2dredArray[row][col].setBlue(255);
                  pic2dredArray[row][col].setGreen(255);
               }
            }
         }
         redpic.explore();
      }
      
      if(c3 == 2) {
      //decode Green
      //get width
         int gwidth = pic2dgreenArray[0].length;
      
         for (int row = 0; row < pic2dgreenArray.length; row++)
         {
            for (int col = 0; col < gwidth ; col++)
            {
               if (pic2dgreenArray[row][col].getGreen() < 128)
               {
                  pic2dgreenArray[row][col].setRed(0);
                  pic2dgreenArray[row][col].setBlue(0);
                  pic2dgreenArray[row][col].setGreen(0);
               }
               else
               {
                  pic2dgreenArray[row][col].setRed(255);
                  pic2dgreenArray[row][col].setBlue(255);
                  pic2dgreenArray[row][col].setGreen(255);
               }
            }
         }
         
         greenpic.explore();
      }
      
      if(c3 == 3){
      //decode blue
      //get width
         int bwidth = pic2dblueArray[0].length;
      
         for (int row = 0; row < pic2dblueArray.length; row++)
         {
            for (int col = 0; col < bwidth ; col++)
            {
               if (pic2dblueArray[row][col].getBlue() < 128)
               {
                  pic2dblueArray[row][col].setRed(0);
                  pic2dblueArray[row][col].setBlue(0);
                  pic2dblueArray[row][col].setGreen(0);
               }
               else
               {
                  pic2dblueArray[row][col].setRed(255);
                  pic2dblueArray[row][col].setBlue(255);
                  pic2dblueArray[row][col].setGreen(255);
               }
            }
         }
         
         bluepic.explore();
      }
      
      if(c3 == 4) {
      //decode rgb
      
         int rgbwidth = pic2drgbArray[0].length;
         
         for (int row = 0; row < pic2drgbArray.length; row++)
         {
            for (int col = 0; col < rgbwidth ; col++)
            {
               if (pic2drgbArray[row][col].getRed() > pic2drgbArray[row][col].getGreen() && pic2drgbArray[row][col].getRed() > pic2drgbArray[row][col].getBlue())
               {
                  pic2drgbArray[row][col].setRed(255);
                  pic2drgbArray[row][col].setGreen(0);
                  pic2drgbArray[row][col].setBlue(0);
               }
               
               if (pic2drgbArray[row][col].getGreen() > pic2drgbArray[row][col].getRed() && pic2drgbArray[row][col].getGreen() > pic2drgbArray[row][col].getBlue())
               {
                  pic2drgbArray[row][col].setRed(0);
                  pic2drgbArray[row][col].setGreen(255);
                  pic2drgbArray[row][col].setBlue(0);
               }
               
               if (pic2drgbArray[row][col].getBlue() > pic2drgbArray[row][col].getGreen() && pic2drgbArray[row][col].getBlue() > pic2drgbArray[row][col].getRed())
               {
                  pic2drgbArray[row][col].setRed(0);
                  pic2drgbArray[row][col].setGreen(0);
                  pic2drgbArray[row][col].setBlue(255);
               }
            }
         }
         
         rgbpic.explore();
      }
   
   }

}