package com.mycompany.guiasolemne1;

public class Funciones {

    public static int sumaNaturalesN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    public static int potenciaCiclo(int n1, int n2) {
        int potencia = 1;
        for (int i = 1; i <= n2; i++) {
            potencia = potencia * n1;
        }
        return potencia;
    }

    public static boolean numeroPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean bisiesto(int año) {
        if (año % 400 == 0) {
            return true;
        } else if (año % 100 == 0) {
            return false;
        } else if (año % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numeroPrimoRec(int n, int i) {
        if (n <= 2) {
            if (n == 2) {
                return true;
            } else {
                return false;
            }
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return numeroPrimoRec(n, i + 1);
    }
    
   public static int sumaPares(int n){
       int result = 0;
       int resto = n % 10;
       if (n == 0){
           return result;
       }
       else if (resto % 2 == 0){
           return resto + sumaPares(n/10);
       }
       return sumaPares(n/10);
   }
   
   public static int productoDigitos(int n){
       if (n < 10) {
            return n;
        }
       int resto = n % 10;
       return resto * productoDigitos(n/10);
   }
   
}
