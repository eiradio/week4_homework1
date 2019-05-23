package tw.controllers;


import org.junit.Test;
import tw.commands.InputCommand;
import tw.core.Game;
import tw.views.GameView;

import java.io.IOException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {


    @Test
    public void testPlay() throws IOException{
        Game game = mock(Game.class);
        GameView gameView = mock(GameView.class);
        InputCommand inputCommand = mock(InputCommand.class);
        GameController gameController = new GameController(game, gameView);

        when(game.checkCoutinue()).thenReturn(true, false);
        gameController.play(inputCommand);


    }

}