public class OrderRepository {
    public static void save(Order order) {
        // Реализация сохранения заказа в базе данных
        System.out.println("Сохранение заказа в базе данных");
        System.out.println("ID заказа: " + order.getId());
        System.out.println("Время создания заказа: " + order.getCreatedAt());
        System.out.println("Статус: " + order.getStatus());
        System.out.println("Товары: " + order.getProducts());
        System.out.println("Адрес: " + order.getAddress().getCity() + ", " + order.getAddress().getStreet() + ", " + order.getAddress().getPostCode());
    }

}