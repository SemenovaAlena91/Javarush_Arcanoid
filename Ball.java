package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    private double speed;//скорость шарика
    private double direction;//направление движения в градусах: от 0 до 360
    private double dx;//расстояние по x, которое проходит шарик за один шаг. вычисляется на основе speed и direction
    private double dy;//расстояние по y, которое проходит шарик за один шаг. вычисляется на основе speed и direction
    private boolean isFrozen = true;//"истина" если шарик "заморожен" - не двигается

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.direction = direction;
        this.speed = speed;

    }

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

    public void move(){
        if(!isFrozen){
            super.setX(x+dx);
            super.setY(y+dy);
        }
    };

    public void draw(Canvas canvas){
        canvas.setPoint(super.getX(), super.getY(), 'O');
    }

    public void start(){
        isFrozen = false;
    }

    public void setDirection(double direction){
        this.direction = direction;
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }

    public void checkRebound(int minx, int maxx, int miny, int maxy){

    }
}
