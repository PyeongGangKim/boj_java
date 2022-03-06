package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 문자열을 반환하면 string이 http body에 들어간다.
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        log.trace(" trace my log=" + name); // 연산이 일어남, 메모리도 사용함 그래서 불필요한 연산이 들어가기에 사용하면 안된다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);
        log.info(" info log ={}", name);

        return "ok";
    }
}
