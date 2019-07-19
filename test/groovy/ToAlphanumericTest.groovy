import org.junit.*
import com.lesfurets.jenkins.unit.*
import static groovy.test.GroovyAssert.*

class ToAlphanumericTest extends BasePipelineTest {
    def toAlphanumeric

    @Before
    void setUp() {
        super.setUp()
        toAlphanumeric = loadScript("vars/toAlphanumeric.groovy")
    }

    @Test
    void testCall() {
        def result = toAlphanumeric(text: "a_B-c.1")
        assertEquals "result:", "abc1", result
    }
}
