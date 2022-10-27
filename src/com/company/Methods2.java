package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Methods2 {

    static boolean isPrime(int n) {
        boolean result = true;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                result = false;
        return result;
    }

    //Определить все множители числа (а не только простые)
    static int[] calcFactors(int n) {
        int[] result = new int[100];
        int index = 0;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                result[index++] = i;
        return result;
    }

    //В массиве содержатся строки и целые числа. Вернуть массив, из которого удалены все строки
    static Object[] deleteString(Object[] arr) {
        int count = 0;
        for (Object elem : arr)
            if (!Objects.isNull(elem) && !elem.getClass().equals(String.class))
                count++;
        Object[] result = new Object[count];
        int index = 0;
        for (Object elem : arr)
            if (!Objects.isNull(elem) && !elem.getClass().equals(String.class))
                result[index++] = elem;
        return result;
    }

    //количество гласных букв в строке
    static int countConsonants(String s) {
        int result = 0;
        String str = s.toLowerCase();
        char[] chars = {'a','i','o','u','e','y'};
        for (int i = 0; i < str.length(); i++){
            boolean flag = false;
            for (int j = 0; j < chars.length; j++)
            if (str.charAt(i) == chars[j])
                flag = true;
            if(flag)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        for (int elem : calcFactors(24))
            if (elem != 0)
                System.out.println(elem);
        Object[] arr = new Object[5];
        arr[0] = 1;
        arr[1] = "str";
        for (Object elem : arr)
            System.out.println(elem);
        System.out.println(Arrays.toString(deleteString(arr)));
        String s = "Java: How to check if object is null ";
        System.out.println(countConsonants(s));
    }
}
