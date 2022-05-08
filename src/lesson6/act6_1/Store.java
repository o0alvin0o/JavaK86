package act6_1;

import java.util.ArrayList;

public class Store {
    //data field
    private String name;
    private String address;
    ArrayList<Smartphone> phones = new ArrayList<>();
    // method

    public Store(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfPhone() {
        int count = 0;
        for (Smartphone phone : phones) {
            count += phone.getStock();
        }
        return count;
    }

    public void addPhone(Smartphone sp) {
        phones.add(sp);
    }

    public int noPhoneSold() {
        int phoneSold = 0;
        for (Smartphone phone : phones) {
            phoneSold += phone.getTotalSold();
        }
        return phoneSold;
    }
    public double revenue() {
        double revenue = 0;
        for (Smartphone phone : phones) {
            revenue += phone.getTotalSold() * phone.getPrice();
        }
        return revenue;
    }
}
