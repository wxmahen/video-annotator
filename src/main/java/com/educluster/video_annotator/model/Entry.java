package com.educluster.video_annotator.model;

/**
 *
 * @author Mahen Samaranayake
 */
public class Entry {

    private final int imgNum;
    private int[] presence;
    private String action;

    public Entry(int imgNum, int[] presence, String action) {
        this.imgNum = imgNum;
        this.presence = presence;
        this.action = action;
    }

    public int getImgNum() {
        return imgNum;
    }

    public int[] getPresence() {
        return presence;
    }

    public String getAction() {
        return action;
    }

    public void setPresence(int[] presence) {
        this.presence = presence;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
