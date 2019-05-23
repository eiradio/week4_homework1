package tw.core;

import org.junit.Assert;
import org.junit.Test;
import tw.validator.InputValidator;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    InputValidator inputValidator = new InputValidator();

    @Test
    public void testValidate(){
        Assert.assertTrue(inputValidator.validate("1 2 3 4"));
        Assert.assertFalse(inputValidator.validate("12 3 4"));
    }



}
