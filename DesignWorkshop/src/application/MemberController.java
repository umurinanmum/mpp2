package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import member.Member;

public class MemberController {

	@FXML
	protected void AddMember(ActionEvent actionevent)
	{
		System.out.println("member added");
	}
	
	@FXML
	protected Member GetMember(ActionEvent actionevent)
	{
		System.out.println("member get");
		return new Member();
	}
	
	@FXML
	protected void SaveMember(ActionEvent actionevent)
	{
		System.out.println("member edited");
	}
}
