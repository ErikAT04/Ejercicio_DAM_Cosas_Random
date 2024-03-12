package org.example.programaxd;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controladores implements Initializable {
    String[] generos = {"Hombre", "Mujer", "Prefiero no contestar"};

    @FXML
    private CheckBox bilboCB;

    @FXML
    private RadioButton bombaRB;

    @FXML
    private CheckBox cineCB;

    @FXML
    private TextArea enviarTA;

    @FXML
    private CheckBox estafarCB;

    @FXML
    private ComboBox generoComBox;

    @FXML
    private RadioButton helicopteroRB;

    @FXML
    private TextArea jefeTA;

    @FXML
    private CheckBox matarCB;

    @FXML
    private TextField nombreTF;

    @FXML
    private ToggleGroup queEsLaImagen;

    @FXML
    private RadioButton tiburonRB;

    @FXML
    void onEnviarButton(ActionEvent event) {
        String textDef = "Opciones elegidas: \n";
        if (Objects.equals(jefeTA.getText(), "")){
            textDef = textDef + "No me has respondido a si quieres ser tu propio jefe >:( \n";
        } else {
            textDef += "Texto sin sentido sobre si quieres ser tu propio jefe: \n '" + jefeTA.getText() +"'\n";
        }
        if(queEsLaImagen.getSelectedToggle()==null){
            textDef += "No me has dicho que es la imagen, indignante >:(";
        } else {
            RadioButton seleccionado = (RadioButton) queEsLaImagen.getSelectedToggle();
            textDef += "Opción de imagen elegida: " + seleccionado.getText() + ". BUENA OPCIÓN :D \n";
        }
        if(bilboCB.isSelected()||cineCB.isSelected()||matarCB.isSelected()||estafarCB.isSelected()){
            textDef += "Tus Hobbies son: \n" +
                    ((bilboCB.isSelected()) ? bilboCB.getText() +"\n":"") +
                    ((cineCB.isSelected())? cineCB.getText() + "\n": "") +
                    ((matarCB.isSelected())? matarCB.getText() + "\n":"") +
                    ((estafarCB.isSelected())? estafarCB.getText() + "\n":"");
        } else {
            textDef += "Parece ser que no tienes hobbies con nosotros >:(\n";
        }
        if(nombreTF.getText().isEmpty()){
            textDef += "No sabemos tu nombre, ¿qué nos ocultas?\n";
        } else {
            textDef += "Buen nombre, " + nombreTF.getText() + ".\n";
        }
        if (generoComBox.getValue()==null){
            textDef += "¿No te gustan nuestros generos?\n";
        } else {
            textDef += "Genero elegido: " + generoComBox.getValue();
        }
        enviarTA.setText(textDef);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generoComBox.getItems().addAll(generos);
    }
}