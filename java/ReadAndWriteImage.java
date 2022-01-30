import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ReadAndWriteImage {
    public static void main(String[] args) {
        URL url = null;

        BufferedImage image;

        try {
            url = new URL("https://newevolutiondesigns.com/images/freebies/black-wallpaper-16.jpg");
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }

        try {
            assert url != null;
            image = ImageIO.read(url);
            ImageIO.write(image, "jpg", new File("C:/Users/ayush/Desktop/output.jpg"));
            ImageIO.write(image, "png", new File("C:/Users/ayush/Desktop/output.png"));
            ImageIO.write(image, "gif", new File("C:/Users/ayush/Desktop/output.gif"));
            ImageIO.write(image, "bmp", new File("C:/Users/ayush/Desktop/output.bmp"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Downloaded the Image");
    }
}
