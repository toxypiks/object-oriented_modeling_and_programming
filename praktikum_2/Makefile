.PHONY: build

testbuild: build
	java -jar PythagoraeischeZahlentripel.jar

build: PythagoraeischeZahlentripel.class
	jar cvfm PythagoraeischeZahlentripel.jar manifest.txt project/PythagoraeischeZahlentripel.class project/UtilsForArrays.class

test: PythagoraeischeZahlentripel.class
	java project.PythagoraeischeZahlentripel

PythagoraeischeZahlentripel.class: project/PythagoraeischeZahlentripel.java project/UtilsForArrays.java
	javac project/PythagoraeischeZahlentripel.java project/UtilsForArrays.java  
