package Entities;

public class Sale {

    private int id;
    private String name;


    public Sale() {

    }

    public Sale(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(int i) {
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
}


