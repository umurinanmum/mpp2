package member;
 
import DAL.DataAccessImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class MemberController {
	
	public static Integer memberID=0;
	public static DataAccessImpl<Integer,Member> memberdal=new DataAccessImpl<Integer,Member>();
	
	@FXML
	private TextField fname;
	@FXML
	private TextField lname;
	@FXML
	private TextField email;
	@FXML
	private TextField phone;
	@FXML
	private TextField street;
	@FXML
	private TextField city;
	@FXML
	private TextField state;
	@FXML
	private TextField zip;
	@FXML
	private TextField fnameedit;
	@FXML
	private TextField lnameedit;
	@FXML
	private TextField emailedit;
	@FXML
	private TextField phoneedit;
	@FXML
	private TextField streetedit;
	@FXML
	private TextField cityedit;
	@FXML
	private TextField stateedit;
	@FXML
	private TextField zipedit;
	@FXML
	private TextField memberid;

	

	@FXML
	protected void AddMember(ActionEvent actionevent)
	{
		try
		{
			if(fname.getText().trim().isEmpty() || fname.getText()==null || lname.getText().trim().isEmpty() || lname.getText()==null || 
					email.getText()==null ||email.getText().trim().isEmpty()|| phone.getText()==null|| phone.getText().trim().isEmpty()||
					street.getText()==null || street.getText().trim().isEmpty()
					||city.getText()==null||city.getText().trim().isEmpty()||state.getText().trim().isEmpty()
					||state.getText()==null||zip.getText()==null||zip.getText().trim().isEmpty())
				throw new Exception();
		}
		catch (Exception e)
		{
			Alert alert = new Alert(AlertType.ERROR,"All fields must not be empty!");
			alert.show();
			return;
		}
		
		
		Member mb=new Member();
		Address st=new Address();
		mb.setId(++memberID);		
		mb.setName(fname.getText());
		mb.setSurname(lname.getText());
		mb.setEmail(email.getText());
		mb.setPhone(phone.getText());
		st.setStreet(street.getText());
		st.setCity(city.getText());
		st.setState(state.getText());
		st.setZip(zip.getText());
		mb.setAddress(st);
		memberdal.add(memberID, mb);
		System.out.println("member added");
	}
	
	@FXML
	protected void GetMember(ActionEvent actionevent)
	{
		Integer id=0;
		try
		{
		 id=Integer.parseInt(memberid.getText());
		}
		catch(Exception e)
		{
			Alert alert = new Alert(AlertType.ERROR,"Member id must be a number!");
			alert.show();
			return;
		}
		
		try
		{
		if(id>memberID)
			throw new Exception();
		}
		catch(Exception e)
		{
			Alert alert = new Alert(AlertType.ERROR,"Member id doesn't exist");
			alert.show();
			return;
		}
		Member mb=memberdal.get(id);
		
		fnameedit.setText(mb.getName());
		lnameedit.setText(mb.getSurname());
		emailedit.setText(mb.getEmail());
		phoneedit.setText(mb.getPhone());
		streetedit.setText(mb.getAddress().getStreet());
		cityedit.setText(mb.getAddress().getCity());
		stateedit.setText(mb.getAddress().getState());
		zipedit.setText(mb.getAddress().getZip());
		
		System.out.println("member get");
	}
	
	@FXML
	protected void SaveMember(ActionEvent actionevent)
	{
		Integer id=0;
		try
		{
		 id=Integer.parseInt(memberid.getText());
		}
		catch(Exception e)
		{
			Alert alert = new Alert(AlertType.ERROR,"Member id must be a number!");
			alert.show();
			return;
		}
		
		try
		{
		if(id>memberID)
			throw new Exception();
		}
		catch(Exception e)
		{
			Alert alert = new Alert(AlertType.ERROR,"Member id doesn't exist");
			alert.show();
			return;
		}
		
		try
		{
			if(fnameedit.getText().trim().isEmpty() || fnameedit.getText()==null || lnameedit.getText().trim().isEmpty() || lnameedit.getText()==null || 
					emailedit.getText()==null ||emailedit.getText().trim().isEmpty()|| phoneedit.getText()==null|| phoneedit.getText().trim().isEmpty()||
					streetedit.getText()==null || streetedit.getText().trim().isEmpty()
					||cityedit.getText()==null||cityedit.getText().trim().isEmpty()||stateedit.getText().trim().isEmpty()
					||stateedit.getText()==null||zipedit.getText()==null||zipedit.getText().trim().isEmpty())
				throw new Exception();
		}
		catch (Exception e)
		{
			Alert alert = new Alert(AlertType.ERROR,"All fields must not be empty!");
			alert.show();
			return;
		}
		
		Member mb=memberdal.get(id);
		mb.setName(fnameedit.getText());
		mb.setSurname(lnameedit.getText());
		mb.setEmail(emailedit.getText());
		mb.setPhone(phoneedit.getText());
		mb.getAddress().setStreet(streetedit.getText());
		mb.getAddress().setCity(cityedit.getText());
		mb.getAddress().setState(stateedit.getText());
		mb.getAddress().setZip(zipedit.getText());
		
		System.out.println("member saved");
		for(Integer i=1;i<=memberID;i++)
		{
			System.out.println(memberdal.get(i).getName()+ " "+memberdal.get(i).getSurname());
		}
	}
	
	@FXML
	protected void clear(ActionEvent actionevent)
	{
		fname.setText("");
		lname.setText("");
		email.setText("");
		phone.setText("");
		street.setText("");
		city.setText("");
		state.setText("");
		zip.setText("");
	}
	
	@FXML
	protected void clearEdit(ActionEvent actionevent)
	{
		fnameedit.setText("");
		lnameedit.setText("");
		emailedit.setText("");
		phoneedit.setText("");
		streetedit.setText("");
		cityedit.setText("");
		stateedit.setText("");
		zipedit.setText("");
	}
}
