package za.ac.cput.domain;

public class Adventurers {
    private int adventurerId;
    private String firstName;
    private String lastName;
    private String Race;
    private int age;

    private Adventurers() {
    }

    private Adventurers(Builder build) {
        this.adventurerId = build.adventuerId;
        this.firstName = build.firstName;
        this.lastName = build.lastName;
        this.Race = build.Race;
        this.age = build.age;
    }

    public int getAdventurerId() {
        return adventurerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRace() {
        return Race;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Adventurers{" +
                "adventurerId=" + adventurerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Race='" + Race + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private int adventuerId;
        private String firstName;
        private String lastName;
        private String Race;
        private int age;

        public Builder setAdventuerId(int adventuerId) {
            this.adventuerId = adventuerId;
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

        public Builder setRace(String race) {
            Race = race;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Adventurers build() {
            return new Adventurers(this);
        }
    }
}//end of class
