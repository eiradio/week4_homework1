package tw.core;

import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    @Test(expected = IllegalArgumentException.class)
    public void testGenerateNums(){
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        System.out.println(randomIntGenerator.generateNums(9,4));
        System.out.print(randomIntGenerator.generateNums(4,4));
        System.out.print(randomIntGenerator.generateNums(3, 4));
    }
}