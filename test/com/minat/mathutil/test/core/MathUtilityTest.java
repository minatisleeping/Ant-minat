/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.minat.mathutil.test.core;

import com.minat.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author minhnhat
 */
public class MathUtilityTest {
    
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        
//        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(1, MathUtility.getFactorial(1));
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        Assert.assertEquals(20, MathUtility.getFactorial(6)); // 6! = 720
        
                
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-5);
         
    }
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        Assert.assertThrows(IllegalArgumentException.class, 
                           () -> MathUtility.getFactorial(-5));   
    }
    
    @Test
    public void testGetFactorailGivenWrongArgumentThrowsException_TryCatch() {
        
        try {
            MathUtility.getFactorial(-5);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be between {0, 20}", 
                                 e.getMessage());
        }
    }
    
}
