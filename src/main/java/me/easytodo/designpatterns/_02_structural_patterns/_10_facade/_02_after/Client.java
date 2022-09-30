package me.easytodo.designpatterns._02_structural_patterns._10_facade._02_after;

/**
 * 복잡한 서브 시스템 의존성을 최소화하는 방법
 * 클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할수 있다.
 * 장점
 * - 서브 시스템에 대한 의존성을 한곳으로 모을 수 있다.
 * 단점
 * - 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다.
 */
public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("jaewoong");
        emailMessage.setTo("easytodo");
        emailMessage.setCc("일남");
        emailMessage.setSubject("쉽게 접근");
        emailMessage.setText("밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
        
    }
}
