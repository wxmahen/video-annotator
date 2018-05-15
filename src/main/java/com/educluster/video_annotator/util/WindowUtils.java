package com.educluster.video_annotator.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class WindowUtils {

    public static void setSize(JFrame frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int weight = (int) dimension.getWidth() - 50;
        int height = (int) dimension.getHeight() - 50;
        frame.setMaximumSize(new Dimension(weight, height));
    }
}
