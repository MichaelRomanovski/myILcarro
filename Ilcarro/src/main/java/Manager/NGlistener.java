package Manager;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class NGlistener implements HelperBase, ITestListener

{

    @Override
    public void onTestStart(ITestResult test) {
        ITestListener.super.onTestStart(test);
        logger.info("Test started " + test.getName());

    }

    @Override
    public void onTestSuccess(ITestResult test) {
        ITestListener.super.onTestSuccess(test);
        logger.info("Test successful " + test.getName());


    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        logger.info("Test failed " + result.getThrowable().fillInStackTrace());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        logger.info("Test finished " + context.getName());
    }
}
