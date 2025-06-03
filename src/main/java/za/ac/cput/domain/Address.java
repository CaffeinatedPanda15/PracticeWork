package za.ac.cput.domain;

public class Address {

    private String AddressId;

    private String street;

    private String city;

    private String postalCode;

    private Address() {

    }

    private Address(Builder builder) {
        this.AddressId = builder.AddressId;
        this.street = builder.street;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
    }

    public String getAddressId() {
        return AddressId;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public static class Builder {
        private String AddressId;
        private String street;
        private String city;
        private String postalCode;

        public Builder setAddressId(String addressId) {
            this.AddressId = addressId;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

        public Builder copy(Address address) {
            this.AddressId = address.AddressId;
            this.street = address.street;
            this.city = address.city;
            this.postalCode = address.postalCode;
            return this;
        }
    }


}
