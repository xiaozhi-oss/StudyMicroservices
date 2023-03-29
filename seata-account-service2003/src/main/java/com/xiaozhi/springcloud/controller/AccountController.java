package com.xiaozhi.springcloud.controller;

import com.xiaozhi.springcloud.domain.CommonResult;
import com.xiaozhi.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author xiaozhi
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/account/decrease")
    public CommonResult createOrder(@RequestParam("userId") Long userId,
                                    @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣除账户金额成功~~~");
    }
}
