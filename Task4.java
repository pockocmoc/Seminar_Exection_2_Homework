/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.gb.exception.sem_two_homework;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {

    public static boolean isNotBlank(String str) {
        return str != null && !str.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        boolean notNull = isNotBlank(input);
        if (!notNull) {
            System.out.println("Нельзя вводить пустые строки или строки, состоящие только из пробелов!");
            return;
        }

        System.out.println("Вы ввели: " + input);
    }

}
