package Table;

/**
 * Project: hw_6
 * Author: Tashmatov Bektur
 * Date: 19.01.2022 (21:13)
 */
public class Country {
    private int id;
    private String country;
    private String president;
    private String kod;

    public Country(int id, String country, String president, String kod) {
        this.id = id;
        this.country = country;
        this.president = president;
        this.kod = kod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Override
    public String toString() {
        System.out.printf("|%-4s", id);
        System.out.printf("|%-11s", country);
        System.out.printf("|%-25s", president);
        System.out.printf("|%-5s", kod);
        System.out.printf("|");
        System.out.println();
        return "";
    }
}
