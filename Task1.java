/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pockocmoc.gb.exception.sem_two_homework;

import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
public class Task1 {

    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        boolean validInput = false;
        do {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();
            if (input.matches("^[-+]?\\d*\\.,?\\d+$")) {
                result = Float.parseFloat(input);
                validInput = true;
            } else {
                System.out.println("Неверный формат ввода! Попробуйте еще раз.");
            }
        } while (!validInput);
        return result;
    }

}
