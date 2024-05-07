package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double obtenerArea() {
        double areaTriangulo = (base * altura)/2;
        return areaTriangulo;
    } 
    
    @Override
    public double obtenerPerimetro(){
        double perimetroTriangulo = 0;
        return perimetroTriangulo;
    
    }
    
    
}
