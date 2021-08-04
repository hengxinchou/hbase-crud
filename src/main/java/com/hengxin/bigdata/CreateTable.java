package com.hengxin.bigdata;

import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author: zhouhengxin
 * @create: 2021-08-03 23:49
 * 创建表
 **/
public class CreateTable {
    public static void create(Connection connection, String tableName, String... columnFamilies) throws IOException {
        Admin admin = connection.getAdmin();
        if (tableName == null || columnFamilies == null) {
            return;
        }
        HTableDescriptor table = new HTableDescriptor(TableName.valueOf(tableName));
        for (int i = 0; i < columnFamilies.length; i++) {
            if (columnFamilies[i] == null)
                continue;
            HColumnDescriptor columnDescriptor = new HColumnDescriptor(columnFamilies[i]);
            columnDescriptor.setMaxVersions(1);
            table.addFamily(columnDescriptor);
        }
        admin.createTable(table);
        System.out.println("成功创建表 " + table + ", column family: "+ Arrays.toString(columnFamilies) );
    }
}

