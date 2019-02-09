class City extends CityEcon {
    String name;
    public City() {
        this.name = "A City Name";
        this.setEcon();
    }


    public void setName(String name) {
        this.name = name;
    }
}
