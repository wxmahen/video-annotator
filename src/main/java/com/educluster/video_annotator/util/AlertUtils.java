package com.educluster.video_annotator.util;

import javax.swing.JOptionPane;

public class AlertUtils {

    public static String title = "Confirmation";
    public static boolean option;

    public static boolean showConfirmation(String message) {
        int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION);
        return result == 0;
    }

    public static void showAlert(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void showWarning(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }
}
