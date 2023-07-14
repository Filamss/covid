package Tokopedia;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.tambahBarang(new Barang("Laptop", 8000000, 5));
        inventory.tambahBarang(new Barang("Mouse", 50000, 10));
        inventory.tambahBarang(new Barang("Keyboard", 100000, 7));
        inventory.tambahBarang(new Barang("Laptop", 6000000, 3));

        System.out.println("Data sebelum diurutkan:");
        inventory.tampilkanData();

        System.out.println("\nData setelah diurutkan berdasarkan nama barang:");
        inventory.sortBarangByNama();
        inventory.tampilkanData();

        String cariNamaBarang = "Laptop";
        List<Barang> hasilPencarian = inventory.cariBarangByNama(cariNamaBarang);
        if (hasilPencarian.isEmpty()) {
            System.out.println("\nTidak ditemukan barang dengan nama: " + cariNamaBarang);
        } else {
            System.out.println("\nHasil pencarian berdasarkan nama barang: " + cariNamaBarang);
            for (Barang barang : hasilPencarian) {
                System.out.println(barang);
            }
        }
    }
}
