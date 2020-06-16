package com.educluster.video_annotator.run;

import com.educluster.video_annotator.config.Config;
import com.educluster.video_annotator.util.AlertUtils;
import com.educluster.video_annotator.view.Dashboard;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

/**
 *
 * @author Mahen Samaranayake
 */
public class Startup {

    public static void main(String[] args) {
        new Startup().setConfigurations();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    private void setConfigurations() {
        URL root = getClass().getProtectionDomain().getCodeSource().getLocation();
        try {
            URL propertiesFile = new URL(root, "config.properties");
            Properties properties = new Properties();
            properties.load(propertiesFile.openStream());
            String objects = properties.getProperty("objects");
            Config.OBJECTS = objects.split(",");
            String actions = properties.getProperty("actions");
            Config.ACTIONS = actions.split(",");
        } catch (Exception e) {
            AlertUtils.showAlert(e.getMessage());
            e.printStackTrace();
        }
    }
}
