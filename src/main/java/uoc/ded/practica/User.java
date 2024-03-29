package uoc.ded.practica;

public class User {
private String idUser;
private String name;
private String surname;
private int points;

public User (String idUser, String name, String surname) {
	this.set(name,surname);
	this.setPoints(points);
}

public void set(String name, String surname) {
	this.name=name;
	this.surname=surname;
}
public void setPoints(int points) {
	this.points=points;
}

public String getIdUser() {
	return idUser;
}

public void setIdUser(String idUser) {
	this.idUser = idUser;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public int getPoints() {
	return points;
}

}
