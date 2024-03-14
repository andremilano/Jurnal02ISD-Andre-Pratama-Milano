import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // dekalarasi objek
        ToDo ToDo = new ToDo();

        while (true) {
            System.out.println("Pilih Menu");
            System.out.println("1. Input tugas");
            System.out.println("2. Delete tugas");
            System.out.println("3. Lihat list tugas");
            System.out.println("4. keluar");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama mata kuliah : ");
                    sc.nextLine();
                    String namaMataKuliah = sc.nextLine();
                    System.out.print("Masukkan nama tugas : ");
                    String namaTugas = sc.nextLine();
                    System.out.print("Masukkan deadline : ");
                    String deadline = sc.nextLine();
                    Tugas tugasBaru = new Tugas(namaMataKuliah, namaTugas, deadline);
                    ToDo.tambahTugas(tugasBaru);
                    break;
                case 2:
                    System.out.println("Pilih Jenis Hapus :");
                    System.out.println("1. Hapus Depan");
                    System.out.println("2. Hapus Belakang");
                    System.out.println("3. Hapus Berdasarkan Mata Kuliah");
                    int pilihanHapus = sc.nextInt();
                    if (pilihanHapus == 1) {
                        ToDo.hapusDepan();
                    } else if (pilihanHapus == 2) {
                        ToDo.hapusBelakang();
                    } else if (pilihanHapus == 3) {
                        System.out.print("Masukkan nama mata kuliah : ");
                        sc.nextLine();
                        String namaMatkul = sc.nextLine();
                        ToDo.hapusDariMatkul(namaMatkul);
                    }
                    break;
                case 3:
                    System.out.println("Pilih pengurutan :");
                    System.out.println("1. Berdasarkan nama mata kuliah");
                    System.out.println("2. Berdasarkan deadline");
                    int pilihanUrut = sc.nextInt();
                    if (pilihanUrut == 1) {
                        ToDo.cetakData();
                    } else if (pilihanUrut == 2) {
                        ToDo.cetakDataUrut();
                    }
                    break;
                case 4:
                    System.out.println("Anda Keluar");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu yang dipilih tidak tersedia");
                    break;
            }
        }

    }
}