package za.ac.cput.domain;

public class Car {
    private String carName;
    private String carModel;
    private String carBrand;
    private String carColour;
    private int CarYear;

    private Car() {
    }

    private Car(Builder build) {
        this.carName = build.carName;
        this.carModel = build.carModel;
        this.carBrand = build.carBrand;
        this.carColour = build.carColour;
        this.CarYear = build.CarYear;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void setCarYear(int carYear) {
        CarYear = carYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carColour='" + carColour + '\'' +
                ", CarYear=" + CarYear +
                '}';
    }

    public static class Builder {
        private String carName;
        private String carModel;
        private String carBrand;
        private String carColour;
        private int CarYear;

        public Builder setCarName(String carName) {
            this.carName = carName;
            return this;
        }

        public Builder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public Builder setCarBrand(String carBrand) {
            this.carBrand = carBrand;
            return this;
        }

        public Builder setCarColour(String carColour) {
            this.carColour = carColour;
            return this;
        }

        public Builder setCarYear(int carYear) {
            this.CarYear = carYear;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }//end of builder
}//end of class
