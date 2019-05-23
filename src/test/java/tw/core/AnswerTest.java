package tw.core;
import org.junit.Assert;
import org.junit.Test;
import tw.core.model.Record;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    List<String> list = Arrays.asList("1", "2", "3", "4");
    Answer answer = new Answer();


    @Test
    public void testCreateAnswer(){
        String listStr = "1 2 3 4";
        answer.setNumList(list);
        Assert.assertEquals(Answer.createAnswer(listStr).toString(), answer.toString());
    }


    @Test
    public void testValidate(){
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        answer.setNumList(list);

    }


    @Test
    public void testCheck(){
        Record record = mock(Record.class);
        when(record.getValue()).thenReturn("1A0B");
        answer.setNumList(list);
        Assert.assertEquals(answer.check(Answer.createAnswer("1 5 6 7")).getValue(),record.getValue());
    }


    @Test
    public void testGetIndexOfNum(){
        answer.setNumList(list);
        for (int i = 0;i < list.size();i++) {
            Assert.assertEquals(answer.getIndexOfNum(String.valueOf(list.get(i))), i);
        }
    }

    @Test
    public void testToString(){
        answer.setNumList(list);
        Assert.assertEquals(answer.toString(), "1 2 3 4");
    }


}