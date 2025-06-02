package za.ac.cput.domain;

public class Contacts {
    private String contactNumber;
    private String homeAddress;

    private Contacts() {
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    private Contacts(Builder build) {
        this.contactNumber = build.contactNumber;
        this.homeAddress = build.homeAddress;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contactNumber=" + contactNumber +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }

    public static class Builder {
        private String contactNumber;
        private String homeAddress;

        public Builder setContactNumber(String contactNumber){
            this.contactNumber =  contactNumber;
            return this;
        }

        public Builder setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
                    return this;
        }

        public Contacts build(){
            return new Contacts(this);
        }
    }
}//end of class
