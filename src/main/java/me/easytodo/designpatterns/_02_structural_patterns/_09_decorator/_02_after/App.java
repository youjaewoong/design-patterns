package me.easytodo.designpatterns._02_structural_patterns._09_decorator._02_after;

/**
 * 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴
 * 상속이 아닌 위임을 사용해서 보다 유연하게(런타임에) 부가 기능을 추가하는 것도 가능하다
 * 장점
 *  - 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다.
 *  - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다.
 * 단점
 *  - 데코레이터를 조합하는 코드가 복잡할 수 있다.
 *  
 *  
 *  CommentService 하위 인터페이스
 *   - {@link DefaultCommentService} CommentService 의 일을 수행
 *   - {@link CommentDecorator} wapper class
 *    - {@link SpamFilteringCommentDecorator} 상속
 *    - {@link TrimmingCommentDecorator} 상속
 */
public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
    	
    	//클라이언트의 로직 변경 없이 교환가능하게 처리한다.
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("이지투두");
        client.writeComment("앞으로의 방향성은?");
        client.writeComment("http://easytodo.me");
    }
}
