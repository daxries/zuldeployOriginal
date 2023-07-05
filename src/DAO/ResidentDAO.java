package DAO;

/**
 * Author: FES 
 * Date: 15 January 2023
 * Purpose: CSC584 Assignment 2
 * Student name:
 * Student id:
 */
  
import java.sql.*;         
import java.util.*;
//import java.util.Date;


import Database.ConnectionManager;
import Model.Resident;
//import Model.*;

public class ResidentDAO {
	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	//private static String sql;
	private String residentId;
	private String residentUsername,residentPassword,residentName,residentAddress,residentEmail;
	private int residentPhoneNum;
	
	
	
	//for committee ONLY
	public static Resident getResidentDetail(String residentId) { 
		Resident resident = new Resident();
		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();

			/*
			//create statement
			ps = con.prepareStatement("SELECT * FROM shawl WHERE id=?");
			ps.setInt(1, id);
			
			//MYBAJU1
			ps = con.prepareStatement("SELECT * FROM orders WHERE orderId=?");
			ps.setInt(1, orderId);*/
			
			//MYBAJU2
			ps = con.prepareStatement("SELECT * FROM resident WHERE residentId=?");
			ps.setString(1, residentId);

			//execute query
			
			/*rs = ps.executeQuery();
			if(rs.next()) {
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setBrand(rs.getString("brand"));
			s.setColor(rs.getString("color"));
			s.setMaterial(rs.getString("material"));
			s.setPrice(rs.getDouble("price"));
			s.setQuantity(rs.getInt("quantity"));			
			}
			
			
			order.setOrderId(rs.getInt("orderId"));
			order.setAmount(rs.getDouble("amount"));
			order.setSleeve(rs.getFloat("sleeve"));
			order.setShoulder(rs.getFloat("shoulder"));
			order.setChest(rs.getFloat("chest"));
			order.setTopLength(rs.getFloat("topLength"));
			order.setWaist(rs.getFloat("waist"));
			order.setHip(rs.getFloat("hip"));
			order.setBottomLength(rs.getFloat("bottomLength"));
			order.setCustomerId(rs.getInt("customerId"));*/
			
			//mybaju2
			
			/*private String residentId;
			private String residentUsername,residentPassword,residentName,residentAddress,residentEmail;
			private int residentPhoneNum;
			*/
			
			rs = ps.executeQuery();
			if(rs.next()) {
			resident.setResidentId(rs.getString("residentId"));
			resident.setResidentName(rs.getString("residentName"));
			resident.setResidentUsername(rs.getString("residentUsername"));
			resident.setResidentPassword(rs.getString("residentPassword"));
			resident.setResidentAddress(rs.getString("residentAddress"));
			resident.setResidentEmail(rs.getString("residentEmail"));
			resident.setResidentPhoneNum(rs.getInt("residentPhoneNum"));
			
			//close connection
			con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resident; 
	}
	
	//resident will view profile based on their username instead of id 
	
	public static Resident getResidentProfile(String residentUsername) { 
		Resident resident = new Resident();
		try {
			//call getConnection() method
			con = ConnectionManager.getConnection();

			
			ps = con.prepareStatement("SELECT * FROM resident WHERE residentUsername=?");
			ps.setString(1, residentUsername);

			//execute query
			
			/*rs = ps.executeQuery();
			if(rs.next()) {
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setBrand(rs.getString("brand"));
			s.setColor(rs.getString("color"));
			s.setMaterial(rs.getString("material"));
			s.setPrice(rs.getDouble("price"));
			s.setQuantity(rs.getInt("quantity"));			
			}
			
			
			order.setOrderId(rs.getInt("orderId"));
			order.setAmount(rs.getDouble("amount"));
			order.setSleeve(rs.getFloat("sleeve"));
			order.setShoulder(rs.getFloat("shoulder"));
			order.setChest(rs.getFloat("chest"));
			order.setTopLength(rs.getFloat("topLength"));
			order.setWaist(rs.getFloat("waist"));
			order.setHip(rs.getFloat("hip"));
			order.setBottomLength(rs.getFloat("bottomLength"));
			order.setCustomerId(rs.getInt("customerId"));*/
			
			//mybaju2
			
			/*private String residentId;
			private String residentUsername,residentPassword,residentName,residentAddress,residentEmail;
			private int residentPhoneNum;
			*/
			
			rs = ps.executeQuery();
			if(rs.next()) {
			resident.setResidentId(rs.getString("residentId"));
			resident.setResidentName(rs.getString("residentName"));
			resident.setResidentUsername(rs.getString("residentUsername"));
			resident.setResidentPassword(rs.getString("residentPassword"));
			resident.setResidentAddress(rs.getString("residentAddress"));
			resident.setResidentEmail(rs.getString("residentEmail"));
			resident.setResidentPhoneNum(rs.getInt("residentPhoneNum"));
			
			//close connection
			con.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resident; 
	}

	//resident register new account 
		public void addResident(Resident bean) {
		
		residentId = bean.getResidentId();
		residentUsername = bean.getResidentUsername();
		residentName = bean.getResidentName();
		residentEmail = bean.getResidentEmail();
		residentPassword = bean.getResidentPassword();
		residentPhoneNum = bean.getResidentPhoneNum();
		residentAddress = bean.getResidentAddress();

		try {			
			//call getConnection() method
			con = ConnectionManager.getConnection();
			
			/*private String residentId;
			private String residentUsername,residentPassword,residentName,residentAddress,residentEmail;
			private int residentPhoneNum;
			*/
			
			//getting the number for the last patrolman (last inserted patrolman tu nombor berapa)
			 int trye = 0;
				ps = con.prepareStatement("SELECT residentnum FROM resident ORDER BY residentnum DESC LIMIT 1");
		
			//executing the query
				rs = ps.executeQuery();
				
			//putting the number into a variable called "trye" 
				if(rs.next()) {
					trye = rs.getInt("residentnum");}
					
			//setting the string part of the id, which should be start with "P"
			String depan = "";
				
			if (trye + 1 < 10)
			{
				depan = "RD00";
			}
			
			else if (trye + 1 >=10 && trye<100)
			{
				depan = "RD0";
			}
			
		
			int newtrye = trye + 1;
				
			String newid = depan + newtrye ;
	
			
			//create statement
			ps = con.prepareStatement("INSERT INTO resident(residentnum,residentId,residentUsername,residentPassword,residentName,residentAddress,residentEmail,residentPhoneNum)VALUES(?,?,?,?,?,?,?,?)");
			ps.setInt(1,newtrye);
			ps.setString(2,newid);
			ps.setString(3,residentUsername);
			ps.setString(4,residentPassword);
			ps.setString(5,residentName);
			ps.setString(6,residentAddress);
			ps.setString(7,residentEmail);
			ps.setInt(8,residentPhoneNum);

			//execute query
			ps.executeUpdate();
			System.out.println("Successfully inserted");

			//close connection
			con.close();

			} 
			
			catch(Exception e) {
			e.printStackTrace();				
			}
	}	

	//Complete deleteOrder() method
	//but in patrolman system takdak so takyah

	//Complete getCustomerOrders() method
		public static List<Resident> getResidentDetails() { 
			List<Resident> resident = new ArrayList<Resident>(); 
			try { 
				//call getConnection() method
				con = ConnectionManager.getConnection();

				//create statement
				stmt = con.createStatement();
				String sql = "SELECT * FROM resident ORDER BY residentId ";

				
				//execute query
				rs = stmt.executeQuery(sql);
					
				/*private String residentId;
				private String residentUsername,residentPassword,residentName,residentAddress,residentEmail;
				private int residentPhoneNum;
				*/
						while(rs.next()) {		//process result
							Resident s = new Resident();
							s.setResidentId(rs.getString("residentId"));
							s.setResidentUsername(rs.getString("residentUsername"));
							s.setResidentPassword(rs.getString("residentPassword"));
							s.setResidentName(rs.getString("residentName"));
							s.setResidentAddress(rs.getString("residentAddress"));
							s.setResidentEmail(rs.getString("residentEmail"));
							s.setResidentPhoneNum(rs.getInt("residentPhoneNum"));
							
							resident.add(s);
						}
				//close connection
						con.close();

				} 
				catch (Exception e) 
				{ 
				e.printStackTrace(); 
				}

				return resident; 
				}
	
	public void updateResident(Resident bean) {
		
		
		residentId = bean.getResidentId();
		residentUsername = bean.getResidentUsername();
		residentPassword = bean.getResidentPassword();
		residentName = bean.getResidentName();
		residentAddress = bean.getResidentAddress();
		residentEmail = bean.getResidentEmail();
		residentPhoneNum = bean.getResidentPhoneNum();
	
		try {			
			//call getConnection() method
			con = ConnectionManager.getConnection();
			
			//3. create statement
			ps = con.prepareStatement("UPDATE resident SET residentUsername=?,residentPassword=?,residentName=?,residentAddress=?,residentEmail=?,residentPhoneNum=? WHERE residentId=?");
			ps.setString(1, residentUsername);
			ps.setString(2, residentPassword);
			ps.setString(3, residentName);
			ps.setString(4, residentAddress);
			ps.setString(5, residentEmail);
			ps.setInt(6, residentPhoneNum);
			ps.setString(7, residentId);
			
			//4. execute query
			ps.executeUpdate();
			
			System.out.println("Successfully updated");
			
			//5. close connection
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	//log in
	
	public String authenticateUser(Resident resident)
    {
	
	
		
		String residentUsername = resident.getResidentUsername();
		String residentPassword = resident.getResidentPassword();
		
		String residentUsernameDB = "";
		String residentPasswordDB = "";
		
        try
        {
    
        	//con = ConnectionManagerStud.getConnection();
        	
        	con = ConnectionManager.getConnection();

			//create statement
			stmt = con.createStatement();
			String sql = "select * from resident";

			
			//execute query
			rs = stmt.executeQuery(sql);
			
         
			
			 while(rs.next()) // Until next row is present otherwise it return false
	            {
	             residentUsernameDB = rs.getString("residentUsername"); //fetch the values present in database
	             residentPasswordDB = rs.getString("residentPassword");

	              if(residentUsername.equals(residentUsernameDB) && residentPassword.equals(residentPasswordDB))
	              {
	                 return "SUCCESS"; ////If the user entered values are already present in the database, which means user has already registered so return a SUCCESS message.
	              }
	            }}
	            catch(SQLException e)
	            {
	               e.printStackTrace();
	            }
	            return "Invalid user credentials"; // Return appropriate message in case of failure
	        }
	

}
