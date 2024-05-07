package com.mycompany.figurasgeometricaspoo;
public class Circulo extends FiguraGeometrica {
    private double radio;
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    
    @Override
    public double obtenerArea(){
        double areaCirculo = Math.PI*(Math.pow(radio, 2));
        return areaCirculo;
    
    }
    @Override
    public double obtenerPerimetro(){
        double perimetroCirculo = 2*radio*Math.PI;
        return perimetroCirculo;
        
   
    }
}
