package com.educluster.video_annotator.util;

import com.educluster.video_annotator.config.Config;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.channels.FileChannel;

/**
 *
 * @author Mahen Samaranayake
 */
public class CsvFileCtrl {

    private File csvFile;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    public CsvFileCtrl() {
        csvFile = new File(Config.CSV_FILE);
        try {
            File tempBackupsFolder = new File(Config.TEMP_BACKUPS_FOLDER);
            if (!tempBackupsFolder.exists()) {
                tempBackupsFolder.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            fileWriter = new FileWriter(csvFile);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(int imgNum, int[] presence, String action) {
        String line = imgNum + "";
        for (int i : presence) {
            line = line + "," + i;
        }
        line = line + "," + action;
        writeLine(line);
    }

    public void closeFile() {
        try {
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
        }
    }

    public String createStartupBackup() {
        return createBackup(Config.TEMP_BACKUPS_FOLDER);
    }

    public String createBackup() {
        return createBackup(null);
    }

    private String createBackup(String location) {
        try {
            String fileName = "output_" + System.nanoTime() + ".csv";
            if (location != null) {
                fileName = location + File.separator + fileName;
            }
            File destFile = new File(fileName);
            FileChannel src = new FileInputStream(csvFile).getChannel();
            FileChannel dest = new FileOutputStream(destFile).getChannel();
            dest.transferFrom(src, 0, src.size());
            return fileName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void writeLine(String line) {
        try {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
