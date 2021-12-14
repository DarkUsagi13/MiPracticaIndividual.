/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 * Clase para definir el objeto Cuadrado
 * 
 * @author javier
 * @version 1.0
 * @since 2021/11/30
 */
public class Cuadrado implements FiguraGeometrica
{
    /* Atributo de tipo double que contiene el lado del cuadrado*/
    private double lado;
    /* Atributo de tipo double que contiene el area del cuadrado*/
    private double areaCuadrado;
    /**
     * Método constructor para la clase Cuadrado
     * @param lado Lado del cuadrado
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Método consultor del atributo Lado
     * @return Lado del cuadrado
     */
    public double getLado() 
    {
        return lado;
    }
    /**
     * Método modificador del atributo Lado
     * @param lado Lado del cuadrado asociado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Método consultor del atributo areaCuadrado
     * @return Area del cuadrado
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    /**
     * Método modificador del atributo areaCuadrado
     */
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}