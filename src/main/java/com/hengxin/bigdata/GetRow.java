package com.hengxin.bigdata;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.HBaseIOException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;

import java.io.IOException;
import java.util.List;

/**
 * @author: zhouhengxin
 * @create: 2021-08-04 00:06
 * 获取某一行的数据
 **/
public class GetRow {
    public static void printRowValue(Connection connection, String tableName, String rowKey,
                                     String... columnFamilyAndColumn) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        Get get = new Get(rowKey.getBytes());
        if (columnFamilyAndColumn == null) {
            //列簇和列暂时不加
        } else {
            //列簇是第一个值，列是第二个值，一共两个值
            if (columnFamilyAndColumn.length == 1) {
                get.addFamily(columnFamilyAndColumn[0].getBytes());
            } else if (columnFamilyAndColumn.length == 2) {
                get.addColumn(columnFamilyAndColumn[0].getBytes(), columnFamilyAndColumn[1].getBytes());
            } else {
                throw new HBaseIOException("params is not correct!");
            }
        }
        Result result = table.get(get);
        List<Cell> cells = result.listCells();
        for (int i = 0; i < cells.size(); i++) {
            String row = new String(cells.get(i).getRowArray());
            String family = new String(cells.get(i).getFamilyArray());
            System.out.println(row + "\t\t" + family);
        }
    }
}

