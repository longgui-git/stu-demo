package com.example.demo.huawei;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * •计算一个数字的立方根，不使用库函数
 *
 * 详细描述：
 *
 * •接口说明
 *
 * 原型：
 *
 * public static double getCubeRoot(double input)
 *
 * 输入:double 待求解参数
 *
 * 返回值:double  输入参数的立方根，保留一位小数
 *
 * 输入描述:
 * 待求解参数 double类型
 *
 * 输出描述:
 * 输入参数的立方根 也是double类型
 */
public class LiFangGen {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
//        double cbrt = Math.cbrt(v);
        double cbrt = get4Root(v);

        System.out.println(cbrt);
        DecimalFormat decimalFormat = new DecimalFormat("#.0");

        System.out.println(decimalFormat.format(cbrt));


    }


    public static double getCubeRoot(double input) {
        /*在这里实现功能*/
        if (input == 0) {
            return 0;
        }

        double x0 = input;
        double x1 = (2 * x0 + input / x0 / x0)/3;
        while (Math.abs(x0 - x1) > 0.01) {
            x0 = x1;
            x1 = (2 * x0 + input / x0 / x0)/3;
        }

        return x1;
    }

    public static double get4Root(double input) {
        /*在这里实现功能*/
        if (input == 0) {
            return 0;
        }

        double x0 = input;
        double x1 = (3 * x0 + input / x0 / x0 /x0)/4;
        while (Math.abs(x0 - x1) > 0.01) {
            x0 = x1;
            x1 = (3 * x0 + input / x0 / x0 / x0)/4;
        }

        return x1;
    }


}
