package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.junit.Test;

public class ScanTableTest {

    @Test
    public void scan() {
        try (Connection connection = HbaseInit.createConnection()){
            ScanTable.scan(connection,"zhouhengxin:student");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}