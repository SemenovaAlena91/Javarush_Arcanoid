package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    /*а) speed (скорость шарика) типа double;
б) direction (направление движения в градусах: от 0 до 360) типа double;
в) dx (расстояние по x, которое проходит шарик за один шаг. вычисляется на основе speed и direction) типа double;
г) dy (расстояние по y, которое проходит шарик за один шаг. вычисляется на основе speed и direction) типа double;
д) isFrozen ("истина" если шарик "заморожен" - не двигается) типа boolean.

Не забудь добавить геттеры для всех полей этого класса, кроме isFrozen (его мы будем использовать только внутри класса Ball).

А еще сделай-ка конструктор:
а) параметры - x, y, speed, direction;
б) радиус (для вызова родительского класса) всегда равен 1;
в) не забудь установить isFrozen в true - в начале игры шарик никуда не летит.

*/
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen = true;

    public double getSpeed(){
        return speed;
    }

    public double getDirection(){
        return direction;
    }

    public double getDx(){
        return dx;
    }

    public double getDy(){
        return dy;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void setDirection(int direction){
        this.direction = direction;
    }

    public void setDx(double dx){
        this.dx = dx;
    }

    public void setDy(double dy){
        this.dy = dy;
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.direction = direction;
        this.speed = speed;

    }

    public void move(){

    };

    public void draw(Canvas canvas){

    }
}
