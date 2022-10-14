public class Rectangle {
     public int length;
    public int breadth;
    public int height;
    static int counter;

    public Rectangle(){}

    public Rectangle(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        counter++;
    }
    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        counter++;
    }


    public int getArea(int length,int breadth){
        return this.length*breadth;
    }

    public int getPerimeter(){
        return 2*(length+breadth);
    }


}
