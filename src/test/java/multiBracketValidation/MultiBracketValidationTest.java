package multiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void mbv_testCurlyBrackets(){
        assertTrue("Should return true", MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void mbv_testSquareBrackets(){
        assertTrue("Should return true", MultiBracketValidation.multiBracketValidation("[]"));
    }

    @Test
    public void mbv_testParenthesisBrackets(){
        assertTrue("Should return true", MultiBracketValidation.multiBracketValidation("()"));
    }

    @Test
    public void mbv_testAllBrackets(){
        assertTrue("Should return true", MultiBracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void mbv_testMixedBrackets(){
        assertTrue("Should return true", MultiBracketValidation.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void mbv_testUnbalancedBrackets(){
        assertFalse("Should return false", MultiBracketValidation.multiBracketValidation("[({}]"));
    }

    @Test
    public void mbv_testSingleUnbalancedBrackets(){
        assertFalse("Should return False", MultiBracketValidation.multiBracketValidation("(]("));
    }

    @Test
    public void mbv_testCurlyBracketsWithText(){
        assertTrue("Should return true", MultiBracketValidation.multiBracketValidation("{Hello}"));
    }



}