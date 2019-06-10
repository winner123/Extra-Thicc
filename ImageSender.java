import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class ImageSender
{
    private final int DEFAULT_WIDTH = 400;
    private final int DEFAULT_HEIGHT = 400;
    private final Color BACK_COLOR = Color.WHITE;
    int[][] pixels;


    public void loadImage(String s)
    {
        pixels = new int[400][400];
        String[] pixelsRGB = s.split("-");
        int count = 0;
        for(int i = 0; i < 400; i++)
        {
            for(int j = 0; j < 400; j++)
            {
                pixels[i][j] = Integer.parseInt(pixelsRGB[count]);
                count++;
            }
        }
    }

    public BufferedImage createImage(int[][] pixels)
    {
        BufferedImage gay = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
        for(int i = 0; i < 400; i++)
        {
            for(int j = 0; j < 400; j++)
            {
                gay.setRGB(i, j, pixels[i][j]);
            }
        }
        return gay;
    }
}