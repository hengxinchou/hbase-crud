package com.hengxin;

import org.junit.Test;

public class GetRowTest {

    @Test
    public void printRowValue() {
        try {
            GetRow.printRowValue("zhouhengxin:student","row1");
            ScanTable.scan("zhouhengxin:student");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}