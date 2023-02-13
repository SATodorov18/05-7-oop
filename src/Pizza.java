public class Pizza {

    private String pizzaName;
    private String toppingType;
    private String doughtType;

    public Pizza(String pizzaName, String toppingType, String doughtType) {
        this.pizzaName = pizzaName;
        this.toppingType = toppingType;
        this.doughtType = doughtType;
    }

    public Pizza() {
        this.pizzaName = "Avenu";
        this.toppingType = "Meat";
        this.doughtType = "White dought";
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getToppingType() {
        return toppingType;
    }

    public String getDoughtType() {
        return doughtType;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    public void setDoughtType(String doughtType) {
        this.doughtType = doughtType;
    }
    @Override
    public String toString() {
        return "Pizza{" +
                "pizza name='" + pizzaName + '\'' +
                ", topping type=" + toppingType +
                ", dought type=" + doughtType + '\'' +
                '}';
    }
}
