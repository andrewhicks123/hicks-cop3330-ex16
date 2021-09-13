/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is your age? " );
        int age = input.nextInt();
        if(age >= 16){
            System.out.println("You are old enough to legally drive.");
        }
        else{
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
