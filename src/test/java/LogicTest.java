import Exceptions.NotAValidMonthException;
import Exceptions.NotAValidYearException;
import Logic.Logic;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static Logic.Logic.getNumDaysinMonth;
import static Logic.Logic.getReimbursement;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;

public class LogicTest {

   @Test
   @Ignore("Fail Test")
   public void FailTest()
   {
      fail();
   }

   @Test
   public void FailYearNegativeFiveTest()
   {
       try {
           getNumDaysinMonth(1,-5);
           fail("Expected an exception");
       } catch (NotAValidMonthException e) {
           fail("Expected a NotAValidYearException");
       } catch (NotAValidYearException e) {
           Assert.assertThat(e.getMessage(), is("Given year is not a valid year"));
       }
   }


    @Test
    public void FailYearNegativeTwoTest()
    {
        try {
            getNumDaysinMonth(1,-2);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            fail("Expected a NotAValidYearException");
        } catch (NotAValidYearException e) {
            Assert.assertThat(e.getMessage(), is("Given year is not a valid year"));
        }
    }

    @Test
    public void FailYearNegativeOneTest()
    {
        try {
            getNumDaysinMonth(1,-1);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            fail("Expected a NotAValidYearException");
        } catch (NotAValidYearException e) {
            Assert.assertThat(e.getMessage(), is("Given year is not a valid year"));
        }
    }

    @Test
    public void JanYearZeroTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(1,0) , is(31));

        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void JanYearOneTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(1,1) , is(31));

        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void JanYearTwoTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(1,2) , is(31));

        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void JanYearEigthTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(1,8) , is(31));

        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    //Max values for years are int max and are this handled by Java


    @Test
    public void FailMonthNegativeFiveTest()
    {
        try {
            getNumDaysinMonth(-5,8);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            Assert.assertThat(e.getMessage(), is("Given month is not a valid month!"));
        } catch (NotAValidYearException e) {
            fail("Expected a NotAValidMonthException");
        }
    }

    @Test
    public void FailMonthNegativeOneTest()
    {
        try {
            getNumDaysinMonth(-1,8);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            Assert.assertThat(e.getMessage(), is("Given month is not a valid month!"));
        } catch (NotAValidYearException e) {
            fail("Expected a NotAValidMonthException");
        }
    }
    @Test
    public void FailMonthZeroTest()
    {
        try {
            getNumDaysinMonth(0,8);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            Assert.assertThat(e.getMessage(), is("Given month is not a valid month!"));
        } catch (NotAValidYearException e) {
            fail("Expected a NotAValidMonthException");
        }
    }
    @Test
    public void MonthOneTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(1,8), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void MonthTwoTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(2,8), is(29));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void MonthSixTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(6,8), is(30));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void MonthTenTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(10,10), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void MonthElevenTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(11,8), is(30));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void MonthTwelveTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(12,8), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void FailMonthThirteenTest()
    {
        try {
            getNumDaysinMonth(13,8);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            Assert.assertThat(e.getMessage(), is("Given month is not a valid month!"));
        } catch (NotAValidYearException e) {
            fail("Expected a NotAValidMonthException");
        }
    }
    @Test
    public void FailMonthFourteenTest()
    {
        try {
            getNumDaysinMonth(14,8);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            Assert.assertThat(e.getMessage(), is("Given month is not a valid month!"));
        } catch (NotAValidYearException e) {
            fail("Expected a NotAValidMonthException");
        }
    }

    @Test
    public void FailMonthEighteenTest()
    {
        try {
            getNumDaysinMonth(18,8);
            fail("Expected an exception");
        } catch (NotAValidMonthException e) {
            Assert.assertThat(e.getMessage(), is("Given month is not a valid month!"));
        } catch (NotAValidYearException e) {
            fail("Expected a NotAValidMonthException");
        }
    }



    @Test
    public void EqMonthJanTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(1,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void EqMonthFebNonLeapTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(2,2017), is(28));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void EqMonthFebLeapTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(2,2016), is(29));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void EqMonthMarTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(3,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void EqMonthAprTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(4,2016), is(30));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthMayTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(5,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthJunTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(6,2016), is(30));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthJulTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(7,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthAugTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(8,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthSepTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(9,2016), is(30));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthOctTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(10,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthNovTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(11,2016), is(30));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }

    @Test
    public void EqMonthDecTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(12,2016), is(31));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }



    @Test
    public void EqYearNonLeapTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(2,1900), is(28));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }
    @Test
    public void EqYearLeapTest()
    {
        try {
            Assert.assertThat(getNumDaysinMonth(2,2000), is(29));
        } catch (NotAValidMonthException e) {
            fail("Did not expect an exception");
        } catch (NotAValidYearException e) {
            fail("Did not expect an exception");
        }
    }




    @Test
    public void DTDeductibleMetDoctor()
    {
        Assert.assertThat(getReimbursement(true, Logic.VisitType.Doctor), is(50));
    }

    @Test
    public void DTDeductibleMetHospital()
    {
        Assert.assertThat(getReimbursement(true, Logic.VisitType.Hospital), is(80));
    }

    @Test
    public void DTDeductibleNotMetDoctor()
    {
        Assert.assertThat(getReimbursement(false, Logic.VisitType.Doctor), is(0));
    }

    @Test
    public void DTDeductibleNotMetHospital()
    {
        Assert.assertThat(getReimbursement(false, Logic.VisitType.Hospital), is(0));
    }
}
