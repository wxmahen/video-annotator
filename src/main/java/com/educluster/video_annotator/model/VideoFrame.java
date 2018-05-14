package com.educluster.video_annotator.model;

import java.awt.image.BufferedImage;

/**
 *
 * @author Mahen Samaranayake
 */
public class VideoFrame {

    private final Integer id;
    private final BufferedImage bufferedImage;

    public VideoFrame(Integer id, BufferedImage bufferedImage) {
        this.id = id;
        this.bufferedImage = bufferedImage;
    }

    public Integer getId() {
        return id;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
}
