package main;

import static org.jooq.impl.DSL.*;
import static db.generated.Tables.*;

import java.sql.*;
import org.jooq.*;
import org.jooq.impl.*;

import db.generated.Tables;
import db.generated.tables.EEmp;
import db.generated.tables.records.DDeptRecord;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		String username = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/firmen_db";
		
		 try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            conn = DriverManager.getConnection(url, username, password);
	            
	            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
	            Result<Record> resultemp = create.select().from(Tables.E_EMP).where(Tables.E_EMP.E_EMPNO.lessThan((long) 7700)).fetch();
	            
	            for(Record r: resultemp){
	            	Long number = r.getValue(Tables.E_EMP.E_EMPNO);
	            	String name = r.getValue(Tables.E_EMP.E_ENAME);
	            	String job = r.getValue(Tables.E_EMP.E_JOB);
	            	Date datum = r.getValue(Tables.E_EMP.E_HIREDATE);
	            	Long bezahlung = r.getValue(Tables.E_EMP.E_SAL);
	            	
	            	System.out.println("NR: "+number+" Name: "+name+" Job: "+job+" Anstellungsdatum: "+datum
	            			+" Gehalt: "+bezahlung);
	            	
	            }
	            
	            InsertValuesStep3<DDeptRecord, Long, String, String> step =
	            create.insertInto(Tables.D_DEPT,Tables.D_DEPT.D_DEPTNO,Tables.D_DEPT.D_DNAME,Tables.D_DEPT.D_LOC);
	            step.values((long) 50,"TECHNOLOGY","LOS ANGELES");
	            step.execute();
	            
	            resultemp = create.select().from(Tables.D_DEPT).where(Tables.D_DEPT.D_DEPTNO.equal((long)50)).fetch();
	            
	            for(Record r: resultemp){
	            	Long deptno = r.getValue(Tables.D_DEPT.D_DEPTNO);
	            	String bezeichnung = r.getValue(Tables.D_DEPT.D_DNAME);
	            	String location = r.getValue(Tables.D_DEPT.D_LOC);
	            	System.out.println("NR: "+deptno+" Bezeichnung: "+bezeichnung+" Ort: "+location);
	            }
	            
	            
	        } catch (Exception e) {
	            // For the sake of this tutorial, let's keep exception handling simple
	            e.printStackTrace();
	        } finally {
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException ignore) {
	                }
	            }
	        }
	}

}
