package com.hengxin;

import org.junit.Test;

import java.io.IOException;

public class PutRowTest {

    @Test
    public void insert() {
        try {
            PutRow.insert("zhouhengxin:student","row1","name","","Tom");
            PutRow.insert("zhouhengxin:student","row1","info","student_id","20210000000001");
            PutRow.insert("zhouhengxin:student","row1","info","class","1");
            PutRow.insert("zhouhengxin:student","row1","score","understanding","75");
            PutRow.insert("zhouhengxin:student","row1","score","programming","82");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}