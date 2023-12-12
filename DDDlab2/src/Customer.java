import java.lang.module.ModuleDescriptor;
import java.util.UUID;

public class Customer {

    public Customer (UUID id, String name, String email, String cardType, String paymentMethod){
        if (id == null) {
            throw new IllegalArgumentException("Идентификатор покупателя не может быть пустым.");
        }
        this.id = id;
        this.name = name;
        this.email = email;
        this.cardType = cardType;
        this.paymentMethod = paymentMethod;
    }
    private UUID id;
    private String name;
    private String email;
    private String cardType;
    private String paymentMethod;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
