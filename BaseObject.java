package com.javarush.task.task24.task2413;

import java.util.Collections;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public BaseObject(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();

    public boolean isIntersec(BaseObject o){
        /*Он будет определять - "пересеклись" объекты или нет. Если пересеклись - возвращать true, если нет - false.
Т.к. объекты мы условно считаем кругами, то предлагаю такую формулу взаимодействия:
если центр круга одного объекта попал в круг другого, то будем считать, что они столкнулись.
дистанция_между_объектами <= max (радиус_первого_объекта, радиус_второго_объекта)

Дистанция между объектами A и B на плоскости вычисляется по теореме Пифагора по формуле:
дистанция_между_объектами_A_B = квадратный_корень(
квадрат_числа(координата_x_объекта_B - координата_x_объекта_A) +
квадрат_числа(координата_y_объекта_B - координата_y_объекта_A)
)
Квадратный корень можно получить используя метод Math.sqrt(). Квадрат числа можно получить используя метод Math.pow(), где первый аргумент - это число, второй аргумент - степень, к которой нужно возвести число.
Или еще проще используя метод Math.hypot().*/
        double dist =  Math.sqrt(Math.pow((o.x - getX()),2)+Math.pow((o.y - getY()),2));
        if(dist < Math.max(o.radius,getRadius()))
            return true;
        else return false;
    }
}
