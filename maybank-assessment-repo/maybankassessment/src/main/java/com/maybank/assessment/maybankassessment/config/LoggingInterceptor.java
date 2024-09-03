//package com.maybank.assessment.maybankassessment.config;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import java.io.IOException;
//
//public class LoggingInterceptor implements HandlerInterceptor {
//
//    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
//        logger.info("Request URL: {}", request.getRequestURL());
//        logger.info("Request Method: {}", request.getMethod());
//        logger.info("Request Body: {}", request.getReader().lines().reduce("", (accumulator, actual) -> accumulator + actual));
//        return true;
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws IOException {
//        logger.info("Response Status: {}", response.getStatus());
//        // For response body logging, consider using a filter or response wrapper.
//    }
//}
