package DB;

public interface I_DB_Method {
	public void update(int specialDNI,int dni_person,String password,String email,String name,String surname,String secondsurname,boolean status,int id_roles);
	public void delete(int specialDNI);
	public void select();
	public void insert(int dni_person,String password,String email,String name,String surname,String secondsurname,boolean status,int id_roles);
}
