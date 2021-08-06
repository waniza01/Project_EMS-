/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class ImagePanel extends JPanel {

    private BufferedImage img;

    public void load(String path) throws IOException {
        img = ImageIO.read(new File(path));
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        if (img != null) {
            g.drawImage(img, 0, 0, null);
        }
    }
}
