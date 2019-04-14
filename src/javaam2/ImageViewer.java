package javaam2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ImageViewer extends JFrame {
    private JFileChooser fileChooser;
    private ImagePanel imagePanel;
    public ImageViewer(){
        super("Image Viewer Java");
        fileChooser = new JFileChooser(System.getProperty("user.dir"));
        makeMenuBar();
        Container c = getContentPane();
        imagePanel = new ImagePanel();
        c.add(imagePanel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    private void makeMenuBar(){
        int shortcut_mask = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, shortcut_mask)); //Control-O

        openItem.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                File f = chooseImage();
                if(f != null)
                    imagePanel.displayImage(f);
                pack();
            }
        });
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, shortcut_mask)); //Control-Q
        quitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        fileMenu.add(quitItem);
    }

    private File chooseImage() {
        int returnVal = fileChooser.showOpenDialog(null);
        if(returnVal != JFileChooser.APPROVE_OPTION)
            return null;
        return fileChooser.getSelectedFile();
    }

    public static void main(String args[]) {
        new ImageViewer();
    }
}