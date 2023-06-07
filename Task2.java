/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.gb.exception.sem_two_homework;

/* Если необходимо, исправьте данный код
   try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

 */
public class Task2 {

    public static void main(String[] args) {
        try {
            int[] intArray = new int[8];
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching array index out of bounds exception: " + e);
        }

    }
}
