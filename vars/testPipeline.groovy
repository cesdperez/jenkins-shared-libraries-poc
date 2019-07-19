def call(body) {
    // evaluate the body block, and collect configuration into the object
    def params = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = params
    body()

    pipeline {
        agent {
            node {
                label "${params.node}"
            }
        }
        stages {
            stage('stage 1') {
                steps {
                    sh "echo This is stage 1 for application ${params.application}"
                }
            }
            stage('stage 2') {
                steps {
                    sh "echo This is stage 2 for application ${params.application}"
                }
            }
            stage('stage 3') {
                steps {
                    sh "echo This is stage 3 for application ${params.application}"
                }
            }
        }
    }
}
