package akiba_banking_system.model;

public class User {
	
	String name;
	String password;
	
	
public User() {
	// TODO Auto-generated constructor stub
}

public User(	String name,
String password) {

	this.name =name;
	this.password=password;
	
}

public String getName() {
	return name;
}

public String getPassword() {
	return password;
}

public void setName(String name) {
	this.name = name;
}
public void setPassword(String password) {
	this.password = password;
}
	

}
