package me.easytodo.designpatterns._02_structural_patterns._12_proxy._03_java;

import java.lang.reflect.Proxy;

import me.easytodo.designpatterns._02_structural_patterns._12_proxy._02_after.DefaultGameService;
import me.easytodo.designpatterns._02_structural_patterns._12_proxy._02_after.GameService;

/**
 * 동적 다이나믹 proxy
 */
public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    //proxy Instance 생성 및 실행
    private GameService getGameServiceProxy(GameService target) {
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("O");
                    method.invoke(target, args); //메소드 실행 객체
                    System.out.println("ㅁ");
                    return null;
                });
    }
}
