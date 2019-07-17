package com.stackroute;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

    public class UserServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return null;
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[] {UserConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[] {"/"};
        }
    }

