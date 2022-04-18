package sk.stuba.fei.uim.oop;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class Logic implements ActionListener {

    private JFrame frame;

    public Logic(JFrame frame) {
        this.frame = frame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        FileDialog fd = new FileDialog(frame,"Diaolg na vyber suboru",FileDialog.SAVE);
        fd.setDirectory("C:\\");
        fd.setFile("mojFile.txt");
        fd.setVisible(true);

        String filename = fd.getFile();
        if (filename == null) {
            System.out.println("Zrusil si vyber");
        }else {
            System.out.println("Miesto ulozenia: " + fd.getDirectory() + filename);
            try {
                FileOutputStream fos = new FileOutputStream(fd.getDirectory() + filename);
                OutputStreamWriter out = new OutputStreamWriter(fos);
                PrintWriter toFile = new PrintWriter(out);

                toFile.println("Toto je zapis do suboru");
                toFile.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
}
