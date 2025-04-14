package buoi3;

public class main {
    public static void main(String[] args) {
        bai1 queue = new bai1(6); // tạo hàng đợi có 5 ô

        System.out.println("== Thêm phần tử ==");
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        queue.enQueue("D");
        queue.enQueue("E");
        queue.enQueue("F");

        System.out.println("\n== Peek phần tử đầu tiên ==");
        System.out.println(queue.peek());

        System.out.println("\n== Xóa phần tử đầu tiên ==");
        System.out.println(queue.deQueue());

        System.out.println("\n== Tìm kiếm phần tử ==");
        System.out.println(queue.search("C"));
    }
}
