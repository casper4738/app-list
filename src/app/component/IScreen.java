/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.component;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.imgscalr.Scalr;

/**
 *
 * @author Casper
 */
public class IScreen extends JPanel {

    private BufferedImage image = null;

    public IScreen() throws IOException {
        setOpaque(false);
        image = ImageIO.read(getClass().getResource("/app/resources/2.jpg"));
        this.image = image;
        setPreferredSize(getDim());
        
        JButton button = new JButton(" Hapus ");
        button.setLocation(0, 0);
        add(button);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    public Dimension getDim() {
        BufferedImage bufferedImage = Scalr.resize(image,
                Scalr.Method.SPEED, Scalr.Mode.FIT_TO_HEIGHT,
                250, 100,
                Scalr.OP_ANTIALIAS);
//        System.out.println("");
//        System.out.println(bufferedImage.getWidth());
//        System.out.println(bufferedImage.getHeight());
        return new Dimension(bufferedImage.getWidth(), bufferedImage.getHeight());
    }

}
