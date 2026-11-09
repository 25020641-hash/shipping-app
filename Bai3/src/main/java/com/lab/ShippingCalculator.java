package main.java.com.lab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {
    private static final Logger logger = LoggerFactory.getLogger(ShippingCalculator.class);

    public double calculate(double weight, String type) {
        logger.info("Tính phí vận chuyển: weight={}, type={}", weight, type);

        if (weight <= 0) {
            logger.error("Lỗi: Khối lượng không hợp lệ");
            throw new IllegalArgumentException("Weight must be positive");
        }
        if ("EXPRESS".equals(type)) {
            return weight * 5000 + 20000;
        }
        if ("STANDARD".equals(type)) {
            return weight * 3000;
        }
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
