package me.easytodo.designpatterns._03_behavioral_patterns._16_iterator._02_after;

import java.util.Iterator;
import java.util.List;

import me.easytodo.designpatterns._03_behavioral_patterns._16_iterator._01_before.Post;

/**
 * 집합 객체 내부 구조를 노출시키지 않고 순회 하는 방법을 제공하는 패턴
 * 집합 객체를 순회하는 클라이언트 코드를 변경하지 않고 다양한 순회 방법을 제공할 수 있다.
 * 
 * 장점
 * - 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있다.
 * - 일관된 인터페이스를 사용해 여러 형태의 집합 구조를 순회할 수 있다.
 * 단점
 * - 클래스가 늘어나고 복잡도가 증가한다.
 * 
 * 자바
 * - java.util.Enumeration과 java.util.Iterator
 * - Java StAX (Streaming API for XML)의 Iterator 기반 API
 * - XmlEventReader, XmlEventWriter
 * 스프링
 * - CompositeIterator
 * 
 * Board vo에서 list 맴버변수를 RecentPostIterator로 보내 내부구조를 노출시키지 않게한다.
 * RecentPostIterator list로 처리 할수 있는 interator interface
 */
public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("start game");
        board.addPost("would you Iterator pattern learning ??");
        board.addPost("yes");

        // TODO 들어간 순서대로 순회
        List<Post> posts = board.getPosts();
        
        // 1. 내부 구조를 노출시키지않는 Iterator
        Iterator<Post> iterator = posts.iterator();
        System.out.println(iterator.getClass());

        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // 2. TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }

}
