package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Video;

import static org.junit.jupiter.api.Assertions.*;

class VideoFactoryTest {

    private static Video v1 =  VideoFactory.createVideo("Fighter", "Toppo", 60, "Education");

    @Test
    public void testCreateVideo() {
        assertNotNull(v1);

        System.out.println(v1.toString());
    }

}