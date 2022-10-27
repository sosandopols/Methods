package com.company;
//Вычислить площадь треугольника
//Даны цифры числа, получить само число
//Дан текстовый файл, получить первую строку в нем
//Дана строка, найти порядковые номера букв, входящих в нее
public class Methods1 {
    //Вывести слово 'hello'
    static void hello(){
        System.out.println("hello");
    }

//Вывести имя пользователя
    static void printName(String name){
        System.out.println(name);
    }

//Вычислить площадь круга
    static double calcArea(double r){
        return Math.PI*r*r;
    }

//Вычислить факториал числа
    static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    //Дано: номер дня недели. Найти: название дня недели
    static String getDayOfWeek(int n){
        return null;
    }

//Дано: номер дня недели. Напечатать название дня недели
    static void printDayOfWeek(int n){

    }

//Определить, является ли число нечетным
    static boolean isOddNumber (int n){
        return n % 2 == 1 ? true : false;
    }

//Определить, больше ли первое число второго
    static boolean isFirstBigger (int a, int b){
        return false;
    }

//Определить максимальное из двух чисел
    static int max (int a, int b){
        return Math.max(a, b);
    }

//Проверить правильность написания e-mail
    static boolean isEmailCorrect (String email){
        return false;
    }

    //Перегрузка методов (overloading)
    /*public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }*/

    public static String sum(String s1,String s2){
        return s1+s2;
    }

    public  static <T extends Number> double sum(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

    //Array
    public static int sum(int... args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }

    public static int sumArr(int[] args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }

    public static void main(String[] args) {
        hello();
        printName("Yaroslav");
        System.out.println(calcArea(6));
        System.out.println(factorial(3));
        System.out.println(isOddNumber(3));
        System.out.println(max(5, 6));
        System.out.println(sum("Yaroslav", "Anton"));
        System.out.println(sum(1,2,3,4,5));
        int[] arr = {1,2,3,4,5};
        System.out.println(sumArr(arr));
    }

}
