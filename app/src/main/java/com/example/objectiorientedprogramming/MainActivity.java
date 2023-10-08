package com.example.objectiorientedprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Construct a new Phone object and name ot Iphone
    Phone iPhone = new Phone();

    //using a constructor to create an instance of the laptop object called mac Book
    Laptop macBook = new Laptop("Mac Book", 12, 16, 512);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the name of the iPhone object using the setter
        iPhone.setName("iPhone 11");
        iPhone.setCamera(10);
        iPhone.setScreenSize(6);

        //Call play music method
        iPhone.playMusic("Thank God");

        //call play music method
        iPhone.playMusic("God's Country");

        //Print the Iphone Object Name, by getting the value of the getter
        System.out.println(iPhone.getName());

        //Print the Iphone Camera using Getter
        System.out.println(iPhone.getCamera());

        //Printing the Iphone screen Size using Getter
        System.out.println(iPhone.getScreenSize());

        //Printing the Name, Screensize, Ram and disk memory of the laptop
        System.out.println("Laptop Name is " + macBook.name);
        System.out.println("Screen Size is  " + macBook.screenSize);
        System.out.println("Ram Memory is " + macBook.ramMemory);
        System.out.println("Disk Memory is " + macBook.diskMemory);
    }
}