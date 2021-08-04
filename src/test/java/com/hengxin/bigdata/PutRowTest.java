package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.junit.Test;

import java.io.IOException;

public class PutRowTest {

    @Test
    public void insert() {
        try (Connection connection = HbaseInit.createConnection()) {
            PutRow.insert(connection, "zhouhengxin:student","row1","name","","Tom");
            PutRow.insert(connection, "zhouhengxin:student","row1","info","student_id","20210000000001");
            PutRow.insert(connection, "zhouhengxin:student","row1","info","class","1");
            PutRow.insert(connection,"zhouhengxin:student","row1","score","understanding","75");
            PutRow.insert(connection,"zhouhengxin:student","row1","score","programming","82");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}