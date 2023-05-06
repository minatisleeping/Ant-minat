/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.minat.mathutil.test.core;

import com.minat.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author minat
 */

@RunWith(value = Parameterized.class) 
//- Câu lệnh này của JUnit nói rằng sẽ cần loop qua tập data để
//lấy cặp data input/expected nhồi vào hàm test
public class MathUltilDDTTest {
    
    
    // return mảng 2 chiều gồm nhìu cặp ExpectedInput
    @Parameterized.Parameters 
    public static Object[][] initData() {
        return new Integer[][] {
                                    {0, 1},
                                    {1, 1},
                                    {2, 2},
                                    {3, 6},
                                    {4, 24},
                                    {6, 720},
        };
    }
    @Parameterized.Parameter(value = 0)
    public int n; 
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        Assert.assertEquals(expected, MathUtility.getFactorial(n));
    }
     
    
}
