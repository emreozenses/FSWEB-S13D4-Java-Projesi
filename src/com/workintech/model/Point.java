package com.workintech.model;

public class Point {

    private int x ;
    private int y;

    public Point(int x,int y){
            this.x = x;
            this.y = y;

    }
    public int getPointX (){
        return this.x;
    }

    public int getPointY (){
        return this.y;
    }

    public void setPointX(int x){
        this.x = x;
    }

    public void setPointY(int y){
        this.y = y;
    }

    public double distance (){

        return Math.sqrt(((getPointX())*(getPointX()))+((getPointY())*(getPointY())));

    }

    public double distance (int x,int y){

        return Math.sqrt(((getPointX()-x)*(getPointX()-x))+((getPointY()-y)*(getPointY()-y)));

    }
    public double distance (Point p1){
        int a = p1.x ;
        int b = p1.y;
        return Math.sqrt(((getPointX()-a)*(getPointX()-a))+((getPointY()-b)*(getPointY()-b)));

    }

}
