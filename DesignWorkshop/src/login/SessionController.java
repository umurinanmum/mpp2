package login;

import employee.Role;

public class SessionController {
	public static Role currentRole;
	
	private SessionController() {
		
	}

	public static Role getCurrentRole() {
		return currentRole;
	}

	public static void setCurrentRole(Role currentRole) {
		SessionController.currentRole = currentRole;
	}
	
	
}
