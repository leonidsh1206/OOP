package ru.shakov.kons4;

// новый общий класс Треугольник

public class Triangle {
    // Класс будет хранить состояние объекта, стороны и углы
    private double sideA;
    private double sideB;
    private double sideC;

    private double angleA;
    private double angleB;
    private double angleC;

    public Triangle(double sideA, double sideB, double sideC, double angleA, double angleB, double angleC) {
        this.sideA = sideA;     // this ссылаемся на переменную экземпляра, благо к строке private double sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getAngleC() {
        return angleC;
    }

    public void setAngleC(double angleC) {
        this.angleC = angleC;
    }

    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public void setAngleB(double angleB) {
        this.angleB = angleB;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", angleA=" + angleA +
                ", angleB=" + angleB +
                ", angleC=" + angleC +
                '}';
    }
}
