package me.easytodo.designpatterns._03_behavioral_patterns._20_state._02_after;

/**
 * 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 패턴.
 * 상태에 특화된 행동들을 분리해 낼 수 있으며, 새로운 행동을 추가하더라도 다른 행동에 영향을 주지 않는다
 * 장점
 * - 상태에 따른 동작을 개별 클래스로 옮겨서 관리할 수 있다.
 * - 기존의 특정 상태에 따른 동작을 변경하지 않고 새로운 상태에 다른 동작을 추가할 수 있다.
 * - 코드 복잡도를 줄일 수 있다.
 * 단점
 * - 복잡도가 증가한다
 */
public class Client {

    public static void main(String[] args) {
    	
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("easytodo");
        Student hardtodo = new Student("hardtodo");
        
        // Draft 등록 
        hardtodo.addPrivate(onlineCourse);

        // 추가
        onlineCourse.addStudent(student);
        
        // 리뷰가능 상태 변경
        onlineCourse.changeState(new Private(onlineCourse));

        // 리뷰가능
        onlineCourse.addReview("hello", student);
        
        onlineCourse.addStudent(hardtodo);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
