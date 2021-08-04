package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.junit.Test;

import java.io.IOException;

public class DropTableTest {

    @Test
    public void drop() {
        try (Connection connection = HbaseInit.createConnection()) {
            DropTable.drop(connection, "zhouhengxin:student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}