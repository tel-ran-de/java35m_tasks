package growing_plants;

public class Flower extends Plant{

    private static  int FLOWER_GROW_PER_SEASON=2;

    public Flower(String displayName, int height, int age) {
        super(displayName, height, age);
    }

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getDisplayName()+" is not growing in summer but flourishing "+getHeight());
    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.println(getDisplayName()+" is cut to zero in autumn "+getHeight());
    }
}
