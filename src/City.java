public class City extends CityEcon {
    String name;
    int population = ((int) (Math.random()*30000+5000))/1000;
    public City() {
        this.name = "A City Name";
        this.setEcon();
    }


    public void setName(String name) {
        this.name = name;
    }
}
