package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.junit.Test;

public class GetRowTest {

    @Test
    public void printRowValue() {
        try (Connection connection = HbaseInit.createConnection()) {
            GetRow.printRowValue(connection, "zhouhengxin:student", "row1", "name");
            GetRow.printRowValue(connection, "zhouhengxin:student", "row1", "info", "class");
            GetRow.printRowValue(connection, "zhouhengxin:student", "row1", "info", "student_id");
            GetRow.printRowValue(connection, "zhouhengxin:student", "row1", "score", "programming");
            GetRow.printRowValue(connection, "zhouhengxin:student", "row1", "score", "understanding");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}