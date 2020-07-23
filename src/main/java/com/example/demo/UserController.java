package com.example.demo;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * TODO
 *
 * @auther gaoshiman
 * @date 2020/7/16 15:43
 */
@RestController
@RequestMapping("/test")
@Api("测试")
public class UserController {

    @ApiOperation(value = "计算+", notes = "加法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "a", paramType = "path", value = "数字a", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "b", paramType = "path", value = "数字b", required = true, dataType = "Long")
    })
    @GetMapping("/{a}/{b}")
    public Integer get(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }
}
