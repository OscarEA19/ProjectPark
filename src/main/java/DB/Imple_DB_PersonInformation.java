package DB;

import java.sql.*;

public class Imple_DB_PersonInformation implements I_DB_Method {

	public void select() {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/proyectpark?serverTimezone=UTC",
					"root", "root");

			String sql = "SELECT * FROM personalinformation ";

			PreparedStatement ps = connect.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int dni_person = rs.getInt("dni_person");
				String password = rs.getString("password");
				String email = rs.getString("email");
				String name = rs.getString("name");
				String surname = rs.getString("surname");
				String secondsurname = rs.getString("secondsurname");
				boolean status = rs.getBoolean("status");
				int id_roles = rs.getInt("id_roles");

				System.out.printf("[%d, %s, %s, %s, %s, %s, %b, %d ]", dni_person, password, email, name, surname,
						secondsurname, status, id_roles);
			}
			rs.close();
			ps.close();
			connect.close();

			System.out.println("success");

		} catch (SQLException e) {

			System.err.println("ERROR:DB Connection");
		}

	}

	public void insert(int dni_person,String password,String email,String name,String surname,String secondsurname,boolean status,int id_roles) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/proyectpark?serverTimezone=UTC",
					"root", "root");

			String sql = "INSERT INTO personalinformation(dni_person,password,email,name,surname,secondsurname,status,id_roles VALUES (?,?,?,?,?,?,?,?)";

			PreparedStatement ps = connect.prepareStatement(sql);
			
			ps.setInt(1, dni_person);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setString(4, name);
			ps.setString(5, surname);
			ps.setString(6, secondsurname);
			ps.setBoolean(7, status);
			ps.setInt(8, id_roles);
			
			
			

			
			ps.close();
			connect.close();

			System.out.println("success");
		} catch (SQLException e) {
			System.err.println("ERROR:DB Connection");
		}

	}

	public void update(int specialDNI,int dni_person,String password,String email,String name,String surname,String secondsurname,boolean status,int id_roles) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/proyectpark?serverTimezone=UTC",
					"root", "root");

			String sql = "UPDATE personalinformation SET dni_person=?,password=?,email=?,name=?,surname=?,secondsurname=?,status=?,id_roles=? WHERE specialDNI=?";

			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setInt(1, specialDNI);
			ps.setInt(2, dni_person);
			ps.setString(3, password);
			ps.setString(4, email);
			ps.setString(5, name);
			ps.setString(6, surname);
			ps.setString(7, secondsurname);
			ps.setBoolean(8, status);
			ps.setInt(9, id_roles);
			
			
			

			
			ps.close();
			connect.close();

			System.out.println("success");
		} catch (SQLException e) {
			System.err.println("ERROR:DB Connection");
		}

		

	}

	public void delete(int specialDNI) {
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/proyectpark?serverTimezone=UTC",
					"root", "root");

			String sql = "DELETE FROM personalinformation WHERE dni_person=?";

			PreparedStatement ps = connect.prepareStatement(sql);
			ps.setInt(1, specialDNI);
			
			
			ps.close();
			connect.close();

			System.out.println("success");
		} catch (SQLException e) {
			System.err.println("ERROR:DB Connection");
		}


	}

}
