package com.myapp.core.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @author :zzb
 * @createDate :2019/7/2 15:22
 * @desc :配置文件
 */
public class TestConfig {

    private static final Log log = LogFactory.getLog(TestConfig.class);

    private static  final String testName = "test.name";
    private static  final String testPwd = "test.pwd";

    private static final String FILENAME ="/test.properties";

    private static final Properties pro = new Properties();

    static {
        try{
            pro.load(TestConfig.class.getResourceAsStream(FILENAME));
        }catch (FileNotFoundException e){
            log.error("配置文件找不到");
        } catch (Exception e){
            log.error("加载配置文件失败");
        }
    }

    public static String getTestName() {
        return pro.getProperty(testName);
    }

    public static String getTestPwd() {
        return pro.getProperty(testPwd);
    }
}
