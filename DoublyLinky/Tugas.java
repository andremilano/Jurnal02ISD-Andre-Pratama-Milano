//pojo class untuk menyimpan data tugas
public class Tugas implements Comparable<Tugas> {
    String namaMataKuliah;
    String namaTugas;
    String deadline;

    public Tugas(String namaMataKuliah, String namaTugas, String deadline) {
        this.namaMataKuliah = namaMataKuliah;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Tugas [namaMataKuliah=" + namaMataKuliah + ", namaTugas=" + namaTugas + ", deadline=" + deadline + "]";
    }

    @Override
    public int compareTo(Tugas compareTugas) {
        return this.deadline.compareTo(compareTugas.deadline);
    }

}
