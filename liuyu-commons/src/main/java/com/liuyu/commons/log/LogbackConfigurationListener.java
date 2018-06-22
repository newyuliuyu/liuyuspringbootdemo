package com.liuyu.commons.log;

import ch.qos.logback.access.joran.JoranConfigurator;
import ch.qos.logback.classic.LoggerContext;
import com.google.common.io.Resources;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import java.io.InputStream;

/**
 * ClassName: LogbackConfigurationListener <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-6-22 下午5:09 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
@WebListener
public class LogbackConfigurationListener {
    // private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String CONFIG_FILE = "logbackConfigLocation";


    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("************************日志************************************");
        System.out.println("开始配置日志...");
        String config = sce.getServletContext().getInitParameter(CONFIG_FILE);
        String file = sce.getServletContext().getRealPath(config);
        System.out.println(String.format("日志文件位置：%s", file));
        try {
            InputStream in = Resources.getResource("logback.xml").openStream();
            LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
            loggerContext.reset();
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(loggerContext);
//			configurator.doConfigure(file);
            configurator.doConfigure(in);
            System.out.print(String.format("日志文件配置成功:%s", file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("************************日志END************************************");
    }


    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub

    }
}
