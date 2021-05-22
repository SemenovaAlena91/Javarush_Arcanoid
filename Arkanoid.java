package com.javarush.task.task24.task2413;

import java.util.ArrayList;
import java.util.List;

public class Arkanoid {
    private int width;
    private int height;
    private Ball ball;
    private List<Brick> bricks;
    private Stand stand;
    static Arkanoid game;
    private boolean isGameOver;

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Ball getBall(){
        return ball;
    }

    public List<Brick>  getBricks(){
        return bricks;
    }

    public Stand getStand(){
        return stand;
    }

    public void setWidth(int width){
        this.width = width;
    }
    
    public void setHeight(int height){
        this.height = height;
    }

    public void setBall(Ball ball){
        this.ball = ball;
    }

    public void setStand(Stand stand){
        this.stand = stand;
    }

    public void setBricks(List<Brick> bricks){
        this.bricks = bricks;
    }

    public void run(){

    }

    public void move(){
        ball.move();
        stand.move();
    }

    public void draw(Canvas canvas){
        //вызывающий методы draw у шарика, подставки и всех кирпичей.
        ball.draw(canvas);
        stand.draw(canvas);
        for (Brick b:bricks
             ) {
            b.draw(canvas);
        }
    }

    public void checkBricksBump(){

        for (Brick brick : new ArrayList<Brick>(bricks)) {
            if (ball.isIntersec(brick)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);

                bricks.remove(brick);
            }
        }
    }

    public void checkStandBump(){
        //ударился ли шарик о подставку
        if(ball.isIntersec(stand)){
            //шарик отлетает в случайным направлении вверх:
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame(){
        //Если координата y шарика больше чем высота поля игры (height), значит шарик улетел вниз за границу экрана.
        //В этом случае надо переменную isGameOver установить в true.
        if(ball.y > height){
            isGameOver = true;
        }
    }


    public Arkanoid(int width, int height){
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args){

    }
}
