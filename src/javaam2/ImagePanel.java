package javaam2;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

/**
 * ImagePanel
 */
public class ImagePanel extends JPanel {
    private int width,height;
    private BufferedImage panelImage;

    public ImagePanel(){
        width = 360;
        height = 240;
        panelImage = null;
        setBackground(Color.WHITE);
    }

    public void displayImage(File f) {
        BufferedImage image = loadImage(f);
        if(image != null){
            width = image.getWidth();
            height = image.getHeight();
            panelImage = image;
            invalidate();
            repaint(); //redrawing when new Image
        }
    }

    private BufferedImage loadImage(File imageFile) {
        try {
            BufferedImage image = ImageIO.read(imageFile);
            if(image == null || (image.getWidth() < 0))
                return null;
            return image;
        } catch (IOException e) {
            return null;
        }
    }

    public Dimension getPreferredSize(){
        return new Dimension(width,height);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension size = getSize();
        g.clearRect(0, 0, size.width, size.height);
        if(panelImage != null)
            g.drawImage(panelImage,0,0,null);
    }
}