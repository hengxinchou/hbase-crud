package com.hengxin;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreateTableTest {

    @Test
    public void create() {
        HbaseConnection.initAdmin();
        CreateTable.create("zhouhengxin:student","name", "info","score");
    }
}