public class Address {
    public Address(String city, String street, String postCode){
        if (city.isEmpty() || street.isEmpty() || postCode.isEmpty()) {
            throw new IllegalArgumentException("Все поля адреса должны быть заполнены.");
        }
        this.city = city;
        this.street = street;
        this.postCode = postCode;
    }

    private String city;
    private String street;
    private String postCode;

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
