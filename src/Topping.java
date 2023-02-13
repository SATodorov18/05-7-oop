public class Topping {
    private String meat;
    private String vegetables;
    private String cheese;
    private String sauce;

    public Topping(String meat, String vegetables, String cheese, String sauce) {
        this.meat = meat;
        this.vegetables = vegetables;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
