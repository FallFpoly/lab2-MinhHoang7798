/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Nhap a = ");
        a = sc.nextDouble();

        System.out.println("Nhap b = ");
        b = sc.nextDouble();

        System.out.println("Nhap c = ");
        c = sc.nextDouble();

        // Xét a
        if (a == 0) {
            // Nếu a == 0 => giải phương trình bậc nhất: bx + c = 0
            if (b != 0) {
                double x = -c / b;
                System.out.println("Phuong trinh bac nhat co 1 nghiem: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
        } else {
            // Ngược lại (a != 0) → giải phương trình bậc hai
            // Tính delta
            double delta = b * b - 4 * a * c;

            // Biện luận theo delta
            if (delta < 0) {
                // Delta < 0: vô nghiệm
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                // Delta = 0: nghiệm kép x = -b / (2*a)
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                // Delta > 0: 2 nghiệm phân biệt
                // X1 = (-b + căn(delta)) / (2*a)
                // X2 = (-b - căn(delta)) / (2*a)
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
