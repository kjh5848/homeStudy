package bubbleGame.ex03;



import javax.swing.*;


public class Player extends JLabel implements Moveable {


    private int x;
    private int y;

    private PlayerWay playerWay;

    public PlayerWay getPlayerWay() {
        return playerWay;
    }

    public void setPlayerWay(PlayerWay playerWay) {
        this.playerWay = playerWay;
    }

    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private boolean leftWallCrash;
    private boolean rightWallCrash;

    private final int SPEED = 4;
    private final int JUMPSPEED = 2;

    private ImageIcon playerR, playerL;


    public boolean isLeftWallCrash() {
        return leftWallCrash;
    }

    public void setLeftWallCrash(boolean leftWallCrash) {
        this.leftWallCrash = leftWallCrash;
    }

    public boolean isRightWallCrash() {
        return rightWallCrash;
    }

    public void setRightWallCrash(boolean rightWallCrash) {
        this.rightWallCrash = rightWallCrash;
    }



    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getJUMPSPEED() {
        return JUMPSPEED;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

    public Player() {
        initObject();
        initSetting();
        initBackgroundPlayerService();
    }

    private void initObject() {
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");

    }

    private void initSetting() {
        x = 80;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;

        leftWallCrash = false;
        rightWallCrash = false;


        playerWay = playerWay.RIGHT;
        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);
    }

    private void initBackgroundPlayerService() {
        new Thread((new BackgroundPlayerService(this))).start();
    }
    @Override
    public void left() {
        //System.out.println("left");
        playerWay = playerWay.LEFT;
        left = true;
        new Thread(() -> {
            while (left) {
                setIcon(playerL);
                x = x - SPEED;
                setLocation(x, y);
                try {
                    Thread.sleep(8);
                } catch (InterruptedException e) {
                    e.printStackTrace();;
                }
            }

        }).start();


    }

    @Override
    public void right() {
        //System.out.println("right");
        playerWay = playerWay.RIGHT;
        right = true;
        new Thread(() -> {
            while (right) {
                setIcon(playerR);
                x = x + SPEED;
                setLocation(x, y);
                try {
                    Thread.sleep(8);
                } catch (InterruptedException e) {
                    e.printStackTrace();;
                }
            }
        }).start();

    }

    @Override
    public void up() {
        //System.out.println("up");
        up = true;
        new Thread(() -> {
            for (int i = 0; i < 130/JUMPSPEED; i++) {
                y= y-JUMPSPEED;
                setLocation(x, y);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();;
                }
            }

            up = false;
            down();

        }).start();

    }


    @Override
    public void down() {
        down = true;

        new Thread(() -> {
            while (down) {
                y= y+JUMPSPEED;
                setLocation(x, y);
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }

        }).start();
    }

}


