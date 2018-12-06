package login;

import employee.Role;

public class SessionController {
	private static Role currentRole = Role.NONE;
	
	private SessionController() {
		
	}

	public static Role getCurrentRole() {
		return currentRole;
	}

	public static void setCurrentRole(Role currentRole) {
		SessionController.currentRole = currentRole;
	}
	
	
}
