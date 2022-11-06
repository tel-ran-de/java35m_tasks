public class PizzaHawaii extends Pizza {

    private static String TYPE = "pizza Hawaii";

    public PizzaHawaii(){
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("preparing pizza with pineapple and cheese");
    }
}
