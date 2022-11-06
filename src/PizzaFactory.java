public class PizzaFactory {

    public Pizza createPizza(String type){

        switch (type) {
            case "PIZZA_SALAMI":    return new PizzaSalami();
            case "PIZZA_MOZARELLA": return new PizzaMozarella();
            case "PIZZA_HAWAII":    return new PizzaHawaii();
            default: return null;
        }

    }


    public Pizza createPizza(PizzaType type){

        switch (type) {
            case PIZZA_SALAMI:    return new PizzaSalami();
            case PIZZA_MOZARELLA: return new PizzaMozarella();
            case PIZZA_HAWAII:    return new PizzaHawaii();
            default: return null;
        }

    }
}
