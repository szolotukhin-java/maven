#### patterns_maven

    This repository contains projects based on maven build system
    
#### Open questions
     
    JAXB: What is XJB files? How to use them ?
    
#### TODO:

    1. Bean validation with org.codehaus.mojo:jaxb2-maven-plugin   

#### How we can monitor the docker engine 

    docker events

https://docs.docker.com/engine/reference/commandline/events/

#### How to create Jenkins pipeline

#### Maven command line config
https://blog.jdriven.com/2023/04/mastering-maven-setting-default-maven-options-with-maven-config/

https://maven.apache.org/ref/3.1.0/maven-embedder/cli.html

##### 

C:\soft\java-20\bin\java.exe 
-ea 
-Didea.test.cyclic.buffer.size=8388608 
-javaagent:C:\soft\IntelliJ_IDEA_2023.1\lib\idea_rt.jar=56378:C:\soft\IntelliJ_IDEA_2023.1\bin 
-Dfile.encoding=UTF-8 
-Dsun.stdout.encoding=UTF-8 
-Dsun.stderr.encoding=UTF-8 
-classpath 
C:\Users\szolotukhin\.m2\repository\org\junit\platform\junit-platform-launcher\1.10.2\junit-platform-launcher-1.10.2.jar;
C:\soft\IntelliJ_IDEA_2023.1\lib\idea_rt.jar;
C:\soft\IntelliJ_IDEA_2023.1\plugins\junit\lib\junit5-rt.jar;
C:\soft\IntelliJ_IDEA_2023.1\plugins\junit\lib\junit-rt.jar;
D:\projects-java\_maven\maven-single-module-sandbox\target\test-classes;
D:\projects-java\_maven\maven-single-module-sandbox\target\classes;
C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.2\junit-jupiter-5.10.2.jar;
C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.2\junit-jupiter-api-5.10.2.jar;
C:\Users\szolotukhin\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;
C:\Users\szolotukhin\.m2\repository\org\junit\platform\junit-platform-commons\1.10.2\junit-platform-commons-1.10.2.jar;
C:\Users\szolotukhin\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;
C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.2\junit-jupiter-params-5.10.2.jar;
C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.2\junit-jupiter-engine-5.10.2.jar;
C:\Users\szolotukhin\.m2\repository\org\junit\platform\junit-platform-engine\1.10.2\junit-platform-engine-1.10.2.jar 

com.intellij.rt.junit.JUnitStarter 

-ideVersion5 
-junit5 
@w@C:\Users\szolotukhin\AppData\Local\Temp\idea_working_dirs_junit.tmp
@C:\Users\szolotukhin\AppData\Local\Temp\idea_junit.tmp

junit-5-parameterized-test

https://dzone.com/articles/integration-tests-with-maven

ERROR Command was 
cmd.exe /X /C "C:\soft\java-20\bin\java 
-jar C:\Users\szolotukhin\AppData\Local\Temp\surefire12223766112180281575\surefirebooter-20241218204802567_3.jar 
C:\Users\szolotukhin\AppData\Local\Temp\surefire12223766112180281575 
2024-12-18T20-48-02_478-jvmRun1 
surefire-20241218204802567_1tmp 
surefire_0-20241218204802567_2tmp"

=======================================================================================================================
Writing properties to 
{
classPathUrl.4=C:\Users\szolotukhin\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar, 
testSuiteDefinitionTestSourceDirectory=D:\projects-java\_maven\maven-single-module-sandbox\src\test\java, 
classPathUrl.5=C:\Users\szolotukhin\.m2\repository\org\junit\platform\junit-platform-commons\1.10.2\junit-platform-commons-1.10.2.jar, 
runOrder=filesystem, 
tc.3=ua.in.sz.swing.ApplicationTest, 
classPathUrl.6=C:\Users\szolotukhin\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar, 
tc.4=ua.in.sz.swing.AppTest, 
classPathUrl.7=C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.2\junit-jupiter-params-5.10.2.jar, 
tc.1=ua.in.sz.swing.App02Test, 
classPathUrl.8=C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.2\junit-jupiter-engine-5.10.2.jar, 
reportsDirectory=D:\projects-java\_maven\maven-single-module-sandbox\target\surefire-reports, 
tc.2=ua.in.sz.swing.App03Test, 
classPathUrl.9=C:\Users\szolotukhin\.m2\repository\org\junit\platform\junit-platform-engine\1.10.2\junit-platform-engine-1.10.2.jar, 
forkNumber=3, 
tc.0=ua.in.sz.swing.App01Test, 

surefireClassPathUrl.0=C:\Users\szolotukhin\.m2\repository\org\apache\maven\surefire\surefire-junit-platform\3.5.3-SNAPSHOT\surefire-junit-platform-3.5.3-SNAPSHOT.jar, 
classPathUrl.0=D:\projects-java\_maven\maven-single-module-sandbox\target\test-classes, 
mainCliOptions0=LOGGING_LEVEL_ERROR, 
systemExitTimeout=30, 
classPathUrl.1=D:\projects-java\_maven\maven-single-module-sandbox\target\classes, 
failFastCount=0, 
classPathUrl.2=C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.2\junit-jupiter-5.10.2.jar, 
requestedTest=, 
mainCliOptions2=LOGGING_LEVEL_INFO, 
classPathUrl.3=C:\Users\szolotukhin\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.2\junit-jupiter-api-5.10.2.jar, 
mainCliOptions1=LOGGING_LEVEL_WARN, 
testClassesDirectory=D:\projects-java\_maven\maven-single-module-sandbox\target\test-classes, 
preferTestsFromInStream=true, 
useManifestOnlyJar=true, 
runStatisticsFile=D:\projects-java\_maven\maven-single-module-sandbox\.surefire-7AF5484091329AA55E7970A2DD642B0D3ED1FDF9, 
providerConfiguration=org.apache.maven.surefire.junitplatform.JUnitPlatformProvider, 
rerunFailingTestsCount=0, 
isTrimStackTrace=false, 
surefireClassPathUrl.5=C:\Users\szolotukhin\.m2\repository\org\junit\platform\junit-platform-launcher\1.10.2\junit-platform-launcher-1.10.2.jar, 
forkNodeConnectionString=pipe://3, 
surefireClassPathUrl.3=C:\Users\szolotukhin\.m2\repository\org\apache\maven\surefire\surefire-shared-utils\3.5.3-SNAPSHOT\surefire-shared-utils-3.5.3-SNAPSHOT.jar, 
surefireClassPathUrl.4=C:\Users\szolotukhin\.m2\repository\org\apache\maven\surefire\common-java5\3.5.3-SNAPSHOT\common-java5-3.5.3-SNAPSHOT.jar, 
surefireClassPathUrl.1=C:\Users\szolotukhin\.m2\repository\org\apache\maven\surefire\surefire-api\3.5.3-SNAPSHOT\surefire-api-3.5.3-SNAPSHOT.jar, 
surefireClassPathUrl.2=C:\Users\szolotukhin\.m2\repository\org\apache\maven\surefire\surefire-logger-api\3.5.3-SNAPSHOT\surefire-logger-api-3.5.3-SNAPSHOT.jar, 
enableAssertions=true, childDelegation=false, 
pluginPid=98028, 
useSystemClassLoader=true, 
shutdown=EXIT
}


