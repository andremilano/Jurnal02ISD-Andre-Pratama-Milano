import java.util.LinkedList;
import java.util.ListIterator;

public class ToDo {
    LinkedList<Tugas> listTugas;

    public ToDo() {
        listTugas = new LinkedList<Tugas>();
    }

    // method untuk menambahkan tugas
    public void tambahTugas(Tugas tugas) {
        listTugas.add(tugas);
        System.out.println("Tugas berhasil ditambahkan.");
    }

    // method untuk menghapus tugas
    public void hapusDepan() {
        if (listTugas.isEmpty()) {
            System.out.println("Tidak ada tugas yang tersedia.");
            return;
        }
        listTugas.removeFirst();
    }

    // hapus belakang
    public void hapusBelakang() {
        if (listTugas.isEmpty()) {
            System.out.println("Tidak ada tugas yang tersedia.");
            return;
        }
        listTugas.removeLast();
    }

    // hapus berdasarkan nama matkul
    public void hapusDariMatkul(String namaMatkul) {
        if (listTugas.isEmpty()) {
            System.out.println("Tidak ada tugas yang tersedia.");
            return;
        }
        ListIterator<Tugas> iterator = listTugas.listIterator();
        while (iterator.hasNext()) {
            Tugas tugas = iterator.next();
            if (tugas.namaMataKuliah.equals(namaMatkul)) {
                iterator.remove();
            }
            System.out.println("Tugas berdasarkan nama matkul sudah dihapus. Yang dihapus :" + tugas.namaMataKuliah);
        }
    }

    // cetak data
    public void cetakData() {
        if (listTugas.isEmpty()) {
            System.out.println("Tugas Kosong.");
            return;
        }
        System.out.println("Daftar Tugas:");

        // diurut berdasarkan deadline
        listTugas.sort((tugas1, tugas2) -> tugas1.deadline.compareTo(tugas2.deadline));
        listTugas.forEach(tugas -> {
            System.out.println("Mata Kuliah\t: " + tugas.namaMataKuliah);
            System.out.println("Nama Tugas\t: " + tugas.namaTugas);
            System.out.println("Deadline\t: " + tugas.deadline);
            System.out.println("--------------------------");
        });

        // cetak pakai foreach
        // for (Tugas tugas : listTugas) {
        // System.out.println("Mata Kuliah\t: " + tugas.namaMataKuliah);
        // System.out.println("Nama Tugas\t: " + tugas.namaTugas);
        // System.out.println("Deadline\t: " + tugas.deadline);
        // System.out.println("--------------------------");
        // }
    }
}
