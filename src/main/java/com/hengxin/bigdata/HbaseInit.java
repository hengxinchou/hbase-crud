package com.hengxin.bigdata;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import java.io.IOException;

/**
 * @author: zhouhengxin
 * @create: 2021-08-03 23:45
 * Hbase客户端的初始化
 **/
public class HbaseInit {
    public static Connection createConnection() throws IOException {
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "jikehadoop01,jikehadoop02,jikehadoop03");
        conf.set("hbase.zookeeper.property.clientPort", "2181");
        return ConnectionFactory.createConnection(conf);
    }
}

