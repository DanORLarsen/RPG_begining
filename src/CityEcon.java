public class CityEcon {
    public int iron;
    public int sword;
    public int dagger;
    public int armor;

    public  void setEcon(){
        iron = (int) (Math.random()*30+20);
        sword = (int) (Math.random()*60+40);
        dagger = (int) (Math.random()*40+30);
        armor = (int) (Math.random()*40+60);

    };
}
