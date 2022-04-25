package act6_1;

import java.util.ArrayList;
import java.util.Collection;

public class StoreManagement {
    ArrayList<Store> stores = new ArrayList<>();

    public void addStore(Store store) {
        stores.add(store);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Store store : stores) {
            result.append("Store: " + store.getName() + ". " + "Address: " + store.getAddress() + "\n"
                    + "Sold: " + store.noPhoneSold() + ". " + "Revenue: " + store.revenue() + "$" + "\n"
                    + "---------------------------\n");
        }
        return result.toString();
    }

    public int noBlueTooth() {
        int count = 0;
        for (Store store : stores) {
            for (Smartphone phone : store.phones) {
                if(phone.isHasBluetooth()) count += phone.getStock();
            }
        }
        return count;
    }

    public int no5G() {
        int count = 0;
        for (Store store : stores) {
            for (Smartphone phone : store.phones) {
                if(phone.isHas5G()) count += phone.getStock();
            }
        }
        return count;
    }

    public int noWifi() {
        int count = 0;
        for (Store store : stores) {
            for (Smartphone phone : store.phones) {
                if(phone.isHasWifi()) count += phone.getStock();
            }
        }
        return count;
    }

    public void topSeller() {
        int max = stores.get(0).noPhoneSold(); // store the max value
        int maxIndex = 0; //store the max index
        for (int i = 1; i < stores.size(); i++) {
            if (stores.get(i).noPhoneSold() > max) {
                max = stores.get(i).noPhoneSold();
                maxIndex = i;
            }
        }
        // print result
        System.out.println("The top seller is: " + stores.get(maxIndex).getName() + ". Sold: " + max + " phones");
    }

    public void worstSeller() {
        int min = stores.get(0).noPhoneSold(); // store the min value
        int minIndex = 0; //store the min index
        for (int i = 1; i < stores.size(); i++) {
            if (stores.get(i).noPhoneSold() < min) {
                min = stores.get(i).noPhoneSold();
                minIndex = i;
            }
        }
        // print result
        System.out.println("The worst seller is: " + stores.get(minIndex).getName() + ". Sold: " + min + " phones");
    }

    public void worstRevenue() {
        double min = stores.get(0).revenue(); // store the min value
        int minIndex = 0; //store the min index
        for (int i = 1; i < stores.size(); i++) {
            if (stores.get(i).revenue() < min) {
                min = stores.get(i).revenue();
                minIndex = i;
            }
        }
        // print result
        System.out.println("The worst revenue is: " + stores.get(minIndex).getName() + ". Sold: " + min +"$");
    }

    public void topRevenue() {
        double max = stores.get(0).revenue(); // store the min value
        int maxIndex = 0; //store the min index
        for (int i = 1; i < stores.size(); i++) {
            if (stores.get(i).revenue() > max) {
                max = stores.get(i).revenue();
                maxIndex = i;
            }
        }
        // print result
        System.out.println("The top revenue is: " + stores.get(maxIndex).getName() + ". Sold: " + max +"$");
    }



}
