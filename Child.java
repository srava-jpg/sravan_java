package Projects;

import java.sql.Date;

public class Child {
	private int empno;			
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private double sal;
	private int comm;
	private int deptno;
	
	public Child(int empno, String ename, String job, int mgr, Date hiredate, double sal, int comm, int deptno){
		this.empno = empno;		
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	public int getEmpno(){		//Here we use only get because we are giving permission to the other classes for only reading the data
		return empno;			//Not Using setter like c.setEname("praveen"). other classes cannot modify the private fields directly. 
	}
	
	public String getEname(){
		return ename;
	}
	
	public String getJob(){
		return job;
	}
	
	public int getMgr(){
		return mgr;
	}
	
	public Date getHiredate(){
		return hiredate;
	}
	
	public double getSal(){
		return sal;
	}
	
	public int comm(){
		return comm;
	}
	
	public int getDeptno(){
		return deptno;
	}
}
