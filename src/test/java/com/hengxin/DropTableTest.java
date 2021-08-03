package com.hengxin;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DropTableTest {

    @Test
    public void drop() {
        try {
            DropTable.drop("zhouhengxin:student");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}