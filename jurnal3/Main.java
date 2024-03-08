import java.util.*;

class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    // konstruktor untuk menginisialisasi data
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Juduk Buku :" + judul + "\nPenulis :" + penulis + "\nTahun Terbit :" + tahunTerbit;
    }

}

// Kelas Node
class Node<E> {
    E data;
    Node<E> next;

    // konstruktor untuk menginisialisasi data
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList<Buku> linkedList = new SinglyLinkedList<>();

        while (true) {
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Buku");
            System.out.println("4. Keluar");
            System.out.println("Pilih dulu Bro :");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Pilih Jenis Tambah :");
                    System.out.println("1. Tambah Depan");
                    System.out.println("2. Tambah Belakang");
                    int pilihanTambah = sc.nextInt();
                    if (pilihanTambah == 1) {
                        System.out.println("Masukkan Judul Buku :");
                        String judul = sc.next();
                        System.out.println("Masukkan Penulis Buku :");
                        String penulis = sc.next();
                        System.out.println("Masukkan Tahun Terbit Buku :");
                        int tahunTerbit = sc.nextInt();
                        linkedList.insertDepan(new Buku(judul, penulis, tahunTerbit));
                        break;
                    } else if (pilihanTambah == 2) {
                        System.out.println("Masukkan Judul Buku :");
                        String judul = sc.next();
                        System.out.println("Masukkan Penulis Buku :");
                        String penulis = sc.next();
                        System.out.println("Masukkan Tahun Terbit Buku :");
                        int tahunTerbit = sc.nextInt();
                        linkedList.insertBelakang(new Buku(judul, penulis, tahunTerbit));
                        break;
                    }
                    break;
                case 2:

                    // check if only 1 data exist
                    if (linkedList.checkSingleData()) {
                        linkedList.hapusDepan();
                        break;
                    }
                    System.out.println("Pilih Jenis Hapus :");
                    System.out.println("1. Hapus Depan");
                    System.out.println("2. Hapus Belakang");
                    int pilihanHapus = sc.nextInt();
                    if (pilihanHapus == 1) {
                        linkedList.hapusDepan();
                    } else if (pilihanHapus == 2) {
                        linkedList.hapusBelakang();
                    }
                    break;
                case 3:
                    linkedList.print();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }
}
