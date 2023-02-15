
package funcionesJuego;

import java.awt.Image;
import javax.swing.ImageIcon;


public class ImageFunctions {
    
    private Images images;
    
    public ImageFunctions(){
        images= new Images();
    }
    public ImageIcon mcWalking(int sequence, int width, int height){
        Image img = images.getMain_Character_Walking(sequence).getImage();
        ImageIcon icon = new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
        return icon;
    }
    
    
}
