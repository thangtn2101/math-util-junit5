/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thangntran.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author thang
 */
public class MathUtilTest {
   @Test
   public void testFactorialGivenRightArgumentReturnWell(){
       assertEquals(120, MathUtil.getFratorial(5));
   }
   public static Object[][] initData(){
       return new Integer [][]{
           {1,1},
           {0,1},
           {4,24}
       };
   }
   @ParameterizedTest
   @MethodSource(value = "initData")
   public void testFactorialGivenRightArgumentReturnWell(int input, int expected){
       assertEquals(expected, MathUtil.getFratorial(input));
   }
   //bat ngoai le 
   @Test
   public void testFactorialGivenWrongArgumentThrownExeption(){
       Executable ex = new Executable() {
           @Override
           public void execute() throws Throwable {
               MathUtil.getFratorial(-5);
               
           }
       };//anonymous
       assertThrows(IllegalArgumentException.class, ex);
   }
}
