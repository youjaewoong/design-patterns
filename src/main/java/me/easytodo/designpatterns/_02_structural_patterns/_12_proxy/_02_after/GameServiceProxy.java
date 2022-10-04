package me.easytodo.designpatterns._02_structural_patterns._12_proxy._02_after;

public class GameServiceProxy implements GameService {

	//subject type
    private GameService gameService;

    //proxy 처리
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
