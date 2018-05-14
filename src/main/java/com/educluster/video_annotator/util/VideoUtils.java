package com.educluster.video_annotator.util;

import java.awt.image.BufferedImage;
import javax.swing.JProgressBar;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

/**
 *
 * @author Mahen Samaranayake
 */
public class VideoUtils {

    ImageFileUtils imageFileUtil;

    public VideoUtils() {
        imageFileUtil = new ImageFileUtils();
    }

    public int convertToImages(String mp4Path, JProgressBar progressBar) {
        progressBar.setValue(0);
        int frameCount = 0;
        try {
            Java2DFrameConverter converter = new Java2DFrameConverter();
            FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(mp4Path);
            frameGrabber.start();
            Frame frame;
            int imgNum = 0;
            frameCount = frameGrabber.getLengthInFrames();
            for (int ii = 1; ii <= frameCount; ii++) {
                imgNum++;
                frameGrabber.setFrameNumber(ii);
                frame = frameGrabber.grab();
                BufferedImage bi = converter.convert(frame);
                imageFileUtil.saveImage(bi, imgNum);
                progressBar.setValue(100 * ii / frameCount);
                ii += 1;
            }
            progressBar.setValue(100);
            frameGrabber.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return frameCount;
    }
}
