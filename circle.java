package bai7;

public class circle extends point {
    private int x,y,r;

    public int getX() {
        return x;
    }

    public void setX( int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR( int r) {
        this.r = r;
    }
    public circle(int r){
        this.r=r;
    }
    
    public circle( int x,  int y, int r) {
        super(x, y);
        this.r = r;
    }

    public double area( int r) {
        return 2 * 3.14 * r;
    }

    public double perimeter( int r) {
        return 2*3.14*r*r;
    }
    public void Circle(){
        System.out.println("Chu vi la: "+area(r));;
        System.out.println("Dien tich la: "+perimeter(r));
    }
}
