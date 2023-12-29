package bubbleGame.ex03;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.CharBuffer;

public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;
    private Player player;


    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }



    public BackgroundPlayerService(Player player) {
        this.player = player;
        try {
            image = ImageIO.read(new File("image/backgroundMapService.png"));

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public  void run() {
        while (true) {
            Color leftColor = new Color(image.getRGB(player.getX()-10, player.getY()+25));
            Color rightColor = new Color(image.getRGB(player.getX()+50+10, player.getY()+25));
            int bottomColor = image.getRGB(player.getX() + 50 + 10, player.getY() + 50 + 5);



            if (bottomColor != -1) {
                System.out.println("바텀:"+bottomColor);
                System.out.println("바닥 충돌");
                player.setDown(false);
            }

            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                System.out.println("왼쪽 벽에 출동");
                player.setLeftWallCrash(true);
                player.setLeft(false);
            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                System.out.println("오른쪽 벽에 출동");
                player.setRightWallCrash(true);
                player.setRight(false);
            } else {
                player.setLeftWallCrash(false);
                player.setRightWallCrash(false);
            }


            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public BackgroundPlayerService(BufferedImage image) {
        this.image = image;
    }

}
