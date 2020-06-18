package bai7;

public class cylinder extends circle {
    private int r,h;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public cylinder(int h){
        this.h=h;
    }
    public cylinder(int r, int h){
        super(r);
        this.h=h;
    }
    public double volume(int r, int h){
        return super.perimeter(r)*h;
    }
    public double areaAround(int r, int h){
        return super.area(r)*h;
    }
    public void Cylinder(){
        System.out.println("The tich la: "+this.area(r));
        System.out.println("Dien tich xung quanh la: "+this.areaAround(r, h));
    }
}