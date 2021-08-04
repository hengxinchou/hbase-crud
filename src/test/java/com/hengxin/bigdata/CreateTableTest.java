package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.junit.Test;
import java.io.IOException;

public class CreateTableTest {

    @Test
    public void create() {
        try (Connection connection = HbaseInit.createConnection()) {
            CreateTable.create(connection, "zhouhengxin:student", "name", "info", "score");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}