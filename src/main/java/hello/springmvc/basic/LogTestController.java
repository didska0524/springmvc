package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 롬복이 제공하는 어노테이션, 밑줄 주석처리된 코드를 자동으로 넣어준다
@RestController // @Controller 와 @ResponseBody 어노테이션 두개가 합쳐진 어노테이션이라고 이해하면 된다.
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}",name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
