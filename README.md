# commons-console

[![Build Status: Linux](https://travis-ci.org/ciwise/commons-console.svg?branch=master)](https://travis-ci.org/ciwise/commons-console)

## Introduction

The commons-console project here is a JAR package library that is used to help with console output with command-line Java applications. More documentation will follow. 

## Usage

The POM is deployed with the JAR to the Maven Central Repository and can therefore be used by just adding the following
snippet to your new project's pom.xml file..

```xml
<parent>
  <groupId>org.ciwise.commons</groupId>
  <artifactId>commons-console</artifactId>
  <version>${version}</version>
</parent>
```

You can find the latest version in GitHub releases.

## Project Versioning and Updates

The first publicly announced release will be 0.1.0. Following versions will always
use http://semver.org[semantic versioning]. Whenever one of the referenced 
dependencies upgrades a major version, this project will upgrade major version by one. 
The same process will be followed with minor as well as bugfix versions. 

We will also aim for a regular release schedule aiming initially for at least every 3 
months, ideally every month, as well as ad hoc releases whenever often used plugins
or dependencies provide important updates. 

More details about changes between versions are available from the 
https://github.com/ciwise/commons-console/blob/master/CHANGELOG.md[changelog]

## License

Apache License, Version 2.0

For full text see LICENSE.txt file or http://www.apache.org/licenses/LICENSE-2.0
 
##Contributions

Send a pull request or report issues on GitHub. Forking this project and sending
pull requests is preferred.

## Development

You can check for new plugins and versions with:

```
$ mvn versions:display-plugin-updates
$ mvn versions:display-property-updates
```

Deployment and releases are done using Maven on this project with the release to
reside in the Central Repository.

- further command-line details will come after the 1.0.0 release.

## Current Team 
- David L. Whitehurst http://www.dlwhitehurst.com

## Known projects using this library project

This is appropriately licensed to be easily used by commercial and open source 
projects alike. Please let us know if you are using this project and would like 
to be listed here.


