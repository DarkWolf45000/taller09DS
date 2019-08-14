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
