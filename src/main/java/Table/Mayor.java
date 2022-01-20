package Table;

/**
 * Project: hw_6
 * Author: Tashmatov Bektur
 * Date: 20.01.2022 (23:02)
 */
public class Mayor {
    private int id;
    private String first_name;
    private String last_name;
    private String gender;
    private String date_of_birth;
    private String phone_num;

    public Mayor(int id, String first_name, String last_name, String gender, String date_of_birth, String phone_num) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.phone_num = phone_num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    @Override
    public String toString() {
        System.out.printf("|%-4s", id);
        System.out.printf("|%-12s", first_name);
        System.out.printf("|%-12s", last_name);
        System.out.printf("|%-8s", gender);
        System.out.printf("|%-15s", date_of_birth);
        System.out.printf("|%-18s", phone_num);
        System.out.printf("|");
        System.out.println();
        return "";
    }
}
