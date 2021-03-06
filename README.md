Java Native Runtime Constants
=============================================
[![Build Status](https://travis-ci.org/jnr/jnr-constants.svg?branch=master)](https://travis-ci.org/jnr/jnr-constants)

Overview
--------

This project contains Java enums for common POSIX constants.  It is predominately used to make calls into jnr-posix
far simpler.

Adding Constants
----------------

If you want to add new constants to the project, note that all the Java source code is generated.  The gen/ directory
contains Ruby code to declare the constants you want.  The constant values themselves are exctracted by inspection.
In order to do so, the code generator will compile a small program that outputs the values of the constants as discovered
in declared header files.  When the program is run, the output is parsed, and these are the values that are used when
generating the Java source.

To run the code generator, you must have Rake installed in Ruby 1.9+.  There are three tasks you must run in order to
generate all the necessary files:

    $ rake generate:xplatform
    $ rake generate:platform
    $ rake generate:fake

The _generate:xplatform_ variant generates the top-level enum file.  While this contains the necessary fields, it does
not contain the integer values for those fields.  The values lookup is delegated to either an OS-specific (and possibly
architecture-specific) implementation or a so-called "fake" implementation.

To generate the OS-specific file, you use the _generate:platform_ task.  This must be run on each platform you'd like
to generate the files for.  As that can be cumbersome and you might not have access to a machine running each OS, you
should also generate the "fake" implementation as a fail-safe.  The _generate:fake_ task is responsible for that.

The generated files are version-controlled.  Please remember to commit them in addition to the Ruby templates for the
generator.

Building
--------

The project is maven-based.  It uses standard maven lifecycle events.  To build the code:

    $ mvn package

To install the code into your local maven repository:

    $ mvn install

To push snapshots out to Sonatype (you must have the necessary permissions):

    $ mvn deploy
