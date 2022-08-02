package com.code.util;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//<dependency>
//<groupId>commons-dbutils</groupId>
//<artifactId>commons-dbutils</artifactId>
//<version>1.6</version>
//</dependency>

/**
 * 数据库链接工具 方便调用
 */
public class DBCPUtils {

    private static DataSource dataSource;

    static {
        try {
            //加载db.properties 配置文件
            InputStream is = DBCPUtils.class.getClassLoader().getResourceAsStream("application.properties");
            Properties props = new Properties();
            props.load(is);
            //创建数据源
            DruidDataSource druidDataSource = new DruidDataSource();
            druidDataSource.setUrl(props.getProperty("spring.datasource.url"));
            druidDataSource.setUsername(props.getProperty("spring.datasource.username"));
            druidDataSource.setPassword(props.getProperty("spring.datasource.password"));
            druidDataSource.setDriverClassName(props.getProperty("spring.datasource.driver-class-name"));
            dataSource = druidDataSource;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static Connection getConnection() {

        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        QueryRunner runner = new QueryRunner(DBCPUtils.getDataSource());
        try {
            System.out.println("conn = " + runner.getDataSource().getConnection());
            System.out.println("测试数据库链接成功");
        } catch (SQLException throwables) {
            System.out.println("测试数据库链接失败 原因：" + throwables.getMessage());
            throwables.printStackTrace();
        }
    }


    /*下面是代码测试*/

   /*
   public void save(Account account) {
        try {
            runner.update("insert into account(name,money)values(?,?)", account.getName(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void update(Account account) {
        try {
            runner.update("update account set name=?,money=? where id=?", account.getName(), account.getMoney(), account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer accountId) {
        try {
            runner.update("delete from account where id=?", accountId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Account findById(Integer accountId) {
        try {
            return (Account) runner.query("select * from account where id=?", new BeanHandler(Account.class), accountId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<Account> findAll() {
        try {
            return (List<Account>) runner.query("select * from account", new BeanListHandler(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<Map<String, Object>> findMapList() {
        try {
            String sql = "select * from tablename ";
            List<Map<String, Object>> mapList = runner.query(sql, new MapListHandler());
            return mapList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    */


}
