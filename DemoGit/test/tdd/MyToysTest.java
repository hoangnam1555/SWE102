/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static Util.MyToys.computeFactoria;
// chi danh cho ham static, import luon ten ham, xai nhu ben C
// chi goi ten ham, khoi goi class.
/**
 *
 * @author USER
 */
public class MyToysTest {
    
    @Test
    // tu khoa nay - anotation giup bien 1 ham bat ki thanh psvm
    public void testSuccessCases(){
        //test tinh huong dua vao giai thua dung
        assertEquals(120, computeFactoria(5));
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testfailCases(){
        //test tinh huong dua vao giai thua dung
        assertEquals(120, computeFactoria(-5));
        
    }
    
    
}
