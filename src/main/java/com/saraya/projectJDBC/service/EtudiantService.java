package com.saraya.projectJDBC.service;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.saraya.projectJDBC.model.Etudiant;
@Service
public class EtudiantService {
	Connection conn = null;
	Statement stmt = null;
	ResultSet result = null;
	PreparedStatement preStmt = null;
	
	public Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant","root", "root");
				
			}catch(ClassNotFoundException ex){
				
				ex.printStackTrace();
			}
			return conn;
		}

	public List<Etudiant> etudiants = new ArrayList<>();
	
	   public List<Etudiant> listEtudiant(){
		  
		   
		   String requete = "select * from etudiant";
		   try {
			   stmt = getConnection().createStatement();
			   result = stmt.executeQuery(requete);
			   while(result.next()) {
				   int id = result.getInt("id");
				   String nom = result.getString("nom");
				   String prenom = result.getString("prenom");
				   int age = result.getInt("age");
				   String niveau = result.getString("niveau");
				   
				   Etudiant etud = new Etudiant();
				   
				   etud.setId(id);
				   etud.setNom(nom);
				   etud.setPrenom(prenom);
				   etud.setAge(age);
				   etud.setNiveau(niveau);
				   
				   etudiants.add(etud);
				   
			   }
			   
		   }catch(SQLException ex) {
			   
			   ex.printStackTrace();
			   
		   }finally {
			   try{
				  if(result!=null) 
					  result.close();
				  if(stmt !=null)
					  stmt.close();
				  if(getConnection() !=null)
					  getConnection().close();
				  
			   }catch(SQLException e) {
				   
			   }
		   }
		   
		   return etudiants;
		   
	   }
	   
	   
	   public void addEtudiants(Etudiant etudiant) throws SQLException {
		   
		   String requete = "insert into etudiant (nom,prenom,age,niveau) values (?,?,?,?)";
		   try{
			   
			   preStmt = getConnection().prepareStatement(requete);
			   preStmt.setString(1, etudiant.getNom());
			   preStmt.setString(2, etudiant.getPrenom());
			   preStmt.setInt(3, etudiant.getAge());
			   preStmt.setString(4, etudiant.getNiveau());
			   
			   preStmt.executeUpdate();
			   
		   }catch(SQLException ex) {
			   
			   conn.rollback();
		   }finally {
			   
			   try{
					  if(preStmt!=null) 
						  preStmt.close();
					  
					  if(getConnection() !=null)
						  getConnection().close();
				  }catch(SQLException ex) {
					ex.printStackTrace();
				}
		  }
	   
	   
	   }
	   
	   
	   public Etudiant findById(int id){
			
			for(Etudiant etud:etudiants) {
				if(etud.getId()==id) {
					return etud;
				}
				
			}
			return null;
		}
	   
	public void updateEtudiant(Etudiant etudiant,int Id) throws SQLException {
			   
			   String requete = "update etudiant set nom =?,prenom =?,age =?,niveau =? where id=Id";
			   try{
				   
				   preStmt = getConnection().prepareStatement(requete);
				   preStmt.setString(1, etudiant.getNom());
				   preStmt.setString(2, etudiant.getPrenom());
				   preStmt.setInt(3, etudiant.getAge());
				   preStmt.setString(4, etudiant.getNiveau());
				   
				   
				   preStmt.executeUpdate();
				   
			   }catch(SQLException ex) {
				   
				   ex.printStackTrace();
			   }finally {
				   
				   try{
					   
					   if(preStmt!=null) 
							  preStmt.close();
						  
						  if(getConnection() !=null)
							  getConnection().close();
					  }catch(SQLException ex) {
						ex.printStackTrace();
					}
			  }
		   
			   
			   
		   }
	
	
	
	public void deleteEtud(int Id) {
		
		String requete = "delete from etudiant where id =Id ";
		
		try{
			   
			   preStmt = getConnection().prepareStatement(requete);
			   
			   preStmt.executeUpdate();
			   
		   }catch(SQLException ex) {
		
		ex.printStackTrace();
	}finally {
		   
		   try{
				  
				  
				  if(getConnection() !=null)
					  getConnection().close();
			  }catch(SQLException ex) {
				ex.printStackTrace();
			}
	  }

		   
	}	   
		   
	}
		   
		  
	
