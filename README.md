# Jenkins Shared Libraries POC

These are the results of an afternoon trying to setup a repository for [Jenkins Shared Libraries](https://jenkins.io/doc/book/pipeline/shared-libraries/).

- Gradle setup for recognizing the structure imposed by Shared Libraries.
- Unit test libraries and small examples for testing global vars and also pipelines.

These article series are the most relevant and up to date I found: https://mtijhof.wordpress.com/2019/05/06/jenkins-testing-a-full-declarative-pipeline-in-your-shared-library/

Relevant libraries used for testing:
- [jenkins-pipeline-unit](https://github.com/jenkinsci/JenkinsPipelineUnit)
- [pipeline-unit](https://github.com/macg33zr/pipelineUnit)