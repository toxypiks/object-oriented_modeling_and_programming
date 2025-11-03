.PHONY: test

testbuild: build
	java -jar Kugeln.jar

build: Kugeln.class
	jar cvfm Kugeln.jar manifest.txt geometrie/Kugeln.class geometrie/Kugel.class

test: Kugeln.class
	java geometrie.Kugeln

Kugeln.class: geometrie/Kugeln.java geometrie/Kugel.java
	javac geometrie/Kugeln.java geometrie/Kugel.java 
