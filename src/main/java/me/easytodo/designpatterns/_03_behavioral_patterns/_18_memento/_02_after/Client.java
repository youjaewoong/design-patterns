package me.easytodo.designpatterns._03_behavioral_patterns._18_memento._02_after;


/**
 * 캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 방법
 * 
 */

//careTaker
public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        //복원을 할 경우
        game.restore(save);

        //상태정보를 복원한다
        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
