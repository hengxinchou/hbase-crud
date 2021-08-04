package com.hengxin.bigdata;

import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;

import java.io.IOException;

/**
 * @author: zhouhengxin
 * @create: 2021-08-03 23:58
 * 插入行数据
 **/
public class PutRow {
    public static void insert(Connection connection, String tableName, String rowKey, String columnFamily, String column,
                              String value) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        Put put = new Put(rowKey.getBytes());
        put.addColumn(columnFamily.getBytes(), column.getBytes(), value.getBytes());
        table.put(put);
    }
}
