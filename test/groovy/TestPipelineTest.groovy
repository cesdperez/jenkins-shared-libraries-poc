import testSupport.PipelineSpockTestBase

class TestPipelineTest extends PipelineSpockTestBase {

    def testPipeline

    def setup() {
        testPipeline = loadScript("vars/testPipeline.groovy")
    }

    def cleanup() {
        printCallStack()
    }

    def 'It works'() {
        when:
        testPipeline(node: "n", application: "app")

        then:
        assertJobStatusSuccess()
    }
}