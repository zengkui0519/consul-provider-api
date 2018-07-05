package com.zk.api;

import com.zk.vo.Page;
import com.zk.vo.ResponseVo;
import com.zk.model.Test;
import org.springframework.web.bind.annotation.*;

@RequestMapping(Urls.Test.ROOT)
public interface TestApi {

    @RequestMapping(value = Urls.Test.GET_TEST_INFO,method = RequestMethod.GET)
    //@GetMapping(Urls.Test.GET_TEST_INFO)
    ResponseVo<Test> getTestInfo(@PathVariable("testId") Long testId);
//
//    @RequestMapping(value = Urls.Test.SAVE_TEST,method = RequestMethod.POST)
//    //@PostMapping(Urls.Test.SAVE_TEST)
//    ResponseVo saveTest(@RequestBody Test test);
//
//    @RequestMapping(value = Urls.Test.UPDATE_TEST,method = RequestMethod.PUT)
//    //@PutMapping(Urls.Test.UPDATE_TEST)
//    ResponseVo updateTest(@RequestBody Test test);
//
//    @RequestMapping(value = Urls.Test.DELETE_TEST,method = RequestMethod.DELETE)
//    //@DeleteMapping(Urls.Test.DELETE_TEST)
//    ResponseVo deleteTest(@PathVariable("testId") Long testId);
//
//    @RequestMapping(value = Urls.Test.GET_TEST_LIST,method = RequestMethod.GET)
//    //@GetMapping(Urls.Test.GET_TEST_LIST)
//    ResponseVo<Page<Test>> getTestList(@RequestParam Integer pageNum, @RequestParam Integer pageSize);

}
