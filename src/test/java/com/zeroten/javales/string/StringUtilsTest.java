package com.zeroten.javales.string;

import com.zeroten.javales.utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {
    @Test
    public void testTrimAll() {
        String hello = "hello";
        Assert.assertEquals(StringUtils.trimAll(" hello"), hello);
        Assert.assertEquals(StringUtils.trimAll("   hello"), hello);
        Assert.assertEquals(StringUtils.trimAll("hello "), hello);
        Assert.assertEquals(StringUtils.trimAll("hello    "), hello);
        Assert.assertEquals(StringUtils.trimAll("hel lo"), hello);
        Assert.assertEquals(StringUtils.trimAll("hel   lo"), hello);
        Assert.assertEquals(StringUtils.trimAll("   hel   lo"), hello);
        Assert.assertEquals(StringUtils.trimAll("   hel   lo   "), hello);
    }

    @Test
    public void testReverse() {
        Assert.assertEquals(StringUtils.reverse("7654321"),"1234567");
        Assert.assertEquals(StringUtils.reverse("blacky"),"ykcalb");
        Assert.assertEquals(StringUtils.reverse("celina"),"anilec");
    }
}
