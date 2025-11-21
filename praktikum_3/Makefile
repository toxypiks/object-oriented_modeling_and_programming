.PHONY: build

testbuild: build
	java -jar GeometrischeObjekteMain.jar

build: GeometrischeObjekteMain.class
	jar cvfm GeometrischeObjekteMain.jar manifest.txt project/GeometrischeObjekteMain.class project/GeometrischesObjektException.class project/Wuerfel.class project/Quader.class project/GeometrischesObjekt.class project/GeometrischeObjekte.class

test: GeometrischeObjekteMain.class
	java project/GeometrischeObjekteMain

GeometrischeObjekteMain.class: project/GeometrischeObjekteMain.java project/GeometrischesObjektException.java project/Wuerfel.java project/Quader.java project/GeometrischesObjekt.java project/GeometrischeObjekte.java
	javac project/GeometrischeObjekteMain.java project/GeometrischesObjektException.java project/Wuerfel.java project/Quader.java project/GeometrischesObjekt.java project/GeometrischeObjekte.java   
