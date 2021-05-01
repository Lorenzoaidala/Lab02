package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	AlienDictionary alienDictionary = new AlienDictionary();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtOutput;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtOutput.clear();
    	alienDictionary.doReset();
    	txtInput.clear();
    }

    @FXML
    void doTanslate(ActionEvent event) {
    	String riga = txtInput.getText();
		if(riga == null || riga.length() ==0) {
			txtOutput.setText("Devi inserire una parola");
			return;
		}
		StringTokenizer st = new StringTokenizer(riga, " ");
		if(!st.hasMoreTokens()) {
			txtOutput.setText("Devi inserire una parola");
			return;
		}

		String alienWord = st.nextToken();
		if(st.hasMoreTokens()) {
			String translation = st.nextToken();

			if(!alienWord.matches("[a-zA-z]*") || !translation.matches("[a-zA-z]*")) {
				txtOutput.setText("Devi inserire solo caratteri alfabetici");
	    		return;
			}
			alienDictionary.addWord(alienWord, translation);
			
			txtOutput.setText("La parola "+alienWord+" è stata aggiunta con traduzione "+translation+"\n");
		} else {
			if(!alienWord.matches("[a-zA-Z]*")) {
				txtOutput.setText("Devi inserire caratteri alfabetici");
	    		return;
			}
			String translation = alienDictionary.translateWord(alienWord);
			if(translation!=null)
				txtOutput.setText(translation);
			else {
				txtOutput.setText("La parola cercata non è presente");
    		return;
			}
		}
    }

    @FXML
    void initialize() {
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
