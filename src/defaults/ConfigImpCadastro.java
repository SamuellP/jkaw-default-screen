package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ConfigImpCadastro {
  public ConfigImpCadastro() throws Exception {
    new SwingEngine(this).render("swix/ConfigImpCadastro.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ConfigImpCadastro();
  }
}
