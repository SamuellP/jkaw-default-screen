package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Banco {
  public Banco() throws Exception {
    new SwingEngine(this).render("swix/Banco.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Banco();
  }
}
