package Tokopedia;

public class Barang {
    private String nama;
    private double harga;
    private int jumlahItem;

    public Barang(String nama, double harga, int jumlahItem) {
        this.nama = nama;
        this.harga = harga;
        this.jumlahItem = jumlahItem;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlahItem() {
        return jumlahItem;
    }

    @Override
    public String toString() {
        return "Nama Barang: " + nama + ", Harga: " + harga + ", Jumlah Item: " + jumlahItem;
    }
}

