package com.hengxin.bigdata;

import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

/**
 * @author: zhouhengxin
 * @create: 2021-08-04 00:34
 **/
public class DeleteRow {

    public static boolean deleteRow(Connection connection, String tableName, String rowkey) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        Delete delete = new Delete(Bytes.toBytes(rowkey));
        table.delete(delete);
        System.out.println("成功删除 " + tableName + " " + rowkey);
        return true;
    }
}
