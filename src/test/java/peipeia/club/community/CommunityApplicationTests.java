package peipeia.club.community;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {
    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        //日志的级别
        //由低到高 trace<debug<info<warn<error
        //可以调整输出的日志级别，日志就只会在这个级别以后的高级别生效
        logger.trace("这是trance日志");
        logger.debug("这个是debug日志");
        //SpringBoot默认给我们使用的是info级别,没指定就用springBoot默认规定的级别
        logger.info("这是info日志");
        logger.warn("警告");
        logger.error("错误");
    }

}
