# algorithms_tasks
Solving algorithms tasks with java.

## Getting Started

Each completed algorithm task has @Test method to define algorithm works correctly.

### Prerequisites:

You need to be installed on your machine:
* [Java 8](https://www.java.com/en/download/help/index_installing.xml)
* [Maven](http://maven.apache.org/download.cgi)

### Installing:

* Make sure you JAVA_HOME path is [defined](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/).
* [Add](http://maven.apache.org/install.html) mvn to the PATH

Verify succesfull instalation: 
```
java --version
```
```
mvn -v
```
Update local path to testng.xml in pom.xml file. Example:
```
<suiteXmlFile>/Users/vlady/algorithms_tasks/src/test/resources/testng.xml</suiteXmlFile>
```
## Running the tests

Run all algorithm's tests with the command:
```
mvn test
```
Run specific algorithm test with the command:
```
mvn -Dtest={{classname}} test
```
