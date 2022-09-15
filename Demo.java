package com.codingametest.yassine.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Demo {

    @Component
    class AccessControlService{
        private RoleService roleService;

        @Autowired
        public AccessControlService(RoleService roleService){
            this.roleService = roleService;
        }
    }

    @Component
    class RoleService{
        private AccessControlService accessControlService;
        @Autowired
        public RoleService(AccessControlService accessControlService){
            this.accessControlService = accessControlService;
        }
    }
}
