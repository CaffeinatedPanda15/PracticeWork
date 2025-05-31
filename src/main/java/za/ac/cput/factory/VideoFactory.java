package za.ac.cput.factory;

import za.ac.cput.domain.Video;
import za.ac.cput.util.Helper;

public class VideoFactory {
    public static Video createVideo(String videoTitle, String videoCreator, int videoLength, String videoType) {
        if (Helper.isNullorEmpty(videoTitle) || Helper.isNullorEmpty(videoCreator) || Helper.isNullorEmpty(videoType))
            return null;
        return new Video.Builder()
                .setVideoTitle(videoTitle)
                .setVideoCreator(videoCreator)
                .setVideoLength(videoLength)
                .setVideoType(videoType)
                .build();
    }
}//end of class
