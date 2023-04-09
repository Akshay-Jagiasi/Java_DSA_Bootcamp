@echo off
javac -d bin src\%1.java
cd bin
java %1
cd ..
