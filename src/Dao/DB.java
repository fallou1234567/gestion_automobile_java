/*
 * To change this template, choose Tools | Templates
 * data access object
 */
package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author ilson gates
 */
public final class DB {
        private static DB db;
    Connection cn=null;
    Statement stmt=null;
    private PreparedStatement pstmt=null;
   
    
    public void getConnexion() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_devoir";
            String user="root";
           String pwd="";
            if (cn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection(url,user,pwd);
                stmt = cn.createStatement();
            } else if (cn.isClosed()) {
                cn = DriverManager.getConnection(url,user,pwd);
                stmt = cn.createStatement();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            
            System.out.println(ex);
        }
    }
    
     public static DB getInstance() throws Exception
    {
        if(db==null)
            db=new DB();
        return db;
    }
    
    public DB() throws Exception{
        getConnexion();
    }
   
    // pour les requete insert update delete 
    public int My_ExecuteUpdate(String sql) throws Exception{
        int nbRows=0;
        try {
            getConnexion();
            if(stmt==null || stmt.isClosed())
            {
                stmt =cn.createStatement();
            }
            nbRows=stmt.executeUpdate(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
        return nbRows;
    }
    // pour les select !!
    public ResultSet My_ExecuteQuery(String sql) throws Exception{
        
        ResultSet rs=null;
      try {
            getConnexion();
            if(stmt==null || stmt.isClosed())
            {
                stmt =cn.createStatement();
            }
            rs=stmt.executeQuery(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
        return rs;
    }
    // preparation de l'exÃ©cution de la requete paramÃ©trÃ©
    public void iniPreparedCmd(String sql) throws Exception{
        
        try {
            getConnexion();
            if(sql.toLowerCase().trim().startsWith("insert"))
                pstmt=cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            else
                pstmt=cn.prepareStatement(sql);
        } catch (Exception ex) {
            throw ex;
        }
                
    }
    //execution de la requete paramÃ©trÃ© (insert, update, delete)
    public int My_ExecutePrepareUpdate() throws Exception{
        
        int nbRows=0;
        try {
            getConnexion();
            nbRows=getPstmt().executeUpdate();
        } catch (Exception ex) {
            throw ex;
        }
        return nbRows;  
    }
    //execution de la requete paramÃ©trÃ© (select)
    public ResultSet My_ExecutePrepareQuery() throws Exception{
        
        ResultSet rs=null;
        try {
            getConnexion();
            rs=getPstmt().executeQuery();
        } catch (Exception ex) {
            throw ex;
        }
        return rs;
    }
    // avant de femer verifier si stmt, pstmt et cn sont ouvert 
    public void FermerConnexion() throws Exception{
        try {
            if(stmt!=null || !stmt.isClosed()){
                 stmt.close();
                 stmt=null;
            }
               
            if(getPstmt()!=null || !pstmt.isClosed()){
                getPstmt().close();
                pstmt=null;
            }
                
            if(cn!=null || !cn.isClosed()){
                 cn.close();
                 cn=null;
            }
               
        } catch (Exception ex) {
            throw ex;
        }
    }
  

    /**
     * @return the pstmt
     */
    public PreparedStatement getPstmt() {
        return pstmt;
    }

    
    public int Insert(String table, String[] colonne, String[] values) throws Exception{
        String cols = Arrays.stream(colonne).collect(Collectors.joining(", "));
        String vals = Arrays.stream(values).collect(Collectors.joining(", "));
        String sql = "insert into "+table+"("+cols+") values"+" ("+vals+")";
        int nbrows = 0;
        try {
            nbrows = My_ExecuteUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
        return nbrows;
    }
    
    public ResultSet My_Select(String table, String cols, String critere) throws Exception{
      String sql = "select "+cols+" from "+table;
      if(!critere.equals(""))
          sql += " where "+critere;
      ResultSet rs=null;
      try {
            rs=My_ExecuteQuery(sql);
            
        } catch (Exception ex) {
            throw ex;
        }
        return rs;
    }
    
    
}
