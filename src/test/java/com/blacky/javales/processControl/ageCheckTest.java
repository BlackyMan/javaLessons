package com.blacky.javales.processControl;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.blacky.javales.AgeCheck;

public class ageCheckTest {
    @Test
    public void testAgecCheck1() {
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(7),"少年");
        Assert.assertEquals(AgeCheck.getAgeName(18),"青年");
    }

    @Test
    public void testAgecCheck2() {
        Assert.assertEquals(AgeCheck.getAgeName(41),"中年");
        Assert.assertEquals(AgeCheck.getAgeName(60),"老年");
        Assert.assertEquals(AgeCheck.getAgeName(80),"老年");
    }


}
