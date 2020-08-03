#!/bin/sh
for b in `git branch --list|sed 's/\*//g'`
do
    echo $b   	
    git checkout $b
    git log -Sliquibase
done
