import com.lesfurets.jenkins.unit.*
import org.junit.Before
import org.junit.Test

class TestPipelineTest extends BasePipelineTest {

    def testPipeline

    @Before
    void setUp() {
        super.setUp()
        testPipeline = loadScript("vars/testPipeline.groovy")
    }

    @Test
    void testCall() {
        def result = testPipeline(node: "n", application: "app")
        printCallStack()
    }
}