package com.hengxin;

import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;

import java.io.IOException;

/**
 * @author: zhouhengxin
 * @create: 2021-08-04 00:11
 **/
public class DropTable {
    public static void drop(String tableName) throws IOException {
        HbaseConnection.initAdmin();
        Admin admin = HbaseConnection.admin;
        if (admin.isTableDisabled(TableName.valueOf(tableName))) {
            System.out.println("table不存在");
            return;
        }
        if (!admin.isTableDisabled(TableName.valueOf(tableName))) {
            admin.disableTable(TableName.valueOf(tableName));
        }
        admin.deleteTable(TableName.valueOf(tableName));
        HbaseConnection.close();
    }
}

