package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListaPrecos {
  public ListaPrecos() throws Exception {
    new SwingEngine(this).render("swix/ListaPrecos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListaPrecos();
  }
}
