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

    private boolean converting = false;
    private ImageFileUtils imageFileUtil;

    public VideoUtils() {
        imageFileUtil = new ImageFileUtils();
    }

    public String getFrameRate(String mp4Path) {
        try {
            Java2DFrameConverter converter = new Java2DFrameConverter();
            FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(mp4Path);
            return Double.toString(frameGrabber.getFrameRate());
        } catch (Exception e) {
            return null;
        }
    }

    public void convertToImages(String mp4Path, JProgressBar progressBar, Integer skipFrames) {
        converting = true;
        progressBar.setValue(0);
        try {
            Java2DFrameConverter converter = new Java2DFrameConverter();
            FFmpegFrameGrabber frameGrabber = new FFmpegFrameGrabber(mp4Path);
            frameGrabber.start();
            Frame frame;
            int imgNum = 0;
            int frameCount = frameGrabber.getLengthInFrames();
            for (int ii = 1; ii <= frameCount; ii++) {
                if (converting) {
                    imgNum++;
                    frameGrabber.setFrameNumber(ii);
                    frame = frameGrabber.grab();
                    BufferedImage bi = converter.convert(frame);
                    imageFileUtil.saveImage(bi, imgNum);
                    progressBar.setValue(100 * ii / frameCount);
                    ii += (skipFrames + 1);
                } else {
                    break;
                }
            }
            progressBar.setValue(100);
            frameGrabber.stop();
            converting = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopConverting() {
        converting = false;
    }
}
