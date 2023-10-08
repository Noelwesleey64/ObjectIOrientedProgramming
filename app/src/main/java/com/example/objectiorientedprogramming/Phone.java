package com.example.objectiorientedprogramming;

public class Phone {
     private String name;
     private int screenSize;
     int memoryRam;
     private int camera;


     public void playMusic (String trackName){
          System.out.println("playing " + trackName);


     }

     //method to set the name since the name variable is private
     public void setName (String name){
          this.name = name;
     }


     //method to access the name from outside
     public String getName(){
          return this.name;
     }

     //getter method for getting the camera of the object
     public int getCamera() {
          return this.camera;
     }


     //setter method for setting the camera of the object
     public void setCamera(int camera) {
          this.camera = camera;
     }

     //Getter method for screen size
     public int getScreenSize() {
          return screenSize;
     }

     //Setter method for Screen Size
     public void setScreenSize(int screenSize) {
          this.screenSize = screenSize;
     }
}
