/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamessoft.pacman;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author ACE
 */
@RunWith(JMock.class)
public class MockTest {

    private Mockery mockingContext;
    private MockTestInterface mockedDependency;

    public MockTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mockingContext = new JUnit4Mockery();
        mockedDependency = mockingContext.mock(MockTestInterface.class);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void mockTest() {
        mockingContext = new JUnit4Mockery();
        mockingContext.checking(new Expectations() {
            {
                one(mockedDependency).getXCoordinate();
                will(returnValue(12));
            }
        });
        
    }
}
