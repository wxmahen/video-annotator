package com.educluster.video_annotator.util;

import com.educluster.video_annotator.config.Config;
import com.educluster.video_annotator.model.VideoFrame;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JProgressBar;

/**
 *
 * @author Mahen Samaranayake
 */
public class ImageFileUtils {
    
    public ImageFileUtils() {
        try {
            File imageFolder = new File(Config.IMAGE_FOLDER);
            if (!imageFolder.exists()) {
                imageFolder.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void saveImage(BufferedImage bufferedImage, int imgNum) {
        try {
            String path = Config.IMAGE_FOLDER + File.separator + Config.IMAGE_PREFIX + imgNum + Config.IMAGE_EXT;
            ImageIO.write(bufferedImage, "jpg", new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int getImageCount() {
        int count = 0;
        try {
            File[] files = new File(Config.IMAGE_FOLDER).listFiles();
            count = files.length;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public VideoFrame getVideoFrame(int imgNum) {
        VideoFrame videoFrame = null;
        try {
            String fileName = Config.IMAGE_FOLDER + File.separator + Config.IMAGE_PREFIX + imgNum + Config.IMAGE_EXT;
            File file = new File(fileName);
            if (file.exists()) {
                BufferedImage bufferedImage = ImageIO.read(file);
                videoFrame = new VideoFrame(imgNum, bufferedImage);
            }
        } catch (Exception e) {
        }
        return videoFrame;
    }
    
    public void deleteAllImages(JProgressBar progressBar) {
        progressBar.setValue(0);
        try {
            File[] files = new File(Config.IMAGE_FOLDER).listFiles();
            int size = files.length;
            int number = 1;
            for (File file : files) {
                progressBar.setValue(100 * (number - 1) / size);
                if (!file.delete()) {
                    file.deleteOnExit();
                }
                number++;
            }
            progressBar.setValue(100);
        } catch (Exception e) {
            AlertUtils.showError(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
