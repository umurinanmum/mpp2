package question2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainPanelController {

	@FXML
	private TextField input;

	@FXML
	private TextField output;

	@FXML
	protected void count(ActionEvent actionEvent) {
		if (input.getText() != null) {
			output.setText(input.getText().length() + "");
		}
	}

	@FXML
	protected void reverse(ActionEvent actionEvent) {
		if (input.getText() != null) {
			StringBuilder result = new StringBuilder(input.getText());
			result = result.reverse();
			output.setText(result.toString());
		}
	}

	@FXML
	protected void removeDup(ActionEvent actionEvent) {
		if (input.getText() != null) {
			LinkedHashSet<Character> list = input.getText().chars().mapToObj(l -> (char) l).collect(Collectors.toCollection(LinkedHashSet:: new ));
		    
			String removeDup = "";
			for(Character c:list) {
				removeDup += c + "";
			}
			output.setText(removeDup);
		}
	}

}
