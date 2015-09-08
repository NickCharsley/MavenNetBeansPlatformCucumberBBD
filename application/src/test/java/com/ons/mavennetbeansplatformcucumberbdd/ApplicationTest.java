package com.ons.mavennetbeansplatformcucumberbdd;

//import java.util.logging.Level;
import java.util.logging.Level;
import junit.framework.Test;
import org.netbeans.jellytools.NbDialogOperator;
import org.netbeans.jellytools.actions.ActionNoBlock;
import org.netbeans.junit.NbModuleSuite;
import org.netbeans.junit.NbTestCase;

public class ApplicationTest extends NbTestCase {
/** /
    public static Test suite() {
        return NbModuleSuite.allModules(ApplicationTest.class);
    }
/**/
    
    /**
     * This only works with GUI and enableClasspathModules = True
     * @return Test
     */
    public static Test suite() {
        return NbModuleSuite.createConfiguration(ApplicationTest.class).
                gui(true).
                failOnMessage(Level.WARNING). // works at least in RELEASE71
                failOnException(Level.INFO).
                enableClasspathModules(true). 
                clusters(".*").
                suite(); // RELEASE71+, else use NbModuleSuite.create(NbModuleSuite.createConfiguration(...))
    }

    /**
     * 
     * @param n
     */
    public ApplicationTest(String n) {
        super(n);
    }

    /**
     * Example of test using Jelly Tools
     */
    public void testApplication() {
        // pass if there are merely no warnings/exceptions
        /* Example of using Jelly Tools (additional test dependencies required) with gui(true):*/
        new ActionNoBlock("Help|About", null).performMenu();
        new NbDialogOperator("About").closeByButton();
        /**/
    }
}
