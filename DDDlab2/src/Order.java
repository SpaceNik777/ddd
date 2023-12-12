import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    public Order(UUID id, LocalDateTime createdAt, String status, List<Product> products, Address address) {
        if (id == null) {
            throw new IllegalArgumentException("Идентификатор заказа не может быть пустым.");
        }

        if (address == null || address.getCity().isEmpty() || address.getStreet().isEmpty() || address.getPostCode().isEmpty()) {
            throw new IllegalArgumentException("Адрес не может быть пустым.");
        }
        if (products == null || products.isEmpty()) {
            throw new IllegalArgumentException("Заказ должен содержать хотя бы один товар.");
        }
        this.id = id;
        this.status = status;
        this.products = products;
        this.address = address;
        this.createdAt = createdAt;
    }

    private UUID id;
    private LocalDateTime createdAt;
    private String status;
    private List<Product> products;
    private Address address;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }



    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
