package test.java;

import com.google.common.annotations.VisibleForTesting;
import com.intellij.testFramework.TestDataFile;
import main.java.Factorial;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by eduar2 on 12-12-16.
 */
public class FactorialTest {

    @Test
    public void TestFactorialCeroIgualUno(){
        Factorial factorial = new Factorial();
        Assert.assertEquals(BigInteger.valueOf(1),factorial.calcularFactorial(0));
    }

    @Test
    public void TestFactorialCincoIgual120(){
        Factorial factorial = new Factorial();
        Assert.assertEquals(BigInteger.valueOf(120),factorial.calcularFactorial(5));
    }

    @Test
    public void TestFactorial25(){
        Factorial factorial = new Factorial();
        Assert.assertEquals("15511210043330985984000000",factorial.calcularFactorial(25).toString());
    }

    @Test
    public void TestConCuatroContarCero(){
        Factorial factorial = new Factorial();
        Assert.assertEquals(0,factorial.contarCerosFactorial(4));
    }

    @Test
    public void TestConCincoContarUno(){
        Factorial factorial = new Factorial();
        Assert.assertEquals(1,factorial.contarCerosFactorial(5));
    }

    @Test
    public void TestCon20ContarCuatro(){
        Factorial factorial = new Factorial();
        Assert.assertEquals(4,factorial.contarCerosFactorial(20));
    }

    @Test
    public void TestCon25ContarSeis(){
        Factorial factorial = new Factorial();
        Assert.assertEquals(6,factorial.contarCerosFactorial(25));
    }
}
