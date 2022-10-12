package me.easytodo.designpatterns._03_behavioral_patterns._20_state._02_after;

public interface State {

	// 리뷰등록
    void addReview(String review, Student student);

    // 학생등록
    void addStudent(Student student);
}
