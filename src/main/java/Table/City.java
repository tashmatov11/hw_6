package Table;

/**
 * Project: hw_6
 * Author: Tashmatov Bektur
 * Date: 19.01.2022 (21:08)
 */
public class City {
    private int id;
    private String name;
    private String naselenie;
    private String ploshad;

    public City(int id, String name, String naselenie, String ploshad) {
        this.id = id;
        this.name = name;
        this.naselenie = naselenie;
        this.ploshad = ploshad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNaselenie() {
        return naselenie;
    }

    public void setNaselenie(String naselenie) {
        this.naselenie = naselenie;
    }

    public String getPloshad() {
        return ploshad;
    }

    public void setPloshad(String ploshad) {
        this.ploshad = ploshad;
    }

    @Override
    public String toString() {
        System.out.printf("|%-4s", id);
        System.out.printf("|%-9s", name);
        System.out.printf("|%-11s", naselenie);
        System.out.printf("|%-10s", ploshad);
        System.out.printf("|");
        System.out.println();
        return "";
    }
}
