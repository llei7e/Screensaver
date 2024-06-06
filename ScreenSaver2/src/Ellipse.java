import javax.swing.*;
import java.awt.*;

public class Ellipse extends Rectangle {

    @Override
    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillOval(super.getX(), super.getY(),super.getWidth(), super.getHeight());
         /*
        super.getX() -> Função da Classe Base (Classe pai que é herdada pelas outras);
        super.getY() -> Função da Classe Base (Classe pai que é herdada pelas outras);
        super.getWidth() -> Função da Classe Pai Rectangle (Classe pai da classe Ellipse);
        super.getHeight() -> Função da Classe Pai Rectangle (Classe pai da classe Ellipse);
         */
    }
}
