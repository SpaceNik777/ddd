import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderFactory {
    public Order createOrder(String status, List<Product> products, Address address) {
        UUID id = UUID.randomUUID();
        LocalDateTime createdAt = LocalDateTime.now();
        if (address == null || address.getCity().isEmpty() || address.getStreet().isEmpty() || address.getPostCode().isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым.");
        }
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("Заказ должен содержать хотя бы один товар.");
        }

        return new Order(id, createdAt, status, products, address);
    }
}
