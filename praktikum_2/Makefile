.PHONY: build

testbuild: build
	java -jar PythagoraeischeZahltripelMain.jar

build: PythagoraeischeZahltripelMain.class
	jar cvfm PythagoraeischeZahltripelMain.jar manifest.txt project/PythagoraeischeZahltripelMain.class project/PythagoraeischeZahlentripel.class project/UtilsForArrays.class

test: PythagoraeischeZahltripelMain.class
	java project/PythagoraeischeZahltripelMain

PythagoraeischeZahltripelMain.class: project/PythagoraeischeZahltripelMain.java project/PythagoraeischeZahlentripel.java project/UtilsForArrays.java
	javac project/PythagoraeischeZahltripelMain.java project/PythagoraeischeZahlentripel.java project/UtilsForArrays.java  
