package edu.upc.eetac.dsa;


/**
 * Created by OriolGresa on 15/9/16.
 */
public class Circle implements Figure{
    private double r;

    public Circle (double r){
        this.r=r;
    }

    public double area(){
        return Math.PI*r*r;
    }

    public String type(){
        return "Circle";
    }
}
