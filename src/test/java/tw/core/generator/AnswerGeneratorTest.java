package tw.core.generator;


import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {

    @Test
    public void testGenerate() throws OutOfRangeAnswerException{
        String RandomNumStr = "1 2 3 4";
        RandomIntGenerator randomIntGenerator = mock(RandomIntGenerator.class);
        when(randomIntGenerator.generateNums(9, 4)).thenReturn(RandomNumStr);
        AnswerGenerator answerGenerator = new AnswerGenerator(randomIntGenerator);
        Assert.assertEquals(answerGenerator.generate().toString(),Answer.createAnswer(RandomNumStr).toString());

    }
}

