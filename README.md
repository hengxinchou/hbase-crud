
# 1. 运行创建表
   创建 **zhouhengxin:student** 表
![img_1.png](截图/img_1.png)
Hbase shell 可以看到 存在 **zhouhengxin:student**  表了。
![img_2.png](截图/img_2.png)
# 2 插入数据

![img_3.png](截图/img_3.png)
Hbase shell 可以看到插入成功
![img_6.png](截图/img_6.png)

# 3. 全表扫描数据
![img_7.png](截图/img_7.png)

# 4 根据rowKey查询某行数据
根据rowkey 查询 rowKey为 **"row5"** 的 数据 数据
![img_8.png](截图/img_8.png)
# 5 根据rowkey删除某行
删除rowKey为 **"row5"** 的 数据
![img_9.png](截图/img_9.png)
hbase shell 里查不到rowKey为 **"row5"** 了。
![img_10.png](截图/img_10.png)
# 6 删除表
![img_11.png](截图/img_11.png)
hbase shell 查不到 **"zhouhengxin:student"** 这个表了
![img_12.png](截图/img_12.png)

# 备注

要在 hosts 添加 ip域名绑定才能跑得起来，主要是Zookeeper的ip

```shell
47.101.206.249 jikehadoop01
47.101.216.12  jikehadoop02
47.101.204.23  jikehadoop03
```



