package com.mycompany.figurasgeometricaspoo;
import java.util.Scanner;

public class Principal {
   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        String nombre= lector.next();
        System.out.println("ingrese el color");
        String color= lector.next();
        System.out.println("Ingresa el tipo de figura (1: Circulo, 2: Rectángulo, 3: Triángulo)");
        String tipoF = lector.next();
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        switch (tipoF) {
            case "1":
                System.out.println("figura elegida: Circulo");
                System.out.println("Ingresa el radio");
                double radio = lector.nextDouble();
                Circulo circulo1 = new Circulo(nombre, color, radio);
                System.out.println("Area: ");
                System.out.println(circulo1.obtenerArea());
                System.out.println("Perimetro: ");
                System.out.println(circulo1.obtenerPerimetro());
                break;
            case "2":
                System.out.println("figura elegida: Rectángulo");
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2 = lector.nextDouble();
                Rectangulo rectangulo1 = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("Area: ");
                System.out.println(rectangulo1.obtenerArea());
                System.out.println("Perimetro: ");
                System.out.println(rectangulo1.obtenerPerimetro());
                break;
            case "3":
                System.out.println("figura elegida: Triangulo");
                System.out.println("Ingresa el valor de la base del triángulo");
                double base = lector.nextDouble();
                System.out.println("Ingresa el valor de la altura del triángulo");
                double altura = lector.nextDouble();
                Triangulo triangulo1 = new Triangulo(nombre, color, base, altura);
                System.out.println("Area: ");
                System.out.println(triangulo1.obtenerArea());
                System.out.println("Perimetro: ");
                System.out.println(triangulo1.obtenerPerimetro());
                break;
            
            default:
                System.out.println("Escribiste algun valor incorrecto...salir");
        } 
    }
}
