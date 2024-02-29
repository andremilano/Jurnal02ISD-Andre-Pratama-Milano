import java.util.ArrayList;

// class generic untuk operation (add, delete, edit) Step 1
class Inventory<T> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // Getter tambah item
    public void addItems(T barang) {
        items.add(barang);
    }

    // Setter hapus item
    public void deleteItems(T barang) {
        items.remove(barang);
    }

    // Setter edit item
    public void editItems(int index, T barangBaru) {
        items.set(index, barangBaru);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}

// class untuk A dan B (ATK) Step 2
class ATK {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;

    // Constructor
    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    // Getter dan Setter berfungsi untuk mengakses dan mengubah nilai dari variabel
    // kodeBarang, jenisBarang, namaBarang, dan stok
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

}

// class untuk C (Bag) Step 2 juga
class Bag {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;

    // Constructor
    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    // Getter dan Setter berfungsi untuk mengakses dan mengubah nilai dari variabel
    // kodeBarang, jenisBarang, namaBarang, dan stok
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}

public class Jurnal2 {
    public static void main(String[] args) {
        // membuat isi inventory ATK dan Bag Step 3 (pemanggilan)
        Inventory<ATK> atkInventory = new Inventory<>();
        Inventory<Bag> bagInventory = new Inventory<>();

        // menambahkan item ke inventory
        atkInventory.addItems(new ATK("A001", "Pensil", "Pensil 2B", 100));
        atkInventory.addItems(new ATK("A002", "Pensil", "Pensil 2H", 100));
        atkInventory.addItems(new ATK("A003", "Pensil", "Pensil 2B", 100));
        atkInventory.addItems(new ATK("A004", "Pensil", "Pensil 2H", 100));
        atkInventory.addItems(new ATK("A005", "Pensil", "Pensil 2B", 100));

        bagInventory.addItems(new Bag("C001", "Tas", "Tas Ransel", 100));
        bagInventory.addItems(new Bag("C002", "Tas", "Tas Selempang", 100));
        bagInventory.addItems(new Bag("C003", "Tas", "Tas Jinjing", 100));
        bagInventory.addItems(new Bag("C004", "Tas", "Tas Ransel", 100));
        bagInventory.addItems(new Bag("C005", "Tas", "Tas Selempang", 100));

        // menampilkan isi inventory ATK dan Bag Step 4 memakai looping for each
        System.out.println("ATK Inventory");
        for (ATK atk : atkInventory.getItems()) {
            System.out.println("Kode Barang\t: " + atk.getKodeBarang());
            System.out.println("Jenis Barang\t: " + atk.getJenisBarang());
            System.out.println("Nama Barang\t: " + atk.getNamaBarang());
            System.out.println("Stok\t: " + atk.getStok());
            System.out.println();
        }
    }
}
