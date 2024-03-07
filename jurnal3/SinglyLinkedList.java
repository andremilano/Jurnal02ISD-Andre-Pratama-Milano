import java.util.*;

public class SinglyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private String name;

    public SinglyLinkedList() {
        this("Linked list");
    }

    public SinglyLinkedList(String name) {
        this.name = name;
        head = tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void insertDepan(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = new Node<E>(data);
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println("Data bagian depan berhasil ditambahkan");
    }

    public void insertBelakang(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = new Node<E>(data);
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Data bagian belakang berhasil ditambahkan");
    }

    // method buat ngapus belakang coy
    public E hapusBelakang() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " Kosong");
        }
        E data = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            Node<E> iteratorNode = head;
            // disuru maju coy
            while (iteratorNode.next != tail) {
                iteratorNode = iteratorNode.next;
            }
            tail = iteratorNode;
            iteratorNode.next = null;
        }
        System.out.println("data bagian Belakang Sukses dihapus");
        return data;
    }

    // hapus depan ini bro
    public E hapusDepan() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " Kosong");
        }
        E data = head.data;
        // cuma ada 1 data
        if (head == tail) {
            head = tail = null;
            // lebih dari 1 data
        } else {
            head = head.next;
        }
        System.out.println("Data bagian depan berhasil dihapus");
        return data;
    }

    // method untuk print hasilnya
    public void print() {
        if (isEmpty()) {
            System.out.println(name + " Kosong");
            return;
        }

        System.out.println("Isi " + name + ": ");
        Node<E> iteratorNode = head;
        while (iteratorNode != null) {
            System.out.println(iteratorNode.data.toString());
            iteratorNode = iteratorNode.next;
        }
        System.out.println();
    }

    public boolean checkSingleData() {
        return head == tail;
    }
}
