package za.ac.cput.domain;

public class Video {
    private String videoTitle;
    private String videoCreator;
    private int videoLength;
    private String videoType;

    private Video(){

    }

    private Video(Builder build){
        this.videoTitle = build.videoTitle;
        this.videoCreator = build.videoCreator;
        this.videoLength = build.videoLength;
        this.videoType = build.videoType;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoCreator() {
        return videoCreator;
    }

    public int getVideoLength() {
        return videoLength;
    }

    public String getVideoType() {
        return videoType;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoTitle='" + videoTitle + '\'' +
                ", videoCreator='" + videoCreator + '\'' +
                ", videoLength=" + videoLength +
                ", videoType='" + videoType + '\'' +
                '}';
    }

    public static class Builder {
        private String videoTitle;
        private String videoCreator;
        private int videoLength;
        private String videoType;

        public Builder setVideoTitle(String videoTitle){
            this.videoTitle = videoTitle;
            return this;
        }

        public Builder setVideoCreator(String videoCreator){
            this.videoCreator = videoCreator;
            return this;
        }

        public Builder setVideoLength(int videoLength){
            this.videoLength = videoLength;
            return this;
        }

        public Builder setVideoType(String videoType){
            this.videoType = videoType;
            return this;
        }

       public Video build(){
            return new Video(this);
       }

    }//end of builder class
}//end of class
