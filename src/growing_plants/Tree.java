package growing_plants;

public class Tree extends Plant {

    private static int TREE_GROW_PER_SEASON = 5;

    public Tree(String displayName,int height, int age){
        super(displayName,height,age);
    }

    @Override
    public int getGrowPerSeason() {
        return TREE_GROW_PER_SEASON;
    }

    @Override
    public void doSummer() {
        setHeight(getHeight()+getGrowPerSeason());
        System.out.println(getDisplayName()+" has grown in Summer "+getHeight());
    }

    @Override
    public void doAutumn() {
        System.out.println(getDisplayName()+" is not growing in autumn "+getHeight());
    }
}
