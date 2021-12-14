/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica
{   
    /* Atributo de tipo double que contiene la base del triangulo*/
    private double base;
    /* Atributo de tipo double que contiene la altura del triangulo*/
    private double altura;
    /* Atributo de tipo double que contiene el area del triangulo*/
    private double areaTriangulo;
    
    /**
     * Método constructor para la clase triangulo
     * @param base Base del triangulo
     * @param altura Altura del triangulo
     */
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}