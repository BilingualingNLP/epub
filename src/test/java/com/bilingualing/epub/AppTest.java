package com.bilingualing.epub;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import com.bilingualing.epub.MetaInf;
/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testContainer()
    {
        MetaInf container = new MetaInf();
        container.generateContainer();
    }
}
