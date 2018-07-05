package com.zk.api;

public interface Urls {

    interface Test {
        String ROOT = "/test";
        String GET_TEST_LIST = "/getTestList";
        String GET_TEST_INFO = "/getTestInfo/{testId}";
        String SAVE_TEST = "/saveTest";
        String UPDATE_TEST = "/updateTest";
        String DELETE_TEST = "/deleteTest/{testId}";
    }

}
