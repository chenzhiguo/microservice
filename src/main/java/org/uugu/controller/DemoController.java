package org.uugu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author Zhiguo.Chen <me@chenzhiguo.cn>
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }
}
