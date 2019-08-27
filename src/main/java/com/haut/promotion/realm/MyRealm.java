package com.haut.promotion.realm;

import com.haut.promotion.service.TestService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * 估计用不到权限
 */
public class MyRealm extends AuthorizingRealm {

    @Resource
    TestService testService;

    //当前角色权限验证
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String name = principals.getPrimaryPrincipal().toString();
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //手动设置角色
        Set<String> roleSet = new HashSet<>();
        roleSet.add("rolea");
        roleSet.add("roleb");
        roleSet.add("rolec");
        //加入角色
        simpleAuthorizationInfo.setRoles(roleSet);
        //手动设置角色
        Set<String> permSet = new HashSet<>();
        permSet.add("a");
        permSet.add("b");
        if ("root".equals(name)){
            permSet.add("user:a");
        }
        //加入权限
        simpleAuthorizationInfo.setStringPermissions(permSet);
        System.out.println(name+"======角色权限验证======");
        return simpleAuthorizationInfo;
    }

    //当前登录用户验证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return null;
    }
}
