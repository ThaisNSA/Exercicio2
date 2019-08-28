

package Cinema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;


public class FilmeController implements Initializable {
    
    private Label label;
    @FXML
    private CheckBox checkAcao;
    @FXML
    private CheckBox checkTerror;
    @FXML
    private CheckBox checkRomance;
    @FXML
    private CheckBox checkComedia;
    @FXML
    private RadioButton RadioJumangi;
    @FXML
    private ToggleGroup RadioButtonsVerAgora;
    @FXML
    private RadioButton RadioTitanic;
    @FXML
    private RadioButton RadioNenhum;
    @FXML
    private Label Respostas;
    @FXML
    private TextArea textArea;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     void Salvar(ActionEvent event) {
        String n = " ";
        String e = " ";
        if(checkAcao.isSelected()){
            //getText retorna o text do checkbox
            n += checkAcao.getText()+e;
        }
        
        if(checkTerror.isSelected()){
            n += checkTerror.getText()+e;
        }
        
        if(checkRomance.isSelected()){
            n += checkRomance.getText()+e;
        }
        
        if(checkComedia.isSelected()){
            n += checkComedia.getText()+e;
        }
        
        
        String m = " ";
        
        if(RadioJumangi.isSelected()){
            
            m =RadioJumangi.getText();
        }
        
        if(RadioTitanic.isSelected()){
            
            m = RadioTitanic.getText();
        }
        
        if(RadioNenhum.isSelected()){
            
            m = RadioNenhum.getText();
        }
        
        String x = " ";
        
        x += textArea.getText();
        
        Respostas.setText("Os generos de filmes que você prefere são: "+n+"\nO filme que você gostaria de ver é: "+m+"\nSua opinião: "+x);
        
    }
    
}
