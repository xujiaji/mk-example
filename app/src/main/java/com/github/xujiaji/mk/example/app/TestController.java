package com.github.xujiaji.mk.example.app;

import com.github.xujiaji.mk.common.base.ApiResponse;
import com.github.xujiaji.mk.common.base.BaseController;
import com.github.xujiaji.mk.user.service.impl.MkUserIdNumberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajixu
 * @date 2020/11/4 12:47
 */
@RequiredArgsConstructor
@RestController
public class TestController extends BaseController {

    private final MkUserIdNumberServiceImpl userIdNumberService;

    @GetMapping("/testss")
    public ApiResponse<?> test() {
        return success(userIdNumberService.newNormalIdNumber());
    }
}
