package figures;

public abstract class Shape {

    private String displayName;

    public Shape (String displayName){
        this.displayName=displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    public abstract double getArea();




}
