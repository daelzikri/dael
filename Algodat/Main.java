public class Main {
    public static void main(String[] args) {
            Node nama1 = new Node("lidia");
            Node nama2 = new Node("sagos");

            Linkedlist list = new Linkedlist();
            list.add(nama1);
            list.add(nama2);
            System.out.println("Baca dari depan");
            list.bacadaridepan();
            System.out.println();
            System.out.println("Baca dari belakang");
            list.bacadaribelakang();
    }
}
