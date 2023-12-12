import java.util.UUID;

public class CustomerFactory {
    public Customer createCustomer(String name, String email, String cardType, String paymentMethod) {
        UUID id = UUID.randomUUID();
        if (name == null || email == null || cardType == null || paymentMethod == null){
            throw new IllegalArgumentException("Все поля должны быть заполнены");
        }
        return new Customer(id, name, email, cardType, paymentMethod);
    }
}
