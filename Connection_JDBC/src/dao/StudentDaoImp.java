package dao;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.jdbc.PreparedStatement;

import model.Student;

public class StudentDaoImp implements StudentDao {

	private DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	 
	@Override
	public int save(Student st) throws Exception {
		Connection con=ds.getConnection();
			java.sql.PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, st.getId());
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getAddress());
			int i=ps.executeUpdate();
		con.close();
				
		return i;
	}

	@Override
	public boolean update(Student st) throws Exception {
		Connection con=ds.getConnection();
				//update
			con.close();
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		Connection con=ds.getConnection();
				//delete
			con.close();
		return false;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		Connection con=ds.getConnection();
				//findById
			con.close();
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		Connection con=ds.getConnection();
				//findByName
			con.close();
		return null;
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		Connection con=ds.getConnection();
				//findByEmail
			con.close();
		return null;
	}

	@Override
	public List<Student> findByAddress(String address) throws Exception {
		Connection con=ds.getConnection();
				//findByAddress
			con.close();
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		Connection con=ds.getConnection();
				//findAll
			con.close();
		return null;
	}

}
