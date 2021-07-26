## Mybatis代码生成工具

### 配置文件

#### 数据库信息

* 配置数据库连接及库名
* 配置用户名和密码

```xml
<!--数据库连接地址、用户名、密码-->
<jdbcConnection driverClass="com.mysql.jdbc.Driver" connectionURL="jdbc:mysql://10.148.3.137:3306/spms_dev_28080" userId="dev" password="dev">
</jdbcConnection>
```

#### Model类

配置Model类存放目录，即：`targetPackage`对应的值

```xml
<!--生成Model类存放位置-->
<javaModelGenerator targetPackage="com.migu.entity" targetProject="src/main/java">
    <property name="enableSubPackages" value="true"/>
    <property name="trimStrings" value="true"/>
</javaModelGenerator>
```

#### Mapper文件

配置映射文件存放目录，即：`targetPackage`对应的值

```xml
<!--生成映射文件存放位置-->
<sqlMapGenerator targetPackage="com.migu.mapper" targetProject="src/main/java">
    <property name="enableSubPackages" value="true"/>
</sqlMapGenerator>
```

#### Dao类

配置Dao类存放目录，即：`targetPackage`对应的值

```xml
<!--生成Dao类存放位置-->
<javaClientGenerator type="XMLMAPPER" targetPackage="com.migu.dao" targetProject="src/main/java">
    <property name="enableSubPackages" value="true"/>
</javaClientGenerator>
```

#### 表信息

配置表名、model文件名、mapper文件名，即：tableName、domainObjectName、mapperName

```xml
<!--生成对应表及类名-->
<table tableName="customflow_config_bizfield"
       domainObjectName="CustomflowConfigBizfieldDO"
       mapperName="CustomflowConfigBizfieldMapper"

       enableCountByExample="false"
       enableUpdateByExample="false"
       enableDeleteByExample="false"
       enableSelectByExample="false"
       selectByExampleQueryId="false">
</table>
```

### 执行生成

#### 生成

在Maven Projects窗口->mybatis-generator模块->Plugins->mybatis-generator->mybatis-generator:generate，双击mybatis-generator:generate即可生成对应代码

#### 拷贝

拷贝`dao`、`entity`、`mapper`三个目录下的文件

- 一张表会生成两个实体文件：xxxCriteria、xxxDO
- Dao文件默认继承`com.migu.spms.dao.inf.IBasicDao`，`IBasicDao`类提供默认方法`save`、`batchSave`、`updateByKey`、`deleteByCondtion`、`selectByKey`、`selectList`、`selectListCount`，能支持常用操作

> 目前`IBasicDao`类已经在spms_cloud_basic_service模块中，对应的分支：dev/v2.2.1/20180925

```java
package com.migu.spms.dao.inf;

import java.util.List;

public interface IBasicDao<T, E>{
    /**
     * 通用的保存方法
     * @param entity
     */
    void save(T entity);

    /**
     * 批量保存
     * @param list
     */
    void batchSave(List<T> list);

    /**
     * 通用的修改方法
     * @param entity
     */
    int updateByKey(T entity);

    /**
     * 根据条件删除方法
     * @param entity
     */
    int deleteByCondition(E entity);

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    T selectByKey(Integer id);

    /**
     * 查询记录集合
     * @param entity
     * @return
     */
    List<T> selectList(E entity);

    /**
     * 查询总条数
     * @param entity
     * @return
     */
    List<T> selectListCount(E entity);
}
```

* mapper文件中提供与`IBasicDao`类对应的SQL语句，即：`save`、`batchSave`、`updateByKey`、`deleteByCondtion`、`selectByKey`、`selectList`、`selectListCount`



