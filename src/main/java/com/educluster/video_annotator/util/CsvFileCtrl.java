package com.educluster.video_annotator.util;

import com.educluster.video_annotator.config.Config;
import com.educluster.video_annotator.model.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahen Samaranayake
 */
public class CsvFileCtrl {

    private File csvFile;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private List<Entry> entries;

    public CsvFileCtrl() {
        entries = null;
        csvFile = new File(Config.CSV_FILE);
        try {
            File tempBackupsFolder = new File(Config.TEMP_BACKUPS_FOLDER);
            if (!tempBackupsFolder.exists()) {
                tempBackupsFolder.mkdir();
            }
            if (entries == null) {
                entries = new ArrayList<>();
            } else {
                entries.clear();
            }
            restoreFromFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addToEntries(int imgNum, int[] presence, String action) {
        if (entries.size() < imgNum) {
            entries.add(new Entry(imgNum, presence, action));
        } else {
            Entry entry = entries.get(imgNum - 1);
            entry.setPresence(presence);
            entry.setAction(action);
        }
    }

    public void writeToFile() {
        try {
            fileWriter = new FileWriter(csvFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Entry entry : entries) {
                String line = entry.getImgNum() + "";
                for (int i : entry.getPresence()) {
                    line = line + "," + i;
                }
                line = line + "," + entry.getAction();
                writeLine(line);
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Entry getEntry(int index) {
        if (index < entries.size()) {
            return entries.get(index);
        } else {
            return null;
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
            return null;
        }
    }

    private void writeLine(String line) {
        try {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void restoreFromFile() {
        if (csvFile.exists()) {
            try {
                fileReader = new FileReader(csvFile);
                bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] values = line.split(",");
                    int imgNum = Integer.parseInt(values[0]);
                    String action = values[values.length - 1];
                    int[] objects = new int[values.length - 2];
                    for (int i = 1; i < values.length - 1; i++) {
                        objects[i - 1] = Integer.parseInt(values[i]);
                    }
                    Entry entry = new Entry(imgNum, objects, action);
                    entries.add(entry);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
