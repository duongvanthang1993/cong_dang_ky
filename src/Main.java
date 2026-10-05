public class Main {
    public static void main(String[] args) {
        System.out.println("--- Kiểm tra True Test Cases ---");
        for (String email : EmailTestCases.TRUE_TEST_CASES) {
            // Ở đây bạn có thể gọi hàm validate email tương tự như AccountValidator
            System.out.println("Email: " + email);
        }

        System.out.println("--- Kiểm tra False Test Cases ---");
        for (String email : EmailTestCases.FALSE_TEST_CASES) {
            System.out.println("Email: " + email);
        }
    }
}