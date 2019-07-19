def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()
    

    pipeline {
        agent any()
        stages{
            stage('stage 1'){
                sh 'echo This is stage 1'
            }
            stage('stage 2'){
                sh 'echo This is stage 2'
            }
            stage('stage 3'){
                sh 'echo This is stage 3'
            }
        }
    }
}
