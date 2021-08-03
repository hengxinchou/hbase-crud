package com.hengxin;

import com.hengxin.good.HBaseConn;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * @author: zhouhengxin
 * @create: 2021-08-04 00:34
 **/
public class DeleteRow {

    public static boolean deleteRow(String tableName, String rowkey) {
        try (Table table = HBaseConn.getTable(tableName)) {
            Delete delete = new Delete(Bytes.toBytes(rowkey));
            table.delete(delete);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
