package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.junit.Test;

import java.io.IOException;

public class DeleteRowTest {

    @Test
    public void deleteRow() {
        try (Connection connection = HbaseInit.createConnection()){
            DeleteRow.deleteRow(connection, "zhouhengxin:student", "row5");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}