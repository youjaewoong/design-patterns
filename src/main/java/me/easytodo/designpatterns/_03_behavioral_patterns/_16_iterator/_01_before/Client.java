package me.easytodo.designpatterns._03_behavioral_patterns._16_iterator._01_before;

import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("start study");
        board.addPost("would you Iterator pattern learning ??");
        board.addPost("yes");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
    }

}
