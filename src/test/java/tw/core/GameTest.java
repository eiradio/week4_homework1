package tw.core;

import org.junit.Assert;
import org.junit.Test;
import tw.core.generator.AnswerGenerator;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static tw.core.GameStatus.*;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    AnswerGenerator answerGenerator = mock(AnswerGenerator.class);

    @Test
    public void testGuess() throws Exception{
        when(answerGenerator.generate()).thenReturn(Answer.createAnswer("1 2 3 4"));
        Game game = new Game(answerGenerator);
        Assert.assertEquals(game.guess(Answer.createAnswer("1 3 4 5")).getResult(), "1A2B");
    }



    @Test
    public void testCheckStatus() throws Exception{
        when(answerGenerator.generate()).thenReturn(Answer.createAnswer("1 2 3 4"));
        Game game = new Game(answerGenerator);
        for (int i = 0;i < 4;i++){
            game.guess(Answer.createAnswer("1 1 3 4"));
            Assert.assertEquals(game.checkStatus(),CONTINUE);
        }
        game.guess(Answer.createAnswer("1 2 3 4"));
        Assert.assertEquals(game.checkStatus(), SUCCESS);

        game.guess(Answer.createAnswer("1 2 3 4"));
        Assert.assertEquals(game.checkStatus(), FAIL);

    }

}
