import java.util.*;

public class queueTodo<E> {

    private Queue<E> queueList;

    // constructor
    public queueTodo() {
        queueList = new LinkedList<E>();
    }

    // check list kosong
    public boolean isKosong() {
        return queueList.isEmpty();
    }

    // method nambah bro
    public void tambahData(E data) {
        queueList.add(data);
    }

    // method ngurangin bro
    public E kurangData() {
        if (isKosong()) {
            return null;
        }
        return queueList.remove();
    }

    // tampil terdepan
    public E tampilDepan() {
        return queueList.peek();
    }

    // method untuk tampilin seluruh
    public void tampilData() {
        int index = 0;
        for (E e : queueList) {

            if (index == queueList.size() - 1) {
                System.out.println(e.toString());
                // System.out.print(e.toString() + " ");
            } else {
                System.out.print(e.toString() + " - ");
            }
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueTodo<String> queue = new queueTodo<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Kurang Data");
            System.out.println("3. Tampil Depan");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("Tentukan Pilihanmu kawan : ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Masukkan data: ");
                    sc.nextLine();
                    String data = sc.next();
                    queue.tambahData(data);
                    break;
                case 2:
                    queue.kurangData();
                    break;
                case 3:
                    System.out.println(queue.tampilDepan());
                    break;
                case 4:
                    queue.tampilData();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
