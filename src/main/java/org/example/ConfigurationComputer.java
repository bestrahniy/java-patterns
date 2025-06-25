package org.example;

public final class ConfigurationComputer {

    private String processor;
    private int ram;
    private String mainbroad;
    private int ssd;
    private String videoCard;

    private ConfigurationComputer(Builder builder) {
        processor = builder.processor;
        ram = builder.ram;
        mainbroad = builder.mainbroad;
        ssd = builder.ssd;
        videoCard = builder.videoCard;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public String getMainbroad() {
        return mainbroad;
    }

    public String getProcessor() {
        return processor;
    }

    public String getVideCard() {
        return videoCard;
    }

    public static class Builder {

        private String processor = "";
        private int ram = 0;
        private String mainbroad = "";
        private int ssd = 0;
        private String videoCard = "";

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder mainbroad(String mainbroad) {
            this.mainbroad = mainbroad;
            return this;
        }

        public Builder ssd(int ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder videoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public ConfigurationComputer build() {
            return new ConfigurationComputer(this);
        }

    }

}
