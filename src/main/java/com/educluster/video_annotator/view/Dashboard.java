package com.educluster.video_annotator.view;

import com.educluster.video_annotator.config.Config;
import com.educluster.video_annotator.util.AlertUtils;
import com.educluster.video_annotator.util.CsvFileCtrl;
import com.educluster.video_annotator.util.ImageFileUtils;
import com.educluster.video_annotator.util.ImageUtils;
import com.educluster.video_annotator.util.VideoUtils;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JToggleButton;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Mahen Samaranayake
 */
public class Dashboard extends javax.swing.JFrame {

    private final VideoUtils videoUtils;
    private final ImageFileUtils imageFileUtils;
    private final CsvFileCtrl csvFileCtrl;
    private final DefaultComboBoxModel actionComboModel;
    private String seletedFilePath;
    private int frameIndex;
    private int frameCount;
    // private boolean[] objects_presence = {false, false, false, false, false};
    private JToggleButton[] labels;

    public Dashboard() {
        initComponents();
        seletedFilePath = null;
        csvFileCtrl = new CsvFileCtrl();
        videoUtils = new VideoUtils();
        imageFileUtils = new ImageFileUtils();
        actionComboModel = (DefaultComboBoxModel) actionCombo.getModel();
        setLabelsAndActions();
        this.setSize(1100, 700);
        reset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        videoTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        convertBtn = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        imageLabel = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        frameNoLabel = new javax.swing.JLabel();
        loadImagesBtn = new javax.swing.JButton();
        labelPanel = new javax.swing.JPanel();
        actionCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Annotator 1.0.0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Video (MP4)");

        videoTxt.setEditable(false);
        videoTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Open");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        convertBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        convertBtn.setText("Convert to Images");
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });

        progressBar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        progressBar.setStringPainted(true);

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageLabel.setPreferredSize(new java.awt.Dimension(800, 500));

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        frameNoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        frameNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameNoLabel.setText("Frame Number");
        frameNoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        loadImagesBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadImagesBtn.setText("Delete All Images");
        loadImagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImagesBtnActionPerformed(evt);
            }
        });

        labelPanel.setLayout(new java.awt.GridLayout(0, 1));

        actionCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        actionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(frameNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(videoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loadImagesBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(videoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(convertBtn))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loadImagesBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frameNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectFile();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
        convertToImages();
    }//GEN-LAST:event_convertBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        loadNextImage();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void loadImagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImagesBtnActionPerformed
        deleteAllImages();
    }//GEN-LAST:event_loadImagesBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> actionCombo;
    private javax.swing.JButton convertBtn;
    private javax.swing.JLabel frameNoLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel labelPanel;
    private javax.swing.JButton loadImagesBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField videoTxt;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        enableComponents(false);
        convertBtn.setEnabled(false);
        frameNoLabel.setText("");
        imageLabel.setIcon(null);
        frameIndex = -1;
        frameCount = -1;
        nextBtn.setText("Next");
        videoTxt.setText("");
        csvFileCtrl.closeFile();
        csvFileCtrl.createStartupBackup();
        csvFileCtrl.start();
        loadImagesBtn.setEnabled(true);
        frameCount = imageFileUtils.getImageCount();
        if (frameCount > 0) {
            enableComponents(true);
            loadNextImage();
        }
    }

    private void enableComponents(boolean enabled) {
        for (JToggleButton label : labels) {
            label.setEnabled(enabled);
        }
        nextBtn.setEnabled(enabled);
        resetObjectsPresence();
    }

    private void selectFile() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            reset();
            File selectedFile = jfc.getSelectedFile();
            seletedFilePath = selectedFile.getAbsolutePath();
            videoTxt.setText(seletedFilePath);
            convertBtn.setEnabled(seletedFilePath.endsWith(".mp4"));
        }
    }

    private void convertToImages() {
        convertBtn.setEnabled(false);
        loadImagesBtn.setEnabled(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                videoUtils.convertToImages(seletedFilePath, progressBar);
                if (frameCount == 0) {
                    AlertUtils.showError("An error occurred!");
                } else {
                    reset();
                }
            }
        }).start();
    }

    private void loadNextImage() {
        if (frameIndex >= 0) {
            csvFileCtrl.writeToFile(frameIndex + 1, getPresence(), (String) actionCombo.getSelectedItem());
            resetObjectsPresence();
        }
        if (frameIndex + 1 == frameCount) {
            nextBtn.setText("Finish");
            String fileName = csvFileCtrl.createBackup();
            AlertUtils.showAlert("Created backup " + fileName);
        } else {
            frameIndex++;
        }
        BufferedImage image = imageFileUtils.getVideoFrame(frameIndex + 1).getBufferedImage();
        int height = imageLabel.getHeight();
        int width = imageLabel.getWidth();
        if (image.getHeight() > height) {
            image = ImageUtils.resize(image, (image.getWidth() * height) / image.getHeight(), height);
        }
        if (image.getWidth() > width) {
            image = ImageUtils.resize(image, width, (image.getHeight() * width) / image.getWidth());
        }
        ImageIcon imageIcon = new ImageIcon(image);
        imageLabel.setIcon(imageIcon);
        frameNoLabel.setText((1 + frameIndex) + "/" + (frameCount));
        actionCombo.setSelectedIndex(0);
    }

    private int getInt(boolean b) {
        if (b) {
            return 1;
        } else {
            return 0;
        }
    }

    private int[] getPresence() {
        int[] presence = new int[labels.length];
        int index = 0;
        for (JToggleButton label : labels) {
            presence[index] = getInt(label.isSelected());
            index++;
        }
        return presence;
    }

    private void resetObjectsPresence() {
        for (JToggleButton label : labels) {
            label.setSelected(false);
            label.setBackground(Color.GRAY);
        }
    }

    private void deleteAllImages() {
        reset();
        convertBtn.setEnabled(false);
        loadImagesBtn.setEnabled(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                imageFileUtils.deleteAllImages(progressBar);
                AlertUtils.showAlert("Deleted!");
            }
        }).start();
    }

    private void setLabelsAndActions() {
        String[] objectNames = Config.OBJECTS;
        labels = new JToggleButton[objectNames.length];
        int index = 0;
        for (String objectName : objectNames) {
            labels[index] = new JToggleButton(objectName);
            labels[index].setFont(new Font("Tahoma", 1, 18));
            labels[index].setOpaque(true);
            labels[index].setBackground(Color.GRAY);
            labels[index].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    clickLabel(evt);
                }
            });
            labelPanel.add(labels[index]);
            index++;
        }
        String[] actionNames = Config.ACTIONS;
        actionComboModel.removeAllElements();
        for (String actionName : actionNames) {
            actionComboModel.addElement(actionName);
        }
    }

    private void clickLabel(ActionEvent evt) {
        JToggleButton label = (JToggleButton) evt.getSource();
        if (label.isSelected()) {
            label.setBackground(Color.GREEN.darker());
        } else {
            label.setBackground(Color.GRAY);
        }
    }
}
