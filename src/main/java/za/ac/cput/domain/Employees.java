package za.ac.cput.domain;

public class Employees {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private Employees() {
    }

    private Employees(Builder build) {
        this.employeeId = build.employeeId;
        this.firstName = build.firstName;
        this.lastName = build.lastName;
        this.email = build.email;
        this.phoneNumber = build.phoneNumber;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static class Builder {
        private String employeeId;
        private String firstName;
        private String lastName;
        private String email;
        private int phoneNumber;

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Employees build() {
            return new Employees(this);
        }

        public Builder copy(Employees employee) {
            this.employeeId = employee.employeeId;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.email = employee.email;
            this.phoneNumber =  employee.phoneNumber;
            return this;
        }
    }
}//end of class
