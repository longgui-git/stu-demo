package com.example.demo.huawei;

import java.util.Scanner;

public class ZhiYinZi {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLong()) {
            String result = getResult(scanner.nextLong());
            System.out.println(result);
        }



    }

    public static String getResult(long ulDataInput){

        if (ulDataInput < 2) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int data = 2;
        while (data <= ulDataInput) {
            if (ulDataInput % data == 0) {
                ulDataInput = ulDataInput / data;
                result.append(data).append(" ");
            }else {
                data++;
            }
        }

        return result.toString();
    }




}
