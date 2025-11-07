.PHONY: build

testbuild: build
	java -jar UtilsForArrays.jar

build: UtilsForArrays.class
	jar cvfm UtilsForArrays.jar manifest.txt project/UtilsForArrays.class

test: UtilsForArrays.class
	java project.UtilsForArrays

UtilsForArrays.class: project/UtilsForArrays.java
	javac project/UtilsForArrays.java  
