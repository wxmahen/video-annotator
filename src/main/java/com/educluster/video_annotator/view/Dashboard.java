package com.educluster.video_annotator.view;

import com.educluster.video_annotator.config.Config;
import com.educluster.video_annotator.model.VideoFrame;
import com.educluster.video_annotator.util.AlertUtils;
import com.educluster.video_annotator.util.CsvFileCtrl;
import com.educluster.video_annotator.util.ImageFileUtils;
import com.educluster.video_annotator.util.ImageUtils;
import com.educluster.video_annotator.util.VideoUtils;
import com.educluster.video_annotator.util.WindowUtils;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
    private final String convertButtonName = "Convert to Images";
    private final String noFrameText = "No Frame";
    private String seletedFilePath;
    private int frameIndex;
    private int frameCount;
    private JToggleButton[] objectLabels;
    private JToggleButton[] actionLabels;

    public Dashboard() {
        initComponents();
        seletedFilePath = null;
        csvFileCtrl = new CsvFileCtrl();
        videoUtils = new VideoUtils();
        imageFileUtils = new ImageFileUtils();
        setLabelsAndActions();
        WindowUtils.setSize(this);
        reset();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actionLabelGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        videoTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        convertBtn = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        nextBtn = new javax.swing.JButton();
        loadImagesBtn = new javax.swing.JButton();
        objectsPanel = new javax.swing.JPanel();
        nextImageLabel = new javax.swing.JLabel();
        frameNoLabel1 = new javax.swing.JLabel();
        actionsPanel = new javax.swing.JPanel();
        frameNoLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        frameNoLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        frameNoLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Video Annotator 1.0.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exit(evt);
            }
        });

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

        nextBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        loadImagesBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadImagesBtn.setText("Refresh");
        loadImagesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImagesBtnActionPerformed(evt);
            }
        });

        objectsPanel.setLayout(new java.awt.GridLayout(0, 1));

        nextImageLabel.setBackground(java.awt.Color.darkGray);
        nextImageLabel.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        nextImageLabel.setForeground(java.awt.Color.white);
        nextImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextImageLabel.setText("No Frame");
        nextImageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nextImageLabel.setOpaque(true);
        nextImageLabel.setPreferredSize(new java.awt.Dimension(800, 500));

        frameNoLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        frameNoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameNoLabel1.setText("Objects");
        frameNoLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        actionsPanel.setLayout(new java.awt.GridLayout(0, 1));

        frameNoLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        frameNoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameNoLabel2.setText("Actions");
        frameNoLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        frameNoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        frameNoLabel.setForeground(java.awt.Color.blue);
        frameNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameNoLabel.setText("Frame Number");
        frameNoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        imageLabel.setBackground(java.awt.Color.darkGray);
        imageLabel.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        imageLabel.setForeground(java.awt.Color.white);
        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setText("No Frame");
        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageLabel.setOpaque(true);
        imageLabel.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(frameNoLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(frameNoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        frameNoLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        frameNoLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameNoLabel3.setText("Next Frame");
        frameNoLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(videoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loadImagesBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(objectsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frameNoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(frameNoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(nextImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frameNoLabel3, javax.swing.GroupLayout.Alignment.LEADING))))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(frameNoLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frameNoLabel1)
                            .addComponent(frameNoLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(objectsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_PERIOD, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Next Frame");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Delete All Images");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
        openFile();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
        convertToImages();
    }//GEN-LAST:event_convertBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        loadNextImage();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void loadImagesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImagesBtnActionPerformed
        reset();
    }//GEN-LAST:event_loadImagesBtnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        deleteAllImages();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        loadNextImage();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        openFile();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        exit();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void exit(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exit
        exit();
    }//GEN-LAST:event_exit

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup actionLabelGroup;
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JButton convertBtn;
    private javax.swing.JLabel frameNoLabel;
    private javax.swing.JLabel frameNoLabel1;
    private javax.swing.JLabel frameNoLabel2;
    private javax.swing.JLabel frameNoLabel3;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loadImagesBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel nextImageLabel;
    private javax.swing.JPanel objectsPanel;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField videoTxt;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        enableComponents(false);
        convertBtn.setText(convertButtonName);
        convertBtn.setEnabled(false);
        frameNoLabel.setText("");
        imageLabel.setIcon(null);
        nextImageLabel.setIcon(null);
        imageLabel.setText(noFrameText);
        nextImageLabel.setText(noFrameText);
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
        for (JToggleButton label : objectLabels) {
            label.setEnabled(enabled);
        }
        for (JToggleButton label : actionLabels) {
            label.setEnabled(enabled);
        }
        nextBtn.setEnabled(enabled);
        resetObjectAndActionPresence();
    }

    private void openFile() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            reset();
            File selectedFile = jfc.getSelectedFile();
            seletedFilePath = selectedFile.getAbsolutePath();
            videoTxt.setText(seletedFilePath);
            boolean isMp4 = seletedFilePath.endsWith(".mp4");
            convertBtn.setEnabled(isMp4);
            if (!isMp4) {
                AlertUtils.showWarning("Selected video should be an MP4 file.");
            }
        }
    }

    private void convertToImages() {
        if (convertBtn.getText().equals(convertButtonName)) {
            convertBtn.setText("Stop");
            loadImagesBtn.setEnabled(false);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    videoUtils.convertToImages(seletedFilePath, progressBar);
                    reset();
                }
            }).start();
        } else if (AlertUtils.showConfirmation("Are you sure you want to stop this?")) {
            videoUtils.stopConverting();
        }
    }

    private void loadNextImage() {
        if (frameIndex >= 0) {
            csvFileCtrl.writeToFile(frameIndex + 1, getObjectPresence(), getSelectedAction());
            resetObjectAndActionPresence();
        }
        if (frameIndex + 1 == frameCount) {
            nextBtn.setText("Finish");
            String fileName = csvFileCtrl.createBackup();
            AlertUtils.showAlert("Created backup " + fileName);
        } else {
            frameIndex++;
        }
        VideoFrame videoFrame = imageFileUtils.getVideoFrame(frameIndex + 1);
        setImageIcon(videoFrame, imageLabel);
        VideoFrame nextVideoFrame = imageFileUtils.getVideoFrame(frameIndex + 2);
        setImageIcon(nextVideoFrame, nextImageLabel);
        frameNoLabel.setText((1 + frameIndex) + "/" + (frameCount));
    }

    private void setImageIcon(VideoFrame videoFrame, JLabel label) {
        if (videoFrame != null) {
            BufferedImage image = videoFrame.getBufferedImage();
            int height = label.getHeight() - 10;
            int width = label.getWidth() - 10;
            if (image.getHeight() > height) {
                image = ImageUtils.resize(image, (image.getWidth() * height) / image.getHeight(), height);
            }
            if (image.getWidth() > width) {
                image = ImageUtils.resize(image, width, (image.getHeight() * width) / image.getWidth());
            }
            ImageIcon imageIcon = new ImageIcon(image);
            label.setIcon(imageIcon);
            label.setText(null);
        } else {
            label.setIcon(null);
            label.setText(noFrameText);
        }
    }

    private int getInt(boolean b) {
        if (b) {
            return 1;
        } else {
            return 0;
        }
    }

    private int[] getObjectPresence() {
        int[] presence = new int[objectLabels.length];
        int index = 0;
        for (JToggleButton label : objectLabels) {
            presence[index] = getInt(label.isSelected());
            index++;
        }
        return presence;
    }

    private String getSelectedAction() {
        String actionName = null;
        for (JToggleButton label : actionLabels) {
            if (label.isSelected()) {
                actionName = label.getText();
                break;
            }
        }
        return actionName;
    }

    private void resetObjectAndActionPresence() {
        for (JToggleButton label : objectLabels) {
            label.setSelected(false);
            label.setBackground(Color.GRAY);
        }
        for (JToggleButton label : actionLabels) {
            label.setSelected(false);
            label.setBackground(Color.GRAY);
        }
        actionLabels[0].setSelected(true);
        actionLabels[0].setBackground(Color.GREEN.darker());
    }

    private void deleteAllImages() {
        if (AlertUtils.showConfirmation("Are your sure you want to delete all the images?")) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    imageFileUtils.deleteAllImages(progressBar);
                    reset();
                    convertBtn.setEnabled(false);
                    loadImagesBtn.setEnabled(false);
                    AlertUtils.showAlert("Deleted!");
                }
            }).start();
        }
    }

    private void setLabelsAndActions() {
        String[] objectNames = Config.OBJECTS;
        objectLabels = new JToggleButton[objectNames.length];
        int index = 0;
        for (String objectName : objectNames) {
            objectLabels[index] = getLabel(objectName);
            objectLabels[index].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    clickObjectLabel(evt);
                }
            });
            objectsPanel.add(objectLabels[index]);
            index++;
        }
        String[] actionNames = Config.ACTIONS;
        actionLabels = new JToggleButton[actionNames.length];
        index = 0;
        for (String actionName : actionNames) {
            actionLabels[index] = getLabel(actionName);
            actionLabels[index].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    clickActionLabel(evt);
                }
            });
            actionLabelGroup.add(actionLabels[index]);
            actionsPanel.add(actionLabels[index]);
            index++;
        }
    }

    private JToggleButton getLabel(String text) {
        JToggleButton jToggleButton = new JToggleButton(text);
        jToggleButton.setFont(new Font("Tahoma", 1, 16));
        jToggleButton.setOpaque(true);
        jToggleButton.setBackground(Color.GRAY);
        return jToggleButton;
    }

    private void clickObjectLabel(ActionEvent evt) {
        JToggleButton label = (JToggleButton) evt.getSource();
        if (label.isSelected()) {
            label.setBackground(Color.GREEN.darker());
        } else {
            label.setBackground(Color.GRAY);
        }
    }

    private void clickActionLabel(ActionEvent evt) {
        for (JToggleButton actionLabel : actionLabels) {
            actionLabel.setBackground(Color.GRAY);
        }
        JToggleButton label = (JToggleButton) evt.getSource();
        if (label.isSelected()) {
            label.setBackground(Color.GREEN.darker());
        }
    }

    private void exit() {
        if (AlertUtils.showConfirmation("Are you sure you want to exit?")) {
            videoUtils.stopConverting();
            System.exit(0);
        }
    }
}
