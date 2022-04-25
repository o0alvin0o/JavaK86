package act6_1;

public class AppTest {
    public static void main(String[] args) {
        Smartphone xiaomilite5gne = new Smartphone("Xiaomi Lite 5G NE", true, true, true,
                "Android", 12,"White",120);
        Smartphone xiaomi1 = new Smartphone("Xiaomi 1", true, false, true,
                "Android", 6,"Black",60);
        Smartphone samsunggalaxys1 = new Smartphone("Samsung Galaxy S1", true, true, true,
                "Android", 24,"Silver",1000);
        Smartphone motorola = new Smartphone("Motorola", true, false, false,
                "Android", 6,"Black",10);
        Smartphone iphone1 = new Smartphone("Iphone 1", false, false, false,
                "iOS", 1,"White",20);
        Smartphone iphone13 = new Smartphone("Iphone 13", true, true, true,
                "iOS", 32,"Purple",2000);
        // create frist store
        Store iphoneStore = new Store("Iphone Store", "28 Ngo Quyen");
        iphoneStore.addPhone(iphone1);
        iphoneStore.addPhone(iphone13);
        // create second store
        Store xiaomiStore = new Store("Xiaomi Official","12 Le Loi");
        xiaomiStore.addPhone(xiaomi1);
        xiaomiStore.addPhone(xiaomilite5gne);
        // create Samung and motorola store
        Store fakeStore = new Store("Old Phone", "130 Hai Ba Trung");
        fakeStore.addPhone(samsunggalaxys1);
        fakeStore.addPhone(motorola);
        // create store management
        StoreManagement manager = new StoreManagement();
        manager.addStore(xiaomiStore);
        manager.addStore(iphoneStore);
        manager.addStore(fakeStore);
        // print store information
        System.out.print(manager.toString());
        manager.topSeller();
        manager.worstSeller();
        manager.topRevenue();
        manager.worstRevenue();
        System.out.println("Number of bluetooth phones: " + manager.noBlueTooth());
        System.out.println("Number of 5G phones: " + manager.no5G());
        System.out.println("Number of wifi phones: " + manager.noWifi());
    }
}
