import java.util.UUID;

public class CustomerRepository {
    public static void save(Customer customer) {
        // Реализация сохранения заказа в базе данных
        System.out.println("Сохранение пользователя в базе данных");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Card Type: " + customer.getCardType());
        System.out.println("Payment Method: " + customer.getPaymentMethod());
    }
}
