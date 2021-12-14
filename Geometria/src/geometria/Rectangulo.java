/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase para definir el objeto Rectangulo
 * 
 * @author 
 * @version 1.0
 * @since 2021/11/30
 */
public class Rectangulo implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double areaRectangulo;

    public Rectangulo(double base, double altura) 
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

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }

    @Override
    public void area() 
    {
        areaRectangulo = base * altura;
    }
}