package com.hengxin.bigdata;

import org.apache.hadoop.hbase.client.Connection;
import org.junit.Test;

import java.io.IOException;

public class PutRowTest {

    @Test
    public void insert() {
        try (Connection connection = HbaseInit.createConnection()) {
            PutRow.insert(connection, "zhouhengxin:student", "row1", "name", "", "Tom");
            PutRow.insert(connection, "zhouhengxin:student", "row1", "info", "student_id", "20210000000001");
            PutRow.insert(connection, "zhouhengxin:student", "row1", "info", "class", "1");
            PutRow.insert(connection, "zhouhengxin:student", "row1", "score", "understanding", "75");
            PutRow.insert(connection, "zhouhengxin:student", "row1", "score", "programming", "82");

            PutRow.insert(connection, "zhouhengxin:student", "row2", "name", "", "Jerry");
            PutRow.insert(connection, "zhouhengxin:student", "row2", "info", "student_id", "20210000000002");
            PutRow.insert(connection, "zhouhengxin:student", "row2", "info", "class", "1");
            PutRow.insert(connection, "zhouhengxin:student", "row2", "score", "understanding", "85");
            PutRow.insert(connection, "zhouhengxin:student", "row2", "score", "programming", "67");


            PutRow.insert(connection, "zhouhengxin:student", "row3", "name", "", "Jack");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "info", "student_id", "20210000000003");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "info", "class", "2");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "score", "understanding", "80");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "score", "programming", "80");

            PutRow.insert(connection, "zhouhengxin:student", "row4", "name", "", "Rose");
            PutRow.insert(connection, "zhouhengxin:student", "row4", "info", "student_id", "20210000000004");
            PutRow.insert(connection, "zhouhengxin:student", "row4", "info", "class", "2");
            PutRow.insert(connection, "zhouhengxin:student", "row4", "score", "understanding", "60");
            PutRow.insert(connection, "zhouhengxin:student", "row4", "score", "programming", "61");

            PutRow.insert(connection, "zhouhengxin:student", "row3", "name", "", "Zhouhengxin");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "info", "student_id", "G20210735010242");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "info", "class", "3");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "score", "understanding", "90");
            PutRow.insert(connection, "zhouhengxin:student", "row3", "score", "programming", "90");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}