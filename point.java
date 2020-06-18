package bai7;

public class point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public point (int x, int y){
        this.x=x;
        this.y=y;
    }
    public void getInfor(){
        System.out.println("Hoanh do: "+this.x);
        System.out.println("Tung do: "+this.y);
    }
    
}