package com.kdm.kdmmodel;

import com.kdm.kdmmodel.models.TestModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KDMModelTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testFromJson() throws Exception {

        String json = "{itemInt:1,itemString:\"hoge\"}";
        TestModel model = new TestModel();
        model = (TestModel) model.fromJson(json, TestModel.class);

        assertEquals(model.itemInt, 1);
        assertEquals(model.itemString, "hoge");
    }
}