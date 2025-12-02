https://maven.apache.org/surefire/maven-surefire-plugin/examples/fork-options-and-parallel-execution.html

https://www.baeldung.com/ops/jenkins-pipeline-clean-workspace
https://klotzandrew.com/blog/parallel-bash-with-wait/#:~:text=Parallel%20processing%20in%20bash%20is,exit%20codes%20in%20an%20array:

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <configuration>
        <forkCount>4</forkCount>
        <reuseForks>true</reuseForks>
        <parallel>classes</parallel>
        <threadCount>1</threadCount>
        <argLine> … </argLine>
    </configuration>
</plugin>