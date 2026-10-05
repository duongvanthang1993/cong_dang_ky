public class EmailTestCases {

    // Nhóm 1: Các trường hợp thực tế PHẢI hợp lệ (True-Cases)
    public static final String[] TRUE_TEST_CASES = {
            "user.name@domain.com", // Chứa dấu chấm ở local-part
            "user+tag@domain.co.uk", // Chứa dấu cộng (+) và TLD dạng compound (.co.uk)
            "123@domain.org" // Local-part hoàn toàn là số
    };

    // Nhóm 2: Các trường hợp sai chuẩn PHẢI bị từ chối (False-Cases)
    public static final String[] FALSE_TEST_CASES = {
            "@domain.com", // Thiếu hoàn toàn local-part
            "user@.com", // Thiếu tên miền chính (domain name)
            "user@domain", // Thiếu phần mở rộng TLD
            "user@domain.123", // TLD chứa toàn số (không hợp lệ theo chuẩn thông thường)
            "user @domain.com" // Chứa khoảng trắng ẩn (whitespace)
    };
}