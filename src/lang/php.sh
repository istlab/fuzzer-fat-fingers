#!/bin/sh
#
# Language-specific functionality for compiling and running
# the specified source file
#

compile_php()
{
	php -l $1
}

run_php()
{
	php $1
}
