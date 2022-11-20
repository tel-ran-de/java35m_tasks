package growing_plants;

public abstract class Plant {
    private String displayName;
    private int height;
    private int age;

    public Plant(String displayName, int height, int age) {
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public void addYearToAge(){
        this.age++;
    }

    public abstract int getGrowPerSeason();

    public void doSpring(){
        addYearToAge();
        setHeight(getHeight()+getGrowPerSeason());
        System.out.println(getDisplayName()+" has grown in spring "+getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();


    public void doWinter(){
        System.out.println(getDisplayName()+" is not growing in winter "+getHeight());
    }
}
