/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tallerunit.TallerUnit.EmployeeType;

/**
 *
 * @author CltControl
 */
public class EmployeeTest  {
    
    public EmployeeTest() {
       
    }
    @Test
     public void SupervisornotUsa(){
     EmployeeType e= EmployeeType.Supervisor;
        Employee worker = new Employee(500, "EU",50,e);
        
        Assert.assertEquals(worker.cs(),492.5,0.05);
     }
    @Test
     public void SupervisorUsa(){
        EmployeeType e= EmployeeType.Supervisor;
        Employee worker = new Employee(500, "USD",50,e);
        
        Assert.assertEquals(worker.cs(),517.5,0.05);
    }
    
     //Verifica que el metodo cs de employee calcule bien el salario para un empleado de tipo worker con currency USD
    @Test
    public void VerificarCsWorkerUSD(){
        Employee emp=new Employee(200,"USD",6,EmployeeType.Worker);
        double cs=emp.cs();
        Assert.assertEquals(200, cs,0.1);
    }
    
    //Verifica que el metodo cs de employee calcule bien el salario para un empleado de tipo worker con cualquier otro currency que no sa USD
    @Test
    public void VerificarCsWorker(){
        Employee emp=new Employee(200,"",6,EmployeeType.Worker);
        double cs=emp.cs();
        Assert.assertEquals(190, cs,0.1);
    }
    
    
    //Verifica que el metodo CalculateYearBonus de el resultado correcto para un empleado de tipo worker con currency USD
    @Test
    public void VerificarYearBonusWorkerUSD(){
        Employee emp=new Employee(200,"USD",6,EmployeeType.Worker);
        double yb=emp.CalculateYearBonus();
        Assert.assertEquals(3860, yb,0.1);
    }
    
    //Verifica que el metodo CalculateYearBonus de el resultado correcto para un empleado de tipo worker con otro currency que no sea USD
    @Test
    public void VerificarYearBonusWorker(){
        Employee emp=new Employee(200,"",6,EmployeeType.Worker);
        double yb=emp.CalculateYearBonus();
        Assert.assertEquals(3860, yb,0.1);
    } 
     
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        
    }
    
}
