package za.ac.cput.domain;

public class Console {
    private String consoleName;
    private String consoleCreator;
    private int consoleAge;

    private Console(){
    }

    private Console(Builder build) {
        this.consoleName = build.consoleName;
        this.consoleCreator = build.consoleCreator;
        this.consoleAge = build.consoleAge;
    }

    public String getConsoleName() {
        return consoleName;
    }

    public String getConsoleCreator() {
        return consoleCreator;
    }

    public int getConsoleAge() {
        return consoleAge;
    }

    @Override
    public String toString() {
        return "Console{" +
                "consoleName='" + consoleName + '\'' +
                ", consoleCreator='" + consoleCreator + '\'' +
                ", consoleAge=" + consoleAge +
                '}';
    }


    public static class Builder {
        private String consoleName;
        private String consoleCreator;
        private int consoleAge;

        public Builder setConsoleName(String consoleName) {
            this.consoleName = consoleName;
            return this;
        }

        public Builder setConsoleCreator(String consoleCreator) {
            this.consoleCreator = consoleCreator;
            return this;
        }

        public Builder setConsoleAge(int consoleAge) {
            this.consoleAge = consoleAge;
            return this;
        }

        public Console build(){
            return new Console(this);
        }
    }//end of builder class
}//end of class
