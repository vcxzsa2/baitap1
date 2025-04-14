package buoi3;

public class bai1 {
        private int front, rear, size;
        private int capacity;
        private String a[];

        // Hàm khởi tạo hàng đợi với kích thước cho trước
        public bai1(int capacity) {
            this.capacity = capacity;
            a = new String[capacity];
            front = 0;
            rear = 0;
            size = 0;
        }

        // Thêm phần tử x vào cuối hàng đợi
        public void enQueue(String x) {
            if (size == capacity) {
                System.out.println("Hàng đợi đầy");
            } else {
                rear = (rear + 1) % capacity; // Đảm bảo quay vòng khi tới cuối mảng
                a[rear] = x;
                size++;
                System.out.println(x);
            }

            // Time Complexity: O(1)
            // Space Complexity: O(1)
        }

        // Xóa phần tử ở đầu hàng đợi (front)
        public String deQueue() {
            if (size == 0) {
                return "Hàng đợi rỗng";
            }
            String item = a[front];
            front = (front + 1) % capacity;
            size++;
            return item;
        }
        // Time Complexity: O(1)
        // Space Complexity: O(1)

        // hiển thị phần tử ở đầu hàng đợi
        public String peek() {
            if (size == 0) {
                return "Hàng đợi rỗng";
            }
            return a[front];
        }
        // Time Complexity: O(1)
        // Space Complexity: O(1)

        // Tìm kiếm phần tử x trong hàng đợi
        public String search(String x) {
            if (size == 0) {
                return "Hàng đợi rỗng";
            }

            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                if (a[index].equals(x)) {
                    return "Phần tử " + x + " nằm ở vị trí thứ " + i + " trong hàng đợi.";
                }
            }
            return "Không tìm thấy " + x;
        }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    }

