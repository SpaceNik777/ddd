import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // Создание покупателя
        CustomerFactory customerFactory = new CustomerFactory();
        Customer customer = customerFactory.createCustomer(
                "Никита Сергеевич",
                "nikita@mail.ru",
                "Mir",
                "Debit Card"
        );



        // Адрес
        Address address = new Address("Москва", "Тверская", "12345");

        // Заказ
        OrderFactory orderFactory = new OrderFactory();
        List<Product> products = new ArrayList<>();
        Product product = new Product("Product 1");
        Product product2 = new Product("Product 2");
        products.add(product);
        products.add(product2);
        Order order = orderFactory.createOrder(
                "New",
                products,
                address
        );

        CustomerRepository.save(customer);

        OrderRepository.save(order);
    }
}