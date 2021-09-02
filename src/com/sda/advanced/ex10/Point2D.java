package com.sda.advanced.ex10;

public class Point2D implements Movable{
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x += moveDirection.getX();
        this.y += moveDirection.getY();
    }

    public int getX() {
        return x;
    }

    public Point2D setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point2D setY(int y) {
        this.y = y;
        return this;
    }



}