package Tokopedia;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Barang> barangList;

    public Inventory() {
        barangList = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        barangList.add(barang);
    }

    public void tampilkanData() {
        for (Barang barang : barangList) {
            System.out.println(barang);
        }
    }

    public void sortBarangByNama() {
        int n = barangList.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (barangList.get(j).getNama().compareTo(barangList.get(minIndex).getNama()) < 0) {
                    minIndex = j;
                }
            }
            Barang temp = barangList.get(minIndex);
            barangList.set(minIndex, barangList.get(i));
            barangList.set(i, temp);
        }
    }

    public List<Barang> cariBarangByNama(String nama) {
        List<Barang> hasilPencarian = new ArrayList<>();
        for (Barang barang : barangList) {
            if (barang.getNama().equalsIgnoreCase(nama)) {
                hasilPencarian.add(barang);
            }
        }
        return hasilPencarian;
    }
}
